#!/bin/bash

echo "Creating file structure and populating Days 01-10 with questions..."

# Create file structure for Days 01-10
for i in {01..10}; do
    day="Day$i"
    echo "Processing $day..."
    
    # Create all files for the day
    touch "$day/Notes.md" "$day/RealWorldExample.java" "$day/InterviewPractice.java" "$day/Exercises.java" "$day/Reflection.md"
    
    # Day-specific questions
    case $i in
        01)
            questions="What is Spring Boot and how does it work?\n\nWhy should you choose Spring Boot over traditional Spring Framework?\n\nHow do you build your first Spring Boot project manually and using Spring Initializr?"
            ;;
        02)
            questions="What are the key Spring Boot annotations and their purposes?\n\nHow do you explain @SpringBootApplication, @Component, and @Autowired annotations?\n\nHow do you create a service using @Component and inject it into other components?"
            ;;
        03)
            questions="What is Dependency Injection (DI) and Inversion of Control (IoC) in Spring Boot?\n\nWhat is the difference between field, constructor, and setter injection?\n\nHow do you create a simple DI example with multiple services?"
            ;;
        04)
            questions="What is the lifecycle of a Spring Bean?\n\nHow do you use @PostConstruct, @PreDestroy, and lifecycle interfaces?"
            ;;
        05)
            questions="How do you configure properties in application.properties or application.yml?\n\nHow do you inject values using @Value and @ConfigurationProperties?"
            ;;
        06)
            questions="What is a Spring profile?\n\nHow do you configure dev, test, and prod profiles?\n\nHow do you run different logic/config based on profile?"
            ;;
        07)
            questions="How do you create GET, POST, PUT, DELETE APIs using Spring Boot?\n\nWhat is the difference between @RestController and @Controller?"
            ;;
        08)
            questions="How do you use @RequestParam, @PathVariable, and @RequestBody?\n\nHow do you validate inputs with @Valid?"
            ;;
        09)
            questions="How do you handle exceptions using @ControllerAdvice and @ExceptionHandler?\n\nHow do you build a global exception handling layer?"
            ;;
        10)
            questions="How do you apply validation using annotations like @NotNull, @Min, @Size?\n\nHow do you create a custom validation example?"
            ;;
    esac
    
    # Write to .md files (plain text)
    echo -e "$questions" > "$day/Notes.md"
    echo -e "$questions" > "$day/Reflection.md"
    
    # Write to .java files (as comments)
    java_questions=$(echo -e "$questions" | sed 's/^/\/\/ /')
    echo -e "$java_questions" > "$day/RealWorldExample.java"
    echo -e "$java_questions" > "$day/InterviewPractice.java"
    echo -e "$java_questions" > "$day/Exercises.java"
    
    echo "✓ $day completed"
done

echo ""
echo "✅ All files for Days 01-10 have been created and populated!"
echo "📁 Each day folder now contains:"
echo "   - Notes.md (questions in plain text)"
echo "   - RealWorldExample.java (questions as Java comments)"
echo "   - InterviewPractice.java (questions as Java comments)"
echo "   - Exercises.java (questions as Java comments)"
echo "   - Reflection.md (questions in plain text)"
echo ""
echo "🎯 Ready for your 30-day Spring Boot challenge!" 