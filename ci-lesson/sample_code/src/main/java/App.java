/**
 * A simple application to demonstrate CI/CD with Javadoc deployment.
 */
public class App {

    /**
     * The entry point of the application.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        System.out.println("Welcome to the CI/CD Pipeline with Deployment!");
        
        // Example usage of the Calculator class
        Calculator calculator = new Calculator();
        int result = calculator.add(10, 5);
        System.out.println("10 + 5 = " + result);
    }
}

/**
 * A utility class that provides basic mathematical operations.
 */
class Calculator {

    /**
     * Adds two integers.
     *
     * @param a First integer.
     * @param b Second integer.
     * @return The sum of the two integers.
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Subtracts one integer from another.
     *
     * @param a The minuend.
     * @param b The subtrahend.
     * @return The difference of the two integers.
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Multiplies two integers.
     *
     * @param a First integer.
     * @param b Second integer.
     * @return The product of the two integers.
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Divides one integer by another.
     *
     * @param a The dividend.
     * @param b The divisor. Must not be zero.
     * @return The quotient of the two integers.
     * @throws ArithmeticException If the divisor is zero.
     */
    public double divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return (double) a / b;
    }
}
