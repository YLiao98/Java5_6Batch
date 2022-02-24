## Java Keyword Notes

#### Data Types

- byte
  - data type that stores integers range from -128 to 127
- short
  - data type that stores integers range from -32768 to 32767
- int
  - data type that stores integers range from -2147483648 to 2147483647
- long
  - data type that can store integers from -9223372036854775808 to 9223372036854775808
- float
  - data type that stores data type that can store fractional numbers from 3.4e−038 to 3.4e+038
- double
  - data type that can store fractional numbers from 1.7e−308 to 1.7e+308
- char
  - data type that stores a single character
- boolean
  - data type that stores a true/false value

#### flow control

- if
  - this keyword is used to create conditional statement, and allows you to execute the condition only if a condition is true
- else
  - this keyword is used in conditional statement, block of code inside else is executed only the if statement is false.
- switch
  - this keyword allows different blocks of code to be executed under different conditions
- case
  - this keyword is used inside a switch statement, states a condition to run a block of code
- default
  - defines the default block of code to be executed inside a switch statement
  - in Java 8, default keyword allows interface to provide a default implementation of a method
  - default is an access modifier that has accessibility of package-only
- for
  - keyword is used to create a for loop
- do
  - keyword is used when we want to create a do-while loop
- while
  - keyword is used to create a while loop or a do-while loop
- break
  - keyword is used when we want to exit out of a block of code under a condition or a loop
- continue
  - keyword is used when we want to stop the current iteration of the loop and continue the next iteration.
- return
  - keyword is used when we finish the execution of a method, usually return a value from a method.

#### Modifiers

- public
  - declares a class/method/variable/constructor, makes them accessible by all other classes
- private
  - declares a class/method/variable/constructor, makes them only accessible within the declared class
- protected
  - declares a class/method/variable/constructor, makes them only visible to current package and subclasses
- abstract
  - non-access modifier, used by methods or classes
    - for classes: we cannot use an abstract class to create an instance of it, we must inherit it from the children classes
    - for methods: we use it as a way to ensure abstraction (no method body details), we don't need implementation details when we create an abstract method, we let the child class to implement it.
- synchronized
  - non-access modifer, it is used when we want to ensure that a method/block of code is only accessible by a thread at a time.
- native
  - The keyword is applied to a method to indicate that the method is implemented in native code using JNI(Java Native Interface)
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

#### Exception Handling
 
- finally
  - Often used after try-catch block, but we can also use without the catch block. After try/try-catch block, block of code inside finally will execute no matter what.
- throw
  - creates an error
- throws
  - signifies what exceptions may be thrown by a method
- assert
  - used to define a assert statement, an assert statement will throw an error if the condition is false. It is typically used for testing.

#### Class Related

- class
  - used to define a class
- package
  - used to declare a package
- import
  - we can use it to import other classes/interfaces/packages
- extends
  - we use it when we want a class to inherit a class
- implements
  - we use it when we implements an interface
- interface
  - defines an interface

#### Object related keywords
- new
  - creates an instance of object
- instanceof
  - we use it to check if an object is an instance of a class or interface
- super
  - refers to parent object
    - we can use it to refer parent's variables, methods
    - we can also use it to access parent's constructor: super()
      - we must use it as the first line of the statement in the child constructor
- this
  - refers to current object