package TwoDShape;

public class Trapezoid extends TwoDShape {
    String style;

    double area() {
        return (height * (width1 + wigth2))/2;
    }

    void showStyle() {
        System.out.println("Трапеция " + style);
    }
}