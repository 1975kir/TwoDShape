package TwoDShape;

public class Shapes {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle();

        t1.width1 = 4.0;
        t1.height = 4.0;
        t1.style = "закрашенный";

        t2.width1 = 8.0;
        t2.height = 12.0;
        t2.style = "контурный";

        System.out.println("Информация о t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Площадь - " + t1.area());

        System.out.println();

        System.out.println("Информация о t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Площадь - " + t2.area());

        System.out.println();

        Square t3 = new Square();
        Square t4 = new Square();

        t3.width1 = 5.0;
        t3.height = 5.0;
        t3.style = "в полоску";

        t4.width1 = 6.0;
        t4.height = 10.0;
        t4.style = "муаровый";

        System.out.println("Информация о t3: ");
        t3.showStyle();
        t3.showDim();
        System.out.println("Площадь - " + t3.area());

        System.out.println();

        System.out.println("Информация о t4: ");
        t4.showStyle();
        t4.showDim();
        System.out.println("Площадь - " + t4.area());

        System.out.println();

        Trapezoid t5 = new Trapezoid();
        Trapezoid t6 = new Trapezoid();

        t5.width1 = 5.0;
        t5.wigth2 = 6.0;
        t5.height = 6.0;
        t5.style = "зелёная";

        t6.width1 = 7.0;
        t6.wigth2 = 8.0;
        t6.height = 10.0;
        t6.style = "синяя";

        System.out.println("Информация о t5: ");
        t5.showStyle();
        t5.showDim();
        System.out.println("Площадь - " + t5.area());

        System.out.println();

        System.out.println("Информация о t6: ");
        t6.showStyle();
        t6.showDim();
        System.out.println("Площадь - " + t6.area());

    }
}
