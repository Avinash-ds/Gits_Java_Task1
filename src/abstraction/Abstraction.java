package abstraction;


//Abstract class (abstraction)
abstract class Shape {
 String color;

 Shape(String color) {
     this.color = color;
 }

 // Abstract method (to be implemented by subclasses)
 abstract double calculateArea();

 // Concrete method
 void displayInfo() {
     System.out.println("This is a " + color + " shape.");
 }
}

//Concrete subclass - Circle
class Circle extends Shape {
 double radius;

 Circle(String color, double radius) {
     super(color);
     this.radius = radius;
 }

 @Override
 double calculateArea() {
     return Math.PI * radius * radius;
 }
}

//Concrete subclass - Rectangle
class Rectangle extends Shape {
 double length;
 double width;

 Rectangle(String color, double length, double width) {
     super(color);
     this.length = length;
     this.width = width;
 }

 @Override
 double calculateArea() {
     return length * width;
 }
}

public class Abstraction {
 public static void main(String[] args) {
     Circle circle = new Circle("Red", 5.0);
     Rectangle rectangle = new Rectangle("Blue", 4.0, 6.0);

     circle.displayInfo();
     System.out.println("Area of Circle: " + circle.calculateArea());

     rectangle.displayInfo();
     System.out.println("Area of Rectangle: " + rectangle.calculateArea());
 }
}
