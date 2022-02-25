## Assignment 3

- Explain polymorphism
  - polymorphism in java means the ability for an object to take action in different forms. This can be achieved by method overriding and method overloading
    - method override: In a child class, we can override the method from parent class to form a different implementation
    - method overload: we can have many methods with same name but with different parameters and different return types
- What does the final mean in this method: public void doSomething(final Car aCar){}
  - final here means that the aCar reference variable cannot be reassigned.
- Suppose in the previous question, the Car class has a method setColor(Color color){...}, inside doSomething method, can we call aCar.setColor(red)?
  - yes we can, because the reference of aCar doesn't get reassigned.
- Can we declare a static variable inside a method?
  - no we can only declare a static var in a class scope
- What is the difference between interface and abstract class?
  - we use 'extends' keyword to inherit an abstract class, and we use "implements" or "extends" keyword to implement an interface
  - we can implement many interfaces but can only extend one abstract class.
  - in abstract class can have final, non-final, static and non-static variables. The interface has only static and final variables.
- Can an abstract class be defined without any abstract methods?
  - yes.
- Since there is no way to create an object of abstract class, what's the point of constructors of abstract class?
  - we can initialize fields inside the abstract class and invoke the instance methods of an abstract class
- What is a native method?
  - native method allows Java to call a dynamically loaded library (written in another language) from java, and then get the results back to java
- What is marker interface?
  - empty interface, for example: Serializable, Cloneable
- Why to override equals and hashCode methods?
  - because we need to ensure that when the content of objects are the same, the hashcode of objects should also be the same
  - If hashcode of two objects are the same, the content of objects might not be the same, however.
- What's the difference between int and Integer?
  - The difference is that int is a primitive type and Integer is a wrapper class for primitive type int.
- What is Serialization?
  - Serialization is the process to turn the object into serializable byte-stream.
- Create List and Map. List A contains 1,2,3,4,10(Integer). Map B contains ("a","1"),("b","2"),("c","10") (key = string, value =string). Get a list which contains all the elements in list A, but not in map B


    package Day4;
    import java.util.*;
    public class A3Q15 {

      public static void main(String[] args){
        HashMap<String, Boolean> count = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        Integer[] arr1 = {1,2,3,4,10};
        List<Integer> lst = new ArrayList<Integer>(Arrays.asList(arr1));
        Map<String, String> map = new HashMap<>();
        map.put("a","1");
        map.put("b","2");
        map.put("c","4");
        for(Map.Entry<String,String> entry: map.entrySet()){
          String val = entry.getValue();
          if(!count.containsKey(val)){
            count.put(val,true);
          }
        }
        for(Integer i : lst){
          String parsedInt = i.toString();
          if(!count.containsKey(parsedInt)){
            res.add(i);
          }
        }
        //print result
        res.stream().forEach(System.out::println);
      }

    }

- implement a group of classes that have common behavior as Shape. Create Circle, Rectangle and Square for now as later we may need more Shapes. They should have the ability to calculate the area. They should be able to compare using area. Please write a program to demonstrate the clases and comparison. You can use either abstract or interface. Comparator or Comparable interface.



    
    package Day4;
    import java.util.*;
    
    public class A3Q16 {
      public static void main(String[] args){
        Comparator<Shape> areaComparator = (o1, o2) -> (int)(o1.calculateArea()) - (int)(o2.calculateArea());
        Circle c1 = new Circle(2134);
        Rectangle r1 = new Rectangle(1,2);
        Square s1 = new Square(213);
        ArrayList<Shape> lst = new ArrayList<>();
        lst.add(c1);
        lst.add(r1);
        lst.add(s1);
        //before sorting print address circle -> rectangle -> square
        lst.stream().forEach(System.out::println);
        //sort
        Collections.sort(lst,areaComparator);
        //after sorting, should print address rectangle -> circle -> square
        lst.stream().forEach(System.out::println);
        }
    }
    
    abstract class Shape{
    
        abstract double calculateArea();
    }
    
    class Circle extends Shape{
      private final double pi = 3.14;
      private double r;
      
          public Circle(double r) {
              this.r = r;
          }
      
          public double getR() {
              return r;
          }
      
          public void setR(double r) {
              this.r = r;
          }
      
          @Override
          double calculateArea() {
              return this.pi * this.r;
      
          }
    }
    
    class Rectangle extends Shape{
      private double l;
      private double h;
      
          public Rectangle(double l, double h) {
              this.l = l;
              this.h = h;
          }
      
          public double getL() {
              return l;
          }
      
          public void setL(double l) {
              this.l = l;
          }
      
          public double getH() {
              return h;
          }
      
          public void setH(double h) {
              this.h = h;
          }
      
          @Override
          double calculateArea() {
              return this.h * this.l;
          }
    }
    
    class Square extends Shape{
      private double l;
      
          public Square(double l) {
              this.l = l;
          }
      
          public double getL() {
              return l;
          }
      
          public void setL(double l) {
              this.l = l;
          }
      
          @Override
          double calculateArea() {
              return this.l * this.l;
          }
    }