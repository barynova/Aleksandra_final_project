package hw7t1;

public class Circle extends Figures{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    public double calculateSquare() {
        return Math.PI * radius * radius;
    }
}
