package exceptionhandling;

public class ExceptionHandling {

    public static void main(String[] args) {
        try {
            // Code that may cause an exception
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Catching and handling the specific exception (ArithmeticException)
            System.out.println("An arithmetic exception occurred: " + e.getMessage());
        } finally {
            // Code that always gets executed, whether an exception occurred or not
            System.out.println("Finally block executed.");
        }

        // Rest of the program
        System.out.println("Program continues...");
    }

    // A method that may throw an exception
    public static int divide(int dividend, int divisor) {
        if (divisor == 0) {
            // Throwing a custom exception (ArithmeticException) with a message
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return dividend / divisor;
    }
}
