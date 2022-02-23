package TwoDShape;

    public class Square extends TwoDShape {
        String style;

        double area() {
            return width1 * height;
        }

        void showStyle() {
            System.out.println("Квадрат " + style);
        }
    }

