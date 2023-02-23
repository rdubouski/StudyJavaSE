/*
Создать подкласс Circle, производный от TwoDShape, и определить в нем метод area().
А так же конструктор с ключевым словом super.
 */
package BookSchildtFirst.main.chapter7;

abstract class TwoDShape{
    private double width;
    private double height;
    private String name;

    TwoDShape() {
        width = height = 0;
        name = "none";
    }

    TwoDShape(double w, double h, String n){
        width = w;
        height = h;
        name = n;
    }

    TwoDShape(double x, String n) {
        width = height = x;
        name = n;
    }

    TwoDShape(TwoDShape ob) {
        width = ob.width;
        height = ob.height;
        name = ob.name;
    }

    double getWidth() {return width;}
    double getHeight() {return height;}
    String getName() {return name;}
    void setWidth(double w) {width = w;}
    void setHeight(double h) {height = h;}

    void showDim(){
        System.out.println("wigth and height = " + width + " and " + height);
    }

    abstract double area();
}

class Circle extends TwoDShape {

    Circle() {
        super();
    }

    Circle(double x) {
        super(x, "Circle");
    }

    Circle(Circle ob) {
        super(ob);
    }

    @Override
    double area() {
        return (getWidth() / 2) * (getWidth() / 2) * 3.14;
    }
}

public class Task2 {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println("area = " + circle.area());
    }

}
