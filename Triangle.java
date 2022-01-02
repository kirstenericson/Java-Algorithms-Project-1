//Kirsten Ericson (erics163@umn.edu) and Shivali Mukherji (mukhe105@umn.edu)
import java.awt.Color;
public class Triangle {
        private double xbottomleftcornerpos = 0;
        private double ybottomleftcornerpos = 0;
        private double width = 0;
        private double height = 0;
        private Color color;
        //do I need a color instance variable ?
        public Triangle(double xbl, double ybl, double w, double h){
            xbottomleftcornerpos = xbl;
            ybottomleftcornerpos = ybl;
            width = w;
            height = h;
        }
        public double calculatePerimeter(){
            double perimeter =  width + 2 * (Math.sqrt(((width/2)*(width/2))+(height*height)));
            return perimeter;
        }
        public double calculateArea(){
            double area = 0.5 * width * height;
            return area;
        }
        public void setColor(Color c){
            color = c;
            // ????? go back and look at this idk
        }
        public void setPos(double x, double y){
            xbottomleftcornerpos = x;
            ybottomleftcornerpos = y;
        }
        public void setWidth(double w){
            width = w;
        }
        public void setHeight(double h){
            height = h;
        }
        public Color getColor(){
            return color;
        }
        public double getXPos(){
            return xbottomleftcornerpos;
        }
        public double getYPos(){
            return ybottomleftcornerpos;
        }
        public double getHeight(){
            return height;
        }
        public double getWidth(){
            return width;
        }
        //testin out my stuff
        public static void main(String[]args){
            Triangle test = new Triangle(0,0, 4, 6);
            System.out.println(test.getXPos());
            System.out.println(test.calculatePerimeter());
            System.out.println(test.calculateArea());
            test.setPos(4, 100);
            System.out.println("The x value is: " + test.getXPos() + " The y value is :" + test.getYPos());


        }

}
