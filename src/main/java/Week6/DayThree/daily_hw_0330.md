## Review
synchronized vs LOCK
- A lock is acquired via the lock() method and released via the unlock() method. Invoking an unlock() without lock() will throw an exception. Synchronized releases the lock in exceptions.
- we can lock in one moethod and release the lock in another method, we cannot do that using synchronized. We have more flexiable structuring of synchronized code using locks.


HashMap vs ConcurrentHashmap
- HashMap is not thread-safe, while ConcurrentHashMap is thread-safe, and provide 16 bucket-level locks
- HashMap allows null values for key and values, but in ConcurrentHashMap, null value is not allowed
Spring Security OAuth2
- In OAuth2, generally there are four roles, client, user, authorization server, and resource server. OAuth2 permits client applications to access protected resources via an authorization server. Using it, a client application (third party) can gain limited access to an HTTP service on behalf of the resource owner or on its own behalf.  

## New Things
OpenFeign Client
- Feign is a library for creating REST API clients in a declarative way. 
- why do we use OpenFeign?
    - abstract the mechanics of calling a REST service. Once you configure and annotate the Feign interface, you can call a REST service by making a simple Java function call

- advantages of using Feign over RestTemplate
    - reduce repetitve code, we do not need to write any implementation to call the other services

microservices vs SOA
- In SOA(service-oriented architecture), each service is comprised of code and data integration required to execute a business function. The service interfaces provide loose coupling, they have no knowledge of how the integration is implemented underneath.
-  microservices architectures are made up of loosely coupled, reusable, and specialized components that often work independently of one another. The components can be independently deployed and operated.
- main components
- advantages vs disadvantages
Spring cloud netflix 
- eureka (service discovery)
- ribbon (client load balancer) 
    - API that integrates load balancing- fault-tolerance, caching

client-side load balancing
- client holds the server IPs so that it can deliver the requests. The client selects an IP randomly and forwards the request to the server.