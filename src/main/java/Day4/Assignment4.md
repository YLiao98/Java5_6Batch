## Assignment 4
- What's the difference between final, finally and finalize
  - final means that variable is constant and cannot be reassigned,finally is used in try/try-catch block, finalize is a method used before java gc() method.
- What's the difference between throw and throws
  - throw is used in a statement, throws declares exceptions in method declaration body
- What are the two types of exception?
  - checked vs unchecked: one is done at compile time, the other one is caught at runtime.
- What is error in java
  - java error is a subclass of Throwable and tells the type of error.
- Exception is object. T or F
  - T
- Can a finally block exist with a try block but without a catch?
  - yes
- From java 1.7, give an example of the try-resource feature



    double a = 12.3;
    double b = 0.0;
    double c;
    try{
      c = a/b;
    }catch(ArithmeticException ae){
      throw new ArithmeticException(ae);
    }

- What will happen to the Exception object after exception handling?
  - It will get GC'd eventually.
- Can we use String as a condition in Switch(str){} clause?
  - yes
- What's the difference between ArrayList, LinkedList and vector
  - ArrayList vs LinkedList: arraylist is a resizable array, while linkedlist is a Doubly Linked List. Both have the same complexity of add operation, linkedlist has O(n) of get operation, arraylist has O(1) of get operation.
  - ArrayList vs Vector: Vector is thread-safe, ArrayList is not
- Difference between HashMap and HashTable?
  - HashMap is not threadsafe, can accept null value as key and value
  - HashTable is threadsafe, does not accept null value as key/value
- What is static import?
  - we can access the static members of a class directly without class name or any object. For Example: we  use sqrt() method of Math class by using Math class i.e. Math.sqrt(), but by using static import we can access sqrt() method directly.
- What is static block
  - a static block inside a class is a block of code that would be executed before the initialization and the main method.
- Explain keywords: default(java 1.8), break, continue, synchronized, strictfp, transient, volatile, instanceOf
  - synchronized
    - non-access modifer, it is used when we want to ensure that a method/block of code is only accessible by a thread at a time.
  - default
    - in Java 8, default keyword allows interface to provide a default implementation of a method
  - break
    - keyword is used when we want to exit out of a block of code under a condition or a loop
  - continue
    - keyword is used when we want to stop the current iteration of the loop and continue the next iteration.
  - strictfp
    - a modifier that stands for strict floating-point which was not introduced in the base version of java as it was introduced in Java version 1.2. It is used in java for restricting floating-point calculations and ensuring the same result on every platform while performing operations in the floating-point variable.
      - When a class or an interface is declared with strictfp modifier, then all methods declared in the class/interface, and all nested types declared in the class, are implicitly strictfp.
      - strictfp cannot be used with abstract methods. However, it can be used with abstract classes/interfaces.
      - Since methods of an interface are implicitly abstract, strictfp cannot be used with any method inside an interface.
  - transient
    - used when we don't want a field to be serialized
  - volatile
    - used to ensure that a field is visible to all threads.
    - ensure happens-before relationship: A write to a non-volatile or volatile variable that happens before a write to a volatile variable is guaranteed to happen before the write to that volatile variable;A read of a volatile variable will happen before any subsequent reads of volatile and non-volatile variables
  - instanceOf
    - we use it to check if an object is an instance of a class or interface
- Coding Assignment
  - see github: https://github.com/YLiao98/Java5_6Batch/blob/master/src/main/java/Day4/A4Q15.java


