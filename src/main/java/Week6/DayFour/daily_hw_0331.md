## Review
@RequestMapping
- annotations used to provide routing information
- any HTTP requests must be mapped to the respective methods

Auto-configuration in Spring Boot
- used to automatically configure the required configuration for the application
- disable the auto-configuration property
    - `@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})`
    - If the class is not on the classpath, then to exclude the auto-configuration `@EnableAutoConfiguration(excludeName={Sample.class})`

Server-side service discovery
- ![](server-side-discovery.jpg)
- Server-side service discovery in Spring Boot
        - using Spring Cloud's `@EnableEurekaServer` to stand up a registry



## New Things

System properties
- read system properties from command line: java -jar -Dspring.profiles.active=dev application.jar 

Spring Boot Properties
- the Default Property File: application.properties
- register a Properties file using annotations @Configuration + @PropertySource("classpath:foo.properties")

Distributed Tracing
- spring cloud sleuth
    -  sets up useful log formatting for you that prints the trace ID and the span ID
     
    - example log
    
            2016-02-11 17:12:45.404  INFO [my-service-id,73b62c0f90d11e06,73b62c0f90d11e06,false] 85184 --- [nio-8080-exec-1] com.example.MySimpleComponentMakingARequest     : ...
- zipkin
    - add zipkin starter dependency in spring boot
    - once started, we can use zipkin web UI to monitor services

resilience4j
- circuitbreaker
- retry
- ratelimiter

jmeter
- simulating high volume requests

API gateway in microservices
- advantages of API gateway:
    - decouples clients from services, making sure APIs are not exposed
    - manage concerns like rate limiting, user access control, token authorization, scaling among others and help you reducing complexity of microservices
    - some API gateways out of box contains monitoring/analytics tools

- how to secure API gateway (JWT, OAuth2)
    - rate limiter
    - policy to check if incoming API call contains JWT and whether it is valid

## Plans for tomorrow
- coding problems
- review in details about Eureka and more in-depths about spring boot microservice projects
