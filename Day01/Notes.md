# Day 1: Introduction to Spring Boot

## What is Spring Boot?
Spring Boot is an extension of the Spring Framework that helps you build stand-alone, production-ready applications quickly and with minimal configuration.

### Key Features:
- Auto-configuration
- Embedded Servers (Tomcat/Jetty)
- Opinionated starter dependencies
- Spring Boot Actuator for monitoring
- Simplified deployment via `java -jar`

## Why Spring Boot over Spring Framework?
| Feature             | Spring Framework       | Spring Boot            |
|---------------------|------------------------|------------------------|
| Configuration       | Manual                 | Auto-configured        |
| Deployment          | External server (WAR)  | Embedded server (JAR)  |
| Setup               | Verbose XML/Java       | Rapid with Initializr  |
| Monitoring          | Manual integration     | Built-in Actuator      |

## How Spring Boot Works:
- Uses **@SpringBootApplication** to bootstrap.
- Scans components using **@ComponentScan**.
- Configures beans using **@Configuration** and **@Bean**.
- Reduces the need for manual XML or Java config.
