package hw7t1;

public class EqlTriangle extends Triangle{
    public EqlTriangle(double side) {
        super(side, side, 60);
    }

    public double calculateSquare() {
        return (Math.sqrt(3) / 4) * (side1 * side1);
    }
}