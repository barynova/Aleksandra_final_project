import hw14t1.QuadraticEquation;
import org.testng.Assert;
import org.testng.annotations.Test;

//Tests only
public class QuadraticEquationTest {

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
}
