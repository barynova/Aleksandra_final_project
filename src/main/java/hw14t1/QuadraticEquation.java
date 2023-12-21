package hw14t1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class QuadraticEquation {
    public double a;
    public double b;
    public double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String solve() {
        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            return "x1 = " + x1 + ", x2 = " + x2;
        } else if (discriminant == 0) {
            double x = -b / (2 * a);
            return "x = " + x;
        } else {
            return "No real roots";
        }
    }

}
