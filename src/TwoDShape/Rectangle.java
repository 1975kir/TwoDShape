package TwoDShape;

    public class Rectangle extends TwoDShape {
        String style;

        double area() {
            return width1 * height;
        }

        void showStyle() {
            System.out.println("Прямоугольник " + style);
        }
    }
