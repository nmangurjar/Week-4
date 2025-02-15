package junittests.basicjunittests.exceptionhandling;

import static org.junit.jupiter.api.Assertions.*;

import junit.basicjunittestproblems.testingexceptionhandling.Calculator;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    void testDivideByZero() {
        Calculator calculator = new Calculator();

        // Assert that an ArithmeticException is thrown when dividing by zero
        assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
    }
}
