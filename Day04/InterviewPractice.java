package com.example.springlifecycle;

public class InterviewPractice {

    // Q1: Explain the difference between @PostConstruct and InitializingBean
    // Answer:
    // @PostConstruct is an annotation-based approach and does not require interface implementation.
    // InitializingBean is interface-based and requires afterPropertiesSet() method.
    // Both are used for initialization logic after dependencies are injected.

    // Q2: When is @PreDestroy called?
    // Answer:
    // @PreDestroy is called when the Spring container is shutting down, allowing cleanup logic to execute.

    // Q3: Can you have both @PostConstruct and InitializingBean in a bean?
    // Answer:
    // Yes, both can coexist. @PostConstruct is called before afterPropertiesSet().

    // Q4: Which lifecycle method is called first: constructor, @PostConstruct, or afterPropertiesSet()?
    // Answer:
    // Constructor → @PostConstruct → afterPropertiesSet()
}
