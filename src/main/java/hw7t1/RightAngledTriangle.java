package hw7t1;

public class RightAngledTriangle extends Triangle{
    public RightAngledTriangle(double side1, double side2) {
        super(side1, side2, 90);
    }

    public double calculateSquare() {
        return (side1 * side2) / 2;
    }
}
