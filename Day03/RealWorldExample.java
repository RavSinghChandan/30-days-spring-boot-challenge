public interface NotificationService {
    void notifyUser(String message);
}

@Service("emailNotification")
public class EmailNotification implements NotificationService {
    public void notifyUser(String message) {
        System.out.println("Email: " + message);
    }
}

@Service("smsNotification")
public class SMSNotification implements NotificationService {
    public void notifyUser(String message) {
        System.out.println("SMS: " + message);
    }
}

@Service("pushNotification")
public class PushNotification implements NotificationService {
    public void notifyUser(String message) {
        System.out.println("Push: " + message);
    }
}

@RestController
@RequestMapping("/notify")
public class NotificationController {

    private final Map<String, NotificationService> serviceMap;

    @Autowired
    public NotificationController(List<NotificationService> services) {
        this.serviceMap = services.stream()
                .collect(Collectors.toMap(
                        s -> s.getClass().getSimpleName(),
                        s -> s));
    }

    @GetMapping("/{type}")
    public String notify(@PathVariable String type) {
        NotificationService service = serviceMap.get(type);
        if (service != null) {
            service.notifyUser("Hello from " + type);
            return "Notification sent via " + type;
        }
        return "Unknown notification type";
    }
}
