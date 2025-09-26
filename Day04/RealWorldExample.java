package com.example.springlifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class BeanLifecycleExample implements InitializingBean, DisposableBean {

    public BeanLifecycleExample() {
        System.out.println("BeanLifecycleExample: Constructor called");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("@PostConstruct method called");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean.afterPropertiesSet() called");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("@PreDestroy method called");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean.destroy() called");
    }

    public void businessMethod() {
        System.out.println("Bean is ready and business method is executing...");
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("com.example.springlifecycle");

        BeanLifecycleExample bean = context.getBean(BeanLifecycleExample.class);
        bean.businessMethod();

        context.close();
    }
}
