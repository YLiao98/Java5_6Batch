## Review
REST vs RESTful
- REST (Representational state transfer) is a style of software architecture
- RESTful is web services implementing REST architecture

Spring Boot Actuator
- brings production ready features to Spring Boot Application
- mainly used to expose operational information about the running application — health, metrics, info, dump, env, etc

Spring Boot Component Scan
- If your other packages hierarchies are below your main app with the @SpringBootApplication annotation, you’re covered by implicit components scan.
- If there are beans/components in other packages which are not sub packages of the main package, you should manually add them as @ComponentScan
## AWS
On-Premises vs IaaS vs PaaS vs SaaS
![](saas-vs-paas-vs-iaas-breakdown.jpg)

AWS Lambda
- serverless compute service
- host code that can be triggered by other services; invoke function synchronously or asynchronously
- trigger
    - API gateway (synchronous events): calling an API gateway will trigger lambda function and lambda function has to respond to the client directly at the end of its invocation
    - S3: modifying the content of an S3 bucket

lambda handles the apis coming from API gateway?
- Lambda integration maps a path and HTTP method combination to a lambda function

AWS SNS
- Simple Notification Service
- distributed publish-subscribe system, Messages are pushed to subscribers as and when they are sent by publishers to SNS.

AWS SQS
- distributed queuing system
- Messages are not pushed to receivers. 
- Receivers have to poll or pull messages from SQS. 
- Messages can't be received by multiple receivers at the same time. Any one receiver can receive a message, process and delete it. Other receivers do not receive the same message later.

AWS S3
- bucket: public cloud storage
    - object key: uniquely identifies the object in an S3 bucket

EC2
- individual instances, offer servers with a complete package: CPU, memory, disk, network, OS

Amazon ECS
- Orchestration and management of containerized services


## Plans for tomorrow
- review antra reporting system aws

- review Cloud Components - Java Architecture