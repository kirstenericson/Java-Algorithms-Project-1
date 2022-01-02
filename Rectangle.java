//Kirsten Ericson (erics163@umn.edu) and Shivali Mukherji (mukhe105@umn.edu)
import java.awt.Color;
public class Rectangle {
    private double xupperleftcorner = 0;
    private double yupperleftcorner = 0;
    private double width = 0;
    private double height = 0;
    private Color color;
    public Rectangle(double x, double y, double w, double h){
        xupperleftcorner = x;
        yupperleftcorner = y;
        width = w;
        height = h;
    }
    public double calculatePerimeter(){
        double perimeter = (width*2) + (height*2);
        return perimeter;
    }
    public double calculateArea(){
        double area = width * height;
        return area;
    }
    public void setColor(Color c){
        color = c;
   }
    public void setPos(double x, double y){
        xupperleftcorner = x;
        yupperleftcorner = y;
    }
    public void setHeight(double h){
        height = h;
    }
    public void setWidth(double w){
        width = w;
    }
    public Color getColor(){
        return color;
    }
    public double getXPos(){
        return xupperleftcorner;
    }
    public double getYPos(){
        return yupperleftcorner;
    }
    public double getHeight(){
        return height;
    }
    public double getWidth(){
        return width;
    }
    public static void main(String[]args){
        Rectangle test = new Rectangle(0,0, 4, 6);
        System.out.println(test.getXPos());
        System.out.println(test.calculatePerimeter());
        System.out.println(test.calculateArea());
        test.setPos(4, 100);
        System.out.println("The x value is: " + test.getXPos() + " The y value is :" + test.getYPos());


    }




}
