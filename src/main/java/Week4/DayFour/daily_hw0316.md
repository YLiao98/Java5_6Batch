## Review 
#### static proxy vs dynamic proxy
- proxy pattern
    -  changing or using the behavior of original object without changing the implementation of original object
    - dynamic vs static
        - dynamic proxy can be generated at runtime by using reflection, we do not need to define multiple proxy classes over and over again.

#### IO Stream

|           | Byte                |                      | Character                |                           |
|-----------|---------------------|----------------------|--------------------------|---------------------------|
|           | Input               | Output               | Input                    | Output                    |
| Basic     | InputStream         | OutputStream         | Reader InputStreamReader | Writer OutputStreamWriter |
| Files     | FileInputStream     | FileOutputStream     | FileReader               | FileWriter                |
| Buffering | BufferedInputStream | BufferedOutputStream | BufferedReader           | BufferedWriter            |
| Data      | DataInputStream     | DataOutputStream     |                          |                           |
    
#### shared lock and exclusive lock
- shared lock (S)
    - also named read lock
    - If t1 has read lock on resource A, t2 can read on A but cannot write on A
- Exclusive lock (X)
    - write lock
    - If t1 has write lock on resource A, t2 cannot read or write on A 


|   | S | X |
|---|---|---|
| S | Y | N |
| X | N | N |

## New Things I've learned
#### OSI Model
- easy to remember 7 layers
    - Please(physical) Do(Data Link) Not(Network) Take(Transport) Steve's(Session) Pizza(Presentation) Away(Application)
- Application
    - HTTPS, FTP, SSH, DNS
- Transport
    - segments and resembles data into a datastream using transmission protocols
    - TCP, UDP
- Network Layer
    - defines addressing and how individual messages are routed to their intended destination
    - IPv4, IPv6
#### TCP/IP
- 4 Layers
    - Network Access, Internet, Transport, Application
- TCP/IP vs OSI
    - TCP/IP is an implemented model of an OSI model.
    - In TCP/IP, the session and presentation layer are not different layers. Both layers are included in the application layer.
    - The network layer provides only connectionless service.

#### HTTPS

- request
    - basic HTTP request 
        - URL class
        - 
        - requestMethod: GET, POST, PUT, DELETE, PATCH, HEAD
        - Header
            - con.setRequestProperty("Content-Type", "application/json")
            - String contentType = con.getHeaderField("Content-Type");
        
- response
    - status
    - header
    - http body(optional)

- status code
    - 1xx – informational – the request was received, continuing process
    - 2xx – success – the request was received successfully and accepted
    - 3xx – redirection – further action needs to be taken to complete the request
    - 4xx – client error
        - 400 bad request
        - 401 unauthorized
        - 403 forbidden -> no permission 
        - 404 not found -> server unable to find resources
    - 5xx – server error 
        - 500 internal error
        - 501 not implemented -> method not implemented by server
        - 502 bad gateway -> server acting as proxy/gateway received invalid response from upstream server

## Plan for Tomorrow
- Coding problems
- Java 8 
    - Stream API, Optional
- review OSI vs TCP/IP
    - presentation layer
    - session
    - datalink + physical <=> network access 