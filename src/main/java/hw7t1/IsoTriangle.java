package hw7t1;

public class IsoTriangle extends Triangle{
    public IsoTriangle(double side, double base) {
    super(side, base, 60);
}

    public double calculateSquare() {
        return (side1 * side3) / 2;
    }
}
