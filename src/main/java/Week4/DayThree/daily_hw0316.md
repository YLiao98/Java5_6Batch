## Review 
- thread
    - join
        - If a thread wants to wait until completing of some other thread then we should go for join()
    - yield
        - If a thread wants to pass its execution to give chance to remaining threads of the same priority then we should go for yield()
    - wait vs sleep
        - wait releases the lock, sleep doesn't
        - wait can be woken up by using notify()

- mongoDB with CAP
    - follows CP
        - mongodb chooses consistency over availability because it would stop accepting writes to system
    - multi-document ACID transaction


## New Things I've learned

- JAVA Reflection
    - API to modify the behavior of methods, classes, interfaces at runtime
        - Class
            - String getName()
            - Class getClass() 
            - Class getSuperClass()
            - Class[] getInterfaces()
        - Constructors: getConstructors()
        - Fields
            - getFields
            - getDeclareFields
        - Methods: getMethods()
            - invoke an method through reflection if we know its name and parameter types. 
                - getDeclaredMethod(name, parametertype)
                - Method.invoke()
        - visibility
            - setAccessible()
- Design Pattern
    - singleton
        - eager
            ```
            public class Singleton {
                private static Singleton instance = new Singleton();
                
                private Singleton(){}
                
                public static Singleton getInstance()
                {
                    return instance;
                }
            }
            ```
        - lazy
            ```
            public class Singleton {
                private static Singleton instance = null;
                
                private Singleton(){}
                
                public static Singleton getInstance()
                {
                    if(instance == null){
                        instance = new Singleton();
                    }
                    return instance;
                }
            }
            ```
        - thread-safe
        ```
            public class Singleton {
                private static volatile Singleton instance;
                
                private Singleton(){}
                
                public static Singleton getInstance()
                {
                    if(instance == null){
                        synchronized(Singleton.class){
                            if (instance == null) { 
                            // double check
                            //creating instance of Singleton one time
                            instance = new Singleton();                    
                            }  
                        }
                        
                    }
                    return instance;
                }
            }
        ```
    - factory
        - provide creation of object based on different logic
    - builder
        - inner static class: builder class
        - method-chaining: return values of methods in a chain is **this** reference
    - proxy
        -  create a new proxy class with the same interface as an original service object. Then you update your app so that it passes the proxy object to all of the original object’s clients. Upon receiving a request from a client, the proxy creates a real service object and delegates all the work to it.
        - static
            - Create proxy class for each class.
            - implement proxy class in a way, that first it make a log entry of the method call made by the client, than delegate the call to real object.
            - problem: suppose you have 1000 classes, you'll need to write 1000 proxy classes for each class

        - dynamic
            -  create a proxy object based on the client's call and then perform generic action(logging action in our case) before delegating the call to the real object
            - java.lang.reflect.Proxy
                - Proxy.newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h);
                - Handler: InvocationHandler -> dynamic proxy class uses InvocationHandler as its strategy and delegates calls to its InvocationHandler
                     - invoke method is where to handle to additional code logic and invoke method
        
## Plan for Tomorrow
- coding problems
- review design pattern
    - proxy
        - static vs dynamic
    - singleton
    - factory