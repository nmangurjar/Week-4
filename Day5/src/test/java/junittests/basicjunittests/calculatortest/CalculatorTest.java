package junittests.basicjunittests.calculatortest;
import junit.basicjunittestproblems.testingcalculatorclass.Calculator;
import org.junit.Assert;
import org.junit.Test;
public class CalculatorTest {

  @Test
    public void additionTest(){
        Calculator c = new Calculator();
        int a = 10;
        int b = 20;
        Assert.assertEquals((a+b),c.add(a,b));

    }
    @Test
    public void subtractionTest(){
        Calculator c = new Calculator();
        int a = 10;
        int b = 20;
        Assert.assertEquals((a-b),c.subtract(a,b));

    }
    @Test
    public void multiplicationTest(){
        Calculator c = new Calculator();
        int a = 10;
        int b = 20;
        Assert.assertEquals((a*b),c.multiply(a,b));

    }
    @Test
    public void divisionTest(){
        Calculator c = new Calculator();
        int a = 10;
        int b = 20;
        Assert.assertEquals((a/b),c.divide(a,b));

    }
    @Test
    public void divisionByZero(){
        Calculator c = new Calculator();
        int a = 10;
        int b = 0;
        try{
            Assert.assertEquals((a/b),c.divide(a,b));
        }catch (ArithmeticException e){
            System.out.println(e);
        }

    }
}
