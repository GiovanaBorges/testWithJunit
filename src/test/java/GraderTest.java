import junit.framework.TestCase;
import org.example.Grader;
import org.junit.Assert;
import org.junit.Test;

public class GraderTest {

    @Test
    public void fiftyNineShouldReturnF(){
        var grader = new Grader();
        Assert.assertEquals('F',grader.determineLetterGrade(59));
    }

    @Test
    public void sistyNineShouldReturnD(){
        var grader = new Grader();
        Assert.assertEquals('D',grader.determineLetterGrade(69));
    }

    @Test
    public void seventyNineShouldReturnC(){
        var grader = new Grader();
        Assert.assertEquals('C',grader.determineLetterGrade(79));
    }

    @Test
    public void eightNineShouldReturnB(){
        var grader = new Grader();
        Assert.assertEquals('B',grader.determineLetterGrade(89));
    }

    @Test
    public void nineNineShouldReturnA(){
        var grader = new Grader();
        Assert.assertEquals('A',grader.determineLetterGrade(99));
    }

    @Test
    public void eightyShouldReturnB(){
        var grader = new Grader();
        Assert.assertEquals('B',grader.determineLetterGrade(80));
    }
    @Test
    public void ninetyShouldReturnA(){
        var grader = new Grader();
        Assert.assertEquals('A',grader.determineLetterGrade(90));
    }

    @Test
    public void seventyShouldReturnC(){
        var grader = new Grader();
        Assert.assertEquals('C',grader.determineLetterGrade(70));
    }

    @Test
    public void sixtyShouldReturnD(){
        var grader = new Grader();
        Assert.assertEquals('D',grader.determineLetterGrade(60));
    }

    @Test
    public void zeroShouldReturnF(){
        var grader = new Grader();
        Assert.assertEquals('F',grader.determineLetterGrade(0));
    }

    // when a test return an exception automatically the test failed.
    public void negativeOneShouldReturnIllegalArgumentException(){
        var grader = new Grader();
        Assert.assertThrows(IllegalArgumentException.class, () ->{
            grader.determineLetterGrade(-1);
        });
    }
}