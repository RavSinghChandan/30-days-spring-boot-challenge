# 30 Days Spring Boot Challenge

Welcome to the 30-Day Spring Boot learning journey. Each day includes:

- `Notes.md`: Core concepts and theory
- `RealWorldExample.java`: Hands-on code
- `InterviewPractice.java`: Interview-level questions
- `Exercises.java`: Practice problems
- `Reflection.md`: Learning notes

Spend 30–45 minutes daily. Complete all files for each day.

By Day 30, you'll be able to build, test, secure, and deploy Spring Boot applications with confidence.

## 📚 Daily Learning Path

### Day 01: Spring Boot Introduction
- What is Spring Boot?
- Why Spring Boot over Spring?
- Build your first Spring Boot project manually and using Spring Initializr

### Day 02: Project Structure & Annotations
- What are the key Spring Boot annotations?
- Explain @SpringBootApplication, @Component, @Autowired
- Create a service using @Component and inject it

### Day 03: Dependency Injection (DI)
- What is DI and IoC in Spring Boot?
- Difference between field, constructor, and setter injection
- Create a simple DI example with multiple services

### Day 04: Spring Bean Lifecycle
- What is the lifecycle of a Spring Bean?
- Use @PostConstruct, @PreDestroy, and lifecycle interfaces

### Day 05: Configuration & Application Properties
- How to configure properties in application.properties or application.yml?
- Inject values using @Value and @ConfigurationProperties

### Day 06: Profiles in Spring Boot
- What is a Spring profile?
- Configure dev, test, and prod profiles
- Run different logic/config based on profile

### Day 07: REST API Basics
- Create GET, POST, PUT, DELETE APIs using Spring Boot
- What is @RestController vs @Controller?

### Day 08: Request Handling
- Use @RequestParam, @PathVariable, @RequestBody
- Validate inputs with @Valid

### Day 09: Exception Handling
- Handle exceptions using @ControllerAdvice, @ExceptionHandler
- Build a global exception handling layer

### Day 10: Spring Boot Validation
- Apply validation using annotations like @NotNull, @Min, @Size
- Custom validation example

### Day 11: JPA & Hibernate Basics
- What is JPA? What is Hibernate?
- Define Entity, Repository, and basic CRUD operations

### Day 12: JPA Advanced
- Define relationships: OneToOne, OneToMany, ManyToMany
- Lazy vs Eager loading example

### Day 13: Spring Data JPA Queries
- Use @Query and method name conventions
- Pagination and sorting with Pageable

### Day 14: H2/MySQL Integration
- Configure an in-memory H2 database
- Migrate to MySQL/PostgreSQL

### Day 15: Logging in Spring Boot
- Add SLF4J/Logback logging
- Use different log levels for dev/prod

### Day 16: Lombok in Spring Boot
- What is Lombok? Why use it?
- Use @Data, @Builder, @Slf4j, @Value

### Day 17: Spring Boot Security Basics
- Add username/password authentication
- Secure REST APIs with SpringSecurityConfig

### Day 18: JWT Authentication
- What is JWT?
- Implement token-based authentication in Spring Boot

### Day 19: API Rate Limiting
- Use custom annotation or filter for rate limiting
- Why rate-limiting matters in APIs?

### Day 20: Swagger & API Documentation
- Add Swagger/OpenAPI docs using springdoc-openapi
- Customize API documentation

### Day 21: Unit Testing in Spring Boot
- Test REST endpoints using @WebMvcTest, MockMvc
- Test service layer using @MockBean

### Day 22: Integration Testing
- Write integration tests with @SpringBootTest
- Use test containers and mock DBs

### Day 23: Asynchronous Programming
- Use @Async and CompletableFuture
- Thread pool configuration

### Day 24: Scheduling Jobs
- Schedule tasks with @Scheduled
- Cron expression use cases

### Day 25: Spring Boot with Kafka/RabbitMQ
- Create a simple producer-consumer using Kafka
- Configure queues and test message flow

### Day 26: Spring Boot + Redis
- Integrate Redis cache
- Use @Cacheable, @CachePut, @CacheEvict

### Day 27: Spring Boot Actuator
- Use /actuator endpoints to monitor health
- Customize and secure endpoints

### Day 28: Dockerizing Spring Boot
- Create a Dockerfile and run the app in a container
- Push the image to Docker Hub

### Day 29: CI/CD Setup
- Automate Spring Boot build and deploy using GitHub Actions or Jenkins
- Add health checks and rollback on failure

### Day 30: Final Mini Project
- Build a real-world app using all learned concepts
- REST API + JPA + Security + Docker + Swagger

## 🚀 Getting Started

1. Clone this repository
2. Navigate to any day folder (Day01, Day02, etc.)
3. Complete the exercises in each file
4. Document your learning in the reflection file
5. Move to the next day when ready

## 📁 Project Structure

```
30-days-spring-boot-challenge/
├── Day01/
│   ├── Notes.md
│   ├── RealWorldExample.java
│   ├── InterviewPractice.java
│   ├── Exercises.java
│   └── Reflection.md
├── Day02/
│   ├── Notes.md
│   ├── RealWorldExample.java
│   ├── InterviewPractice.java
│   ├── Exercises.java
│   └── Reflection.md
└── ... (Day03-Day30)
```

## 🎯 Learning Objectives

By the end of this challenge, you will be able to:

- ✅ Understand Spring Boot fundamentals and architecture
- ✅ Build RESTful APIs with proper error handling
- ✅ Implement database operations with JPA/Hibernate
- ✅ Add security and authentication to applications
- ✅ Write comprehensive tests (unit and integration)
- ✅ Deploy applications using Docker and CI/CD
- ✅ Monitor and maintain production applications
- ✅ Build a complete full-stack application

## 📝 Tips for Success

- **Consistency**: Spend 30-45 minutes daily
- **Practice**: Code along with examples
- **Document**: Write reflections and notes
- **Review**: Revisit previous days' concepts
- **Build**: Apply learning to personal projects

Happy Learning! 🎉