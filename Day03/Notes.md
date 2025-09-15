# Day 03: Dependency Injection (DI) & IoC

## What is IoC?
- Shifts control of object creation to the Spring Container.
- Example: You don’t `new` objects; Spring does it for you.

## What is DI?
- A way to implement IoC.
- Dependencies are injected into classes instead of being created inside.

## Types of Injection
1. **Field Injection**
    - `@Autowired` on fields
    - Quick but discouraged
2. **Constructor Injection**
    - Most recommended (immutability + testability)
3. **Setter Injection**
    - For optional dependencies

## Annotations Used
- `@Autowired`
- `@Qualifier`
- `@Primary`
- `@Lazy`

## Advanced Concepts
- **Profiles** (`@Profile`): Inject beans based on environment
- **Conditional Beans** (`@Conditional`): Create beans only when conditions are met
- **Scopes**: Singleton, Prototype, Request, Session
- **Circular Dependency Handling**: Redesign > Workarounds

## Architect-Level Understanding
- Constructor Injection is preferred → ensures required dependencies
- Use interfaces + multiple implementations for flexibility
- Combine DI with design patterns (Strategy, Factory)
- DI aligns with SOLID principles → especially Dependency Inversion
