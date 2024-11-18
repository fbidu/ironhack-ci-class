import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the Calculator class.
 */
public class AppTest {

    private final Calculator calculator = new Calculator();

    @Test
    public void testAddition() {
        // Test addition of positive numbers
        assertEquals(15, calculator.add(10, 5), "10 + 5 should equal 15");

        // Test addition of negative numbers
        assertEquals(-7, calculator.add(-3, -4), "-3 + -4 should equal -7");

        // Test addition with zero
        assertEquals(10, calculator.add(10, 0), "10 + 0 should equal 10");
    }

    @Test
    public void testSubtraction() {
        // Test subtraction of positive numbers
        assertEquals(5, calculator.subtract(10, 5), "10 - 5 should equal 5");

        // Test subtraction resulting in a negative number
        assertEquals(-1, calculator.subtract(3, 4), "3 - 4 should equal -1");

        // Test subtraction with zero
        assertEquals(10, calculator.subtract(10, 0), "10 - 0 should equal 10");
    }

    @Test
    public void testMultiplication() {
        // Test multiplication of positive numbers
        assertEquals(50, calculator.multiply(10, 5), "10 * 5 should equal 50");

        // Test multiplication by zero
        assertEquals(0, calculator.multiply(10, 0), "10 * 0 should equal 0");

        // Test multiplication of negative numbers
        assertEquals(12, calculator.multiply(-3, -4), "-3 * -4 should equal 12");
    }

    @Test
    public void testDivision() {
        // Test division of positive numbers
        assertEquals(2.0, calculator.divide(10, 5), "10 / 5 should equal 2.0");

        // Test division resulting in a fractional number
        assertEquals(2.5, calculator.divide(5, 2), "5 / 2 should equal 2.5");

        // Test division of negative numbers
        assertEquals(2.0, calculator.divide(-10, -5), "-10 / -5 should equal 2.0");
    }

    @Test
    public void testDivisionByZero() {
        // Test division by zero
        Exception exception = assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
        assertEquals("Division by zero is not allowed.", exception.getMessage());
    }
}
