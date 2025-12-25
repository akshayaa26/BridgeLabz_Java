package Constructors.Level1;
class Circle {


    double radius;

    Circle() {
        this(1.0);  // Constructor chaining
    }

    Circle(double radius) {
        this.radius = radius;
    }


    void displayRadius() {
        System.out.println("Radius of the circle: " + radius);
    }
}

public class CircleDemo {
    public static void main(String[] args) {

        Circle c1 = new Circle();

        Circle c2 = new Circle(5.5);

        System.out.println("🔵 Circle 1");
        c1.displayRadius();

        System.out.println("\n🔵 Circle 2");
        c2.displayRadius();
    }
}
