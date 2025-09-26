package com.example.springlifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

// ----- Exercise 1: Two beans with dependencies -----
@Component
class BeanA {
    public BeanA() {
        System.out.println("BeanA: Constructor called");
    }

    @PostConstruct
    public void init() {
        System.out.println("BeanA: @PostConstruct called");
    }

    @PreDestroy
    public void cleanup() {
        System.out.println("BeanA: @PreDestroy called");
    }
}

@Component
class BeanB {
    private final BeanA beanA;

    public BeanB(BeanA beanA) {
        this.beanA = beanA;
        System.out.println("BeanB: Constructor called with BeanA dependency");
    }

    @PostConstruct
    public void init() {
        System.out.println("BeanB: @PostConstruct called");
    }

    @PreDestroy
    public void cleanup() {
        System.out.println("BeanB: @PreDestroy called");
    }
}

// ----- Exercise 2: BeanPostProcessor to log pre/post initialization -----
@Component
class LifecycleLogger implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BeanPostProcessor: Before Initialization of " + beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BeanPostProcessor: After Initialization of " + beanName);
        return bean;
    }
}

// ----- Exercise 4: Singleton vs Prototype beans -----
@Component
@Scope("prototype")
class PrototypeBean {
    public PrototypeBean() {
        System.out.println("PrototypeBean: Constructor called");
    }

    @PostConstruct
    public void init() {
        System.out.println("PrototypeBean: @PostConstruct called");
    }

    @PreDestroy
    public void cleanup() {
        System.out.println("PrototypeBean: @PreDestroy called");
    }
}

// ----- Main application for testing -----
@Configuration
@ComponentScan("com.example.springlifecycle")
public class BeanLifecycleExercises {

    public static void main(String[] args) {
        System.out.println("=== Starting Spring Context ===");
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(BeanLifecycleExercises.class);

        // Exercise 1: Bean dependency lifecycle
        System.out.println("\n--- Exercise 1: Bean Dependency Lifecycle ---");
        BeanB beanB = context.getBean(BeanB.class);

        // Exercise 4: Singleton vs Prototype
        System.out.println("\n--- Exercise 4: Singleton vs Prototype ---");
        PrototypeBean proto1 = context.getBean(PrototypeBean.class);
        PrototypeBean proto2 = context.getBean(PrototypeBean.class);
        System.out.println("Are proto1 and proto2 same instance? " + (proto1 == proto2));

        // Exercise 3: @PreDestroy testing
        System.out.println("\n--- Exercise 3: @PreDestroy on context close ---");
        context.close();
        System.out.println("=== Spring Context Closed ===");
    }
}
