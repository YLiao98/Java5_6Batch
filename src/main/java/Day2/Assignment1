## Assignment 1

- Question 1: What is JDK? JRE? JVM?

#### Answer
JDK is an software development environment for developing java applications. It has everything needed (including JRE) to compile, debug, and run a program on the Java platform.
Java Runtime Environment (JRE) is responsible for executing a Java program. Java Virtual Machine (JVM) loads and translate Java bytecode to machine-readable code, it is platform-dependent.

- Question 2: What is Java compiler?

#### Answer
Java compiler is a program that translates Java source code to JVM bytecode.

- Question 3: Why is Java platform independent?

#### Answer
Because java bytecode can be run on any platform, we just need a corresponding platform-dependent JVM compiler to read the java bytecode.

- Question 4: What is IDE? Why is it important for developers?

#### Answer
IDE is a software development tool that helps developers write and debug a program with ease. It is an important tool for developers because it integrates many tools for developers to debug, test, and write code.

- Question 5: Is Java case-sensitive?

#### Answer
Yes, if we have two variables in a class with names "lowerCase" and "LowerCase", Java would treat them differently.

- Question 6: What does the following keywords do? 
  - static
  - final
  - public
  - private
  - void
  - null
  - package
  - Class
  - new

#### Answer: 

static methods/variables means they can be accessed without creating an instance of a class.

Final keyword:
- final variable: For object, we cannot assign another object to this reference, but we can invoke methods of this object. For primitive type variables, we cannot change the value of the variable.
- final method: it cannot be overriden.
- final class: it cannot be inherited.

public keyword is an access modifier used for classes, methods, variables and constructors. Declare them 'public' make them visible to all other classes.

private keyword is an anccess modifier used for classes, method, variables and constructors. Declare them 'private' make them visible within the declared class only.

void keyword means that the method do not have a return value.

null is a special value that means the object has an unknown value and doesn't belong to any class including class Object.

package keyword declares a package.

Class keyword defines a class in Java.

new keyword creates a new instance of an object.

- Question 7: What is primitive type and reference type?

#### Answer

primitive variables store value, in Java we have 8 primitive types (short, char, double, int, boolean, byte, long, float).
reference variables store the addresses of the objects they refer to.

- Question 8: Is parameter passed by value or reference?

#### Answer

In Java, parameter is strictly passed by value.

- Question 9: What is the output: System.out.println(1>0:"A":"B");

#### Answer

Java throws compile error.

- Question 10: How to define constants in Java?

#### Answer

We can define a constant using keyword 'final' when declaring the variable.

- Question 11: What is String? Is it primitive type?

#### Answer

String is not a primitive type, Java string is an immutable object, A String object is an object of class java.lang.String

- Question 12: How to check if a String is representing a number?

#### Answer

    public boolean checkNumber(String str){
        try{
            Double.parseDouble(str);
            return true;
        }catch(Exception e) {
            return false;
        }
    }

- Question 13: write a program to implement the following activity program

#### Answer

    package Day2;
    import java.util.Scanner;
    
    public class A1q13 {
      /*
      The method returns the sum of 1 to x given by the parameter
      */
      public static int doSomething(int x){
        if(x == 0){
          return 0;
        }
        return x + A1q13.doSomething(x-1);
      }

      /*
      Check if string is an integer.
     */
      public static boolean isNumeric(String str){
          try{
              Integer.parseInt(str);
              return true;
          }catch (Exception e){
              return false;
          }
      }
    
      public static void main(String[] args){
          //fetch user input
          Scanner scanner = new Scanner(System.in);
          String line = scanner.nextLine();
  
          while(line.charAt(0)  != 'q' && A1q13.isNumeric(line)) {
              int x = Integer.parseInt(line);
              if (x > 0) {
                  // loop x time calling doSomething method
                  for(int i = 0;i < x;i++) {
                      System.out.println(doSomething(x));
                  }
              } else {
                  System.out.println("Invalid input (numeric value is less than 0).");
              }
              line = scanner.nextLine();
          }
          scanner.close();
          System.out.println("Exit program...");
          System.exit(1);
      }
    }

- Question 14: Write a program to merge two arrays of int

#### Answer

      
    public class A1q14 {
      public static int[] mergeArr(int[]arr1, int[]arr2){


          int[] merged = new int[arr1.length+arr2.length];
          System.arraycopy(arr1,0,merged,0,arr1.length);
          System.arraycopy(arr2,0,merged,arr1.length,arr2.length);
          return merged;
      }

      public static void main(String[] args){
          //test example
          int[] arr1= {1,1,1,1};
          int[] arr2= {2,2,2,2};
          int[] res = A1q14.mergeArr(arr1,arr2);
          for(int i = 0;i< res.length;i++) {
              System.out.println(res[i]);
          }
      }
    }

- Question 15: Write a program to find the second-largest number inside an array of int.

#### Answer
    package Day2;
    
    public class A1q15 {
    
        public static int findSecondLargest(int[]arr){
            int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
            for(int i = 0 ;i < arr.length;i++){
                if(arr[i] > first){
                    second = first;
                    first = arr[i];
                }
                else if(arr[i] > second && arr[i] != first){
                    second = arr[i];
                }
            }
    
            return second;
        }
    
        public static void main(String[] args){
            //test example
            int[] arr1= {1,5,2,5};
            if(arr1.length < 2){
                System.out.println("Invalid array");
                System.exit(1);
            }
            int res = A1q15.findSecondLargest(arr1);
            System.out.println(res);
    
        }
    }


