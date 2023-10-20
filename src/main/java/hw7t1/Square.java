package hw7t1;

public class Square extends Quadrangle{
    public Square(double width, double height, double length) {
        super(width, height, length);
    }

    public double calculateSquare() {
        return side1*side2;
    }
}
