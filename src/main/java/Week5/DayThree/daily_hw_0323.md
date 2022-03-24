## Review
Spring Bean Scope
- singleton (default)
- prototype
    - a single bean to have multiple of object instances
- request
    - scopes to a HTTP request. valid in context of a SpringApplicationContext
- session
- Global-session
    - scopes to a global HTTP session

three tier architecture
- view <=> controller <=> service <=> DAO

Basic of Tomcat application folder
- bin
    - startup, shutdown and other executables
- common
    - common classes that catalina and webapp can use
- conf
- logs
- temps
- webapps
    - drop war files here
- work

3-way handshake
- client sends syn bit
- server receives syn bit then sent syn-ack bits set
- clients acknowledges the response from the server then they both establish the connection

## New Things Today
Spring AOP
- Aspect
- joint point
- Pointcut
    - predicate that matches the join points
- Advice
    - Before
    - After returning
    - After throwing
    - Around 

Spring @Transactional Annotation
- at class or method level
- Propagation Type of the transaction (`@Transactional( propagation = Propagation.SUPPORTS,readOnly = true )`)
- Isolation level of the transaction (`@Transactional(isolation = Isolation.SERIALIZABLE)`)

## Plans for tomorrow
- Coding problems
- more on @Spring AOP
- Spring Controller, Service and Entity mapping