package hw7t1;

public class Parallelogram extends Quadrangle{

    double base;
    public Parallelogram(double width, double height, double length, double base) {
        super(width, height, length);
        this.base = base;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double calculateSquare() {
        return base * height;
    }


}
