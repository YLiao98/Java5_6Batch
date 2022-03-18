## Review 
- Java 8 
    - stream API
        - lazy Evaluation
            - Computation on the source data is only performed when the terminal operation is initiated, and source elements are consumed only as needed.
        - collection source
            - stream()
            - parallelStream()
        - operations
            - forEach()
            - map()
            - collect()
            - filter()
            - findFirst() -> returns an Optional (findFirst().orElse())
            - flatMap()
    - Optional
        - provide a type-level solution for representing optional values instead of null references.
        - check value presence
            - isEmpy() // null val
            - isPresent() // not null
        - orElse()
            - `Optional.ofNullable(null).orElse("notnullstr");`
        - we can chain Optional objects with Stream API
- Range partitioning with mongoDB
    - sharding 
    - key values for shards are associated with each range

- OSI
    - presentation layer
        - responsible for the delivery and formatting of information to the application layer for further processing or display
    - session
        - responsible for establishing, maintaining, synchronizing, terminating sessions between end-user applications
    - datalink + physical <=> network access 
        -  datalink prepares packets for transmission over the physical media, and physical layer is responsible for transmitting the data over the different types of physical media
## New Things I've learned
TCP/IP
- 3-way handshake to establish connection
    - client sends syn bit
    - server receives syn bit and sends syn-ack bit
    - client receives syn-ack bit then responds with ack packet

Servlet Life Cycle
- init()
     - servlet initialization, only invoke once
- service()
- destroy()
## Plan for Tomorrow
- Coding Problems
- review
    - TheadPoolExecuter
        - handle different policy
        - core pool, max pool, blocking queue
    - B+ tree index vs hash index
    - Sessions and Cookies