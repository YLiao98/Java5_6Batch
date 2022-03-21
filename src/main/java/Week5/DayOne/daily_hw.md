## Review
B+ tree vs Hash index
- since B+ tree is good for ordered search structure, B+ tree can be used with order operators, but hash index can only good for equality checks
- B+ tree index is more expensive to maintain, it needs to be updated for every update operations
ExecutorService
- Factory methods of Executors class
    - newCachedThreadPool
    - newFixedThreadPool
- Assign task to Executor Service
    - submit() & invokeAll() (returns Future object)
    - execute()
- Shutdown an Executor Service
    - shutdown()
    - shutdownNow()
    - awaitTermination()
- ThreadPoolExecutor 
    - thread creation
        - if threads < corePoolSize, create Thread to run task
        - if threads >= corePoolSize, put task into Queue
        - if Queue is full and threads < maxPoolSize, create new Thread to run task
        - if Queue is full and threads >= maxPoolSize, reject task
    - Saturation
        - all threads are busy and queue is filled up, we need a policy to handle the situation
            - Abort policy
            - Discard policy
            - Custom policy (custom class extends RejectedExecutionHandler)

Session vs Cookies
- session resides on server that contains user data
- cookies resides on client-side containing small user information, and it's not safe
- session is over when user quits browser/program, cookies live on device forever

## New things

URL components
- protocol
- domain
- path
- query


Inversion of Control
- Spring Framework at core is basically an IoC container.
- Dependency Injection is an implementation of IoC

why do we need dependency injection?
- Loose coupling
- move the responsibility of managing components onto the container

SpringBoot Framework
- basic layout
    - controller -> service -> DAO(Data Access Object)

- Annotations

    - @repository
    - @autowired
        - @Qualifier
        - @Primary
    - @service
    - @controller
    - @RestController


DI Types
- By Constructor (default, without @Autowired)
- Setter
- field

difference between autowired and intialized core java object?
- The object is not injected inside the Bean container

## Plans for tomorrow
- coding problems
Spring
    - Dependency Injection

servlet life cycle

Http Status Code

