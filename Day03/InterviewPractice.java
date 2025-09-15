/*
Q1: What is Inversion of Control (IoC)?
A: IoC is a design principle where the control of object creation and dependency management
   is transferred from the developer to the Spring container.

Q2: Difference between DI and IoC?
A: IoC is the broader principle. DI is the specific implementation where Spring injects dependencies.

Q3: Field vs Constructor vs Setter Injection?
- Field: Quick, but less testable and harder to mock (anti-pattern in large apps).
- Constructor: Best practice, ensures immutability, easy testing.
- Setter: Useful for optional dependencies.

Q4: How does Spring resolve multiple beans of same type?
A: By using @Primary or @Qualifier annotations.

Q5: How do you handle circular dependencies?
A: Break design, or use setter injection, or @Lazy annotation.

Q6: Why is constructor injection recommended at architect level?
A: Because it enforces immutability, makes beans mandatory at startup,
   improves testability, and reduces NullPointerExceptions.

Q7: How does DI improve scalability in microservices?
A: DI abstracts service implementations, allowing easy swapping (ex: PaymentService → different gateways).
*/
