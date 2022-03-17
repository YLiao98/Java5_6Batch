## OSI Model
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
## TCP/IP

- 4 Layers
    - Network Access, Internet, Transport, Application
- TCP/IP vs OSI
    - TCP/IP is an implemented model of an OSI model.
    - In TCP/IP, the session and presentation layer are not different layers. Both layers are included in the application layer.
    - The network layer provides only connectionless service.

## HTTP
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