package hw7t1;

public class Triangle extends Figures{

    double angle;

    public Triangle(double side1, double side2, double angle) {
        super();
        this.angle = angle;
    }

    public double getAngle() {
        return angle;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }


    public double calculateSquare() {
        double halfSidesSum = (side1 + side2 + side3) / 2;
        return Math.sqrt(halfSidesSum * (halfSidesSum - side1) * (halfSidesSum - side2) * (halfSidesSum - side3));
    }
}

