import java.awt.*;

public class Main {


    public static void main(String[] args) {

        Rectangles rectShape = new Rectangles(10, 15, 33, 30);
        Triangles TrianShape = new Triangles(4,4,10, 12);
        Circles circShape = new Circles(5,5,17,15);

        System.out.println("The Area for the rectangle is: " + rectShape.calculateArea() + " and the center of the rectangle is: " + rectShape.center());
        System.out.println("The center point of the circle is: " + circShape.center());
        System.out.println("The triangles circumference is: " + TrianShape.circum());
        System.out.println("Is the point inside the shape: " + Shape.isItInside(circShape, rectShape));
        if (rectShape.center() == circShape.center()){
            System.out.println("The center is the same");
        }
        else {
            System.out.println("Center does not match");
        }
    }
}
abstract class Shape {
    int X;
    int Y;
    int widthShape;
    int heightShape;
    int radius;


public Shape(int x, int y, int width, int height){
    this.X = 1;
    this.Y = 2;
    this.widthShape = width;
    this.heightShape = height;
    this.radius = width/2;

}
    abstract double calculateArea();
    abstract double circum();
    abstract double center();
    abstract boolean isItInside();

    public static boolean isItInside(Circles circ, Rectangles rect){
        boolean isInside = true;
        if (circ.X + circ.Y > rect.X + rect.Y){
            System.out.println(isInside);
            return false;
        }
        return isInside;
    }

}
class Rectangles extends Shape {
    Rectangles(int x, int y, int width, int height){
        super(x, y, width, height);
    }

    @Override
    public double calculateArea() {
        //System.out.println("The area of the rectangle is: ");
        return widthShape * heightShape;
    }

    double circum(){
        return 2 * widthShape + 2 * widthShape;
    }
    double center(){
        return radius;
    }

    @Override
    boolean isItInside() {
        return false;
    }
}

class Triangles extends Shape {
    Triangles(int x, int y, int width, int height){
        super(x, y, width, height);
    }

    @Override
    public double calculateArea() {
        System.out.println("The area of triangle is: " );
        return widthShape * (heightShape / 2);
    }

    double circum(){
        return 4 * heightShape;
    }
    double center(){
        return radius;
    }

    @Override
    boolean isItInside() {
        return false;
    }
}

class Circles extends Shape{
    Circles(int x, int y, int width, int height){
        super(x, y, width, height);
    }

    @Override
    public double calculateArea() {
        System.out.println("The area of the circle is: ");
        return Math.PI*radius * radius;
    }

    double circum(){
        return Math.PI*2*radius;
    }
    double center(){
        return radius;
    }

    @Override
    boolean isItInside() {
        return false;
    }

}