# Day 4: Spring Bean Lifecycle

## Overview
Spring beans go through a well-defined lifecycle from instantiation to destruction. Understanding the lifecycle helps manage resources efficiently and apply initialization or cleanup logic.

## Lifecycle Phases
1. **Instantiation** – Spring container creates the bean instance.
2. **Populate Properties** – Spring injects dependencies (DI).
3. **BeanNameAware & BeanFactoryAware** – Optional interfaces to know bean name or factory.
4. **Pre-initialization** – `BeanPostProcessor` methods called before init.
5. **Initialization** – Custom init logic via:
    - `@PostConstruct`
    - `InitializingBean` interface (`afterPropertiesSet`)
6. **Post-initialization** – `BeanPostProcessor` methods after init.
7. **Ready to Use** – Bean is available for use.
8. **Destruction** – Cleanup before removal:
    - `@PreDestroy`
    - `DisposableBean` interface (`destroy`)

## Key Annotations & Interfaces
- `@PostConstruct` – Method called after bean initialization.
- `@PreDestroy` – Method called before bean destruction.
- `InitializingBean` – Implement `afterPropertiesSet()` for init.
- `DisposableBean` – Implement `destroy()` for cleanup.
