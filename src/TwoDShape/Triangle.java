package TwoDShape;

public class Triangle extends TwoDShape {
    String style;

    double area() {
        return  width1 * height / 2;
    }
    void showStyle () {
        System.out.println("Треугольник " + style);
    }

}
