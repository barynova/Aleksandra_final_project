package hw7t1;

public class IsoTrapezoid extends Quadrangle {
    public IsoTrapezoid(double base1, double base2, double height) {
        super(base1, base2, height);
    }

    public double calculateSquare() {
        return (side1 + side2) / 2 * side3;
    }
}
