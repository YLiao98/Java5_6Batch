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