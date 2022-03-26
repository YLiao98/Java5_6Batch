## Review
- Spring MVC
    - Dispatcher servlet
        - delegates client requests and gets an entry of handler mapping, then forward the request to controllers
    - controller returns an object of ModelAndView
    - Dispatcher Servlet checks an entry of ViewResolver, and invokes specific view
- Exception 
    - @ExceptionHandler
    - @ControllerAdvice
    - @ResponseStatus
## New Things
- Swagger Documentation
    - Swagger Configurations
        - @EnableSwagger2 + @Configuration
- @Bean vs @Component
    - @Bean when we want to config a return type as a bean, @Component mostly used for class

- Project Lombok
    - @Data, @AllArgsConstructor, @NoArgsConstructor
- @Profile("dev") dev => QA => product
    - application-test1.properties
    - application-test2.properties ( different properties files for different profiles)

## Plans For Tomorrow
- Coding Problems
- Simple REST API project
- Review URL design, Spring Boot Configurations