package hw6t3;

//Описати клас трикутник (поля описуєте самостійно) з методами:
//- геттери
//- підрахунку периметру трикутника
//- підрахунку площі трикутника
public class Triangle {
    double side1;
    double side2;
    double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    //Геттер side1
    public double getSide1() {
        return this.side1;
    }

    //Геттер side2
    public double getSide2() {
        return this.side2;
    }

    //Геттер side3
    public double getSide3() {
        return this.side3;
    }

    // Периметр сторона1+сторона2+сторона3
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }

    //Площа √(півпериметр * (півпериметр - сторона1) * (півпериметр - сторона2) * (півпериметр - сторона3))
    public double calculateSquare() {
        double halfPerimeter = calculatePerimeter() / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - side1) * (halfPerimeter - side2) * (halfPerimeter - side3));
    }

    public static void showInfo(String[] args) {
        Triangle triangle = new Triangle(3.0, 4.0, 5.0);

        System.out.println("Side1: " + triangle.getSide1());
        System.out.println("Side2: " + triangle.getSide2());
        System.out.println("Side3: " + triangle.getSide3());

        double perimeter = triangle.calculatePerimeter();
        System.out.println("Perimeter is: " + perimeter);

        double square = triangle.calculateSquare();
        System.out.println("Square is: " + square);
    }
}
