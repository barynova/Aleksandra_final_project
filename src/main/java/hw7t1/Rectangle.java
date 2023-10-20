package hw7t1;

public class Rectangle extends Quadrangle{
    public Rectangle(double width, double height, double length) {
        super(width, height, length);
    }

    public double calculateSquare() {
        return length * width;
    }

}
