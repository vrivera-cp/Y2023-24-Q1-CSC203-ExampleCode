import java.util.function.BiFunction;

/**
 * Demonstrates the use of lambda function with multiple parameters in Java using the BiFunction interface.
 *
 * @author Vanessa Rivera
 * @version 1.0
 */
public class LambdaMain3 {

    /**
     * The main entry point for the application.
     *
     * @param args Command-line arguments (unused in this example).
     */
    public static void main(String[] args) {
        // Variable for a lambda function reference variable
        BiFunction<Integer, Double, String> h;

        // h must reference a function that:
        // 1. accepts an Integer
        // 2. accepts a Double
        // 3. returns a String

        // Assigning a lambda function
        h = (x, y) -> "" + x * y;

        // This is another syntax for a lambda function:
        // - Parameter(s) on the left of
        // - In this case, we use parentheses because we have >1 parameter
        // - an arrow "->"
        // - An expression to return

        // "Calling" the lambda function
        String result = h.apply(2, 100.0);

        // This will calculate 2 * 100.0
        System.out.println(result);
    }
}
