import java.util.*;
//import java.lang.*;

class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }

    // double getAreac() {
    // return Math.PI * radius * radius;
    // }

}

class Cylinder extends Circle {
    double hight;

    Cylinder(double radius, double hight) {
        super(radius);
        this.hight = hight;
    }

    double getArea() {
        return Math.PI * super.getArea() * radius * hight;
    }
}

public class test {
    public static void main(String[] args) {
        Circle c1 = new Circle(2.5);
        System.out.println(c1.getArea());

        Cylinder cy1 = new Cylinder(2.5, 3.0);
        System.out.println(cy1.getArea());

        // upcasting
        Circle c2 = new Cylinder(2.5, 3.0);
        System.out.println(c2.getArea());

        // downcasting
        Circle c3 = new Cylinder(2.5, 3.0);
        Cylinder cy2;
        cy2 = (Cylinder) c3;
        System.out.println(cy2.getArea());

    }
    // error
    // can not do this

    // Circle c4 = new Circle(2.5);
    // Cylinder cy3 = (Cylinder) c4;
    // System.out.println(cy3.getArea());

}
