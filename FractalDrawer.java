//Kirsten Ericson (erics163@umn.edu) and Shivali Mukherji (mukhe105@umn.edu)
// FractalDrawer class draws a fractal of a shape indicated by user input

import java.awt.Color;
import java.util.Scanner;

public class FractalDrawer {
    private double totalArea=0;  // member variable for tracking the total area

    public FractalDrawer() {}  // constructor


    //TODO:
    // drawFractal creates a new Canvas object
    // and determines which shapes to draw a fractal by calling appropriate helper function
    // drawFractal returns the area of the fractal
    public double drawFractal(String type) {
        Canvas c = new Canvas(1000, 1000);
        if (type.equals("Triangle")) {
            drawTriangleFractal(200, 200, 400, 500, Color.MAGENTA, c, 0);
            return totalArea;
        }
            if (type.equals("Rectangle")) {
                drawRectangleFractal(200, 200, 400, 350, Color.MAGENTA, c, 0);
                return totalArea;
            }
            if (type.equals("Circle")) {
                drawCircleFractal(100, 400, 400, Color.MAGENTA, c, 0);
                return totalArea;
            } else {
                return 0;
            }
        }

    //TODO:
    // drawTriangleFractal draws a triangle fractal using recursive techniques
        public void drawTriangleFractal(double width, double height, double x, double y, Color c, Canvas can, int level){
        if (level < 8){
            Triangle myTriangle = new Triangle(x, y, width, height);
            double individualarea = myTriangle.calculateArea();
            totalArea += individualarea;
            myTriangle.setColor(c);
            can.drawShape(myTriangle);
            Color color = pickRandomColor();
            drawTriangleFractal(width/2.0, height/2.0, x-(width/2.0), y, color, can, level+1); //lower left triangle
            drawTriangleFractal(width/2.0, height/2.0, x+(width/4.0), y-height, color, can, level+1); //upper triangle
            drawTriangleFractal(width/2.0, height/2.0, x+width, y, color, can, level+1);//lower right triangle
        }
    }


    // TODO:
    // drawCircleFractal draws a circle fractal using recursive techniques
    public void drawCircleFractal(double radius, double x, double y, Color c, Canvas can, int level) {
        if (level < 8){
            Circle myCircle = new Circle(radius, x, y);
            double individualarea = myCircle.calculateArea();
            totalArea += individualarea;
            myCircle.setColor(c);
            can.drawShape(myCircle);
            Color color = pickRandomColor();
            drawCircleFractal(radius / 2.0, x + radius + (radius / 2.0), y, color, can, level+1);
            drawCircleFractal(radius / 2.0, x - radius - (radius / 2.0), y, color, can, level+1);
            drawCircleFractal(radius / 2.0, x, y + radius + (radius / 2.0), color, can, level+1);
            drawCircleFractal(radius / 2.0, x, y - radius - (radius / 2.0), color, can, level+1);
        }
    }


    //TODO:
    // drawRectangleFractal draws a rectangle fractal using recursive techniques
    public void drawRectangleFractal(double width, double height, double x, double y, Color c, Canvas can, int level) {
        if (level < 8){
            Rectangle myRectangle = new Rectangle(x, y, width, height);
            double individualarea = myRectangle.calculateArea();
            totalArea += individualarea;
            myRectangle.setColor(c);
            can.drawShape(myRectangle);
            Color color = pickRandomColor();
            drawRectangleFractal(width/2.0, height/2.0, x-(width/2.0), y+height, color, can, level+1); //lower left rectangle
            drawRectangleFractal(width/2.0, height/2.0, x+width, y-(height/2.0), color, can, level+1); //upper right rectangle
            drawRectangleFractal(width/2.0, height/2.0, x+width, y + height, color, can, level+1);//lower right rectangle
            drawRectangleFractal(width/2.0, height/2.0, x-(width/2.0), y-(height/2.0), color, can, level+1); //upper left rectangle
        }
    }
    public Color pickRandomColor() {
        int random = (int) (Math.random() * 10);
        if (random == 0)
            return Color.RED;
        if (random == 1)
            return Color.ORANGE;
        if (random == 2)
            return Color.YELLOW;
        if (random == 3)
            return Color.GREEN;
        if (random == 4)
            return Color.BLUE;
        if (random == 5)
            return Color.BLACK;
        if (random == 6)
            return Color.PINK;
        if (random == 7)
            return Color.CYAN;
        if (random == 9)
            return Color.MAGENTA;
        else{
            return Color.RED;
        }
    }
    //TODO:
    // main should ask user for shape input, and then draw the corresponding fractal.
    // should print area of fractal
    public static void main(String[] args){
        FractalDrawer frac = new FractalDrawer();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Circle, Triangle, or Rectangle");
        String input = s.nextLine();
        System.out.println("The total area is: " + frac.drawFractal(input) + " units squared");

    }
}
