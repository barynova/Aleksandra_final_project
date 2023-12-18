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
    @Test
    public void testTwoRealRoots() {
        QuadraticEquation equation = new QuadraticEquation(1, -3, 2);
        String result = equation.solve();
        Assert.assertEquals(result, "x1 = 2.00, x2 = 1.00");
    }

    @Test
    public void testOneRealRoot() {
        QuadraticEquation equation = new QuadraticEquation(1, -4, 4);
        String result = equation.solve();
        Assert.assertEquals(result, "x = 2.00");
    }

    @Test
    public void testNoRealRoots() {
        QuadraticEquation equation = new QuadraticEquation(1, 2, 5);
        String result = equation.solve();
        Assert.assertEquals(result, "No real roots");
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
