// Exercise 1: Field Injection (not recommended in modern practice)
@Service
public class EmailService {
    public void sendEmail(String message) {
        System.out.println("Sending email: " + message);
    }
}

@RestController
public class NotificationController {
    @Autowired // Field Injection
    private EmailService emailService;

    @GetMapping("/notify")
    public String notifyUser() {
        emailService.sendEmail("Hello via Email!");
        return "Notification Sent!";
    }
}

// Exercise 2: Constructor Injection (Preferred)
@Service
public class SMSService {
    public void sendSMS(String message) {
        System.out.println("Sending SMS: " + message);
    }
}

@RestController
public class AlertController {
    private final SMSService smsService;

    @Autowired
    public AlertController(SMSService smsService) { // Constructor Injection
        this.smsService = smsService;
    }

    @GetMapping("/alert")
    public String alertUser() {
        smsService.sendSMS("System Alert!");
        return "Alert Sent!";
    }
}

// Exercise 3: Multiple Implementations
public interface PaymentService {
    String pay(double amount);
}

@Service("creditCardPayment")
public class CreditCardPayment implements PaymentService {
    public String pay(double amount) {
        return "Paid " + amount + " using Credit Card.";
    }
}

@Service("upiPayment")
public class UpiPayment implements PaymentService {
    public String pay(double amount) {
        return "Paid " + amount + " using UPI.";
    }
}

@RestController
public class PaymentController {
    private final PaymentService paymentService;

    @Autowired
    public PaymentController(@Qualifier("upiPayment") PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @GetMapping("/pay")
    public String makePayment() {
        return paymentService.pay(2500);
    }
}
