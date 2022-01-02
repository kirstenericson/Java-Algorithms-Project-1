//Kirsten Ericson (erics163@umn.edu) and Shivali Mukherji (mukhe105@umn.edu)
import java.awt.Color;

public class Circle {
    private double x;
    private double y;
    private double radius;
    private Color color;

    public Circle(double r, double xPos, double yPos) {
        radius = r;
        x = xPos;
        y = yPos;
    }

    public double calculatePerimeter() {
        double perimeter = 3.141592653589 * 2 * radius;
        return perimeter;
    }

    public double calculateArea() {
        double area = 3.141592653589 * radius * radius;
        return area;
    }

    public void setColor(Color c) {
        color = c;
    }

    public void setPos(double xValue, double yValue) {
        x = xValue;
        y = yValue;
    }

    public void setRadius(double rLength) {
        radius = rLength;
    }

    public Color getColor() {
        return color;
    }


    public double getXPos() {
        return x;
    }

    public double getYPos() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    public static void main(String[] args) {
        Circle c = new Circle(5, -9.8, 7.3);
        System.out.println("Radius: " + c.radius);
        System.out.println("Perimeter: " + c.calculatePerimeter());
        System.out.println("Area: " + c.calculateArea());
    }


}
