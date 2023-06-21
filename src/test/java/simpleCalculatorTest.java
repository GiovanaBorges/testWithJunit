import org.example.SimpleCalculator;
import org.junit.Assert;
import org.junit.Test;

public class simpleCalculatorTest {

    @Test
    public void twoPlusTwoShouldEqualFour(){
        var calculator = new SimpleCalculator();

        Assert.assertEquals(4,calculator.add(2,2));
    }
}
