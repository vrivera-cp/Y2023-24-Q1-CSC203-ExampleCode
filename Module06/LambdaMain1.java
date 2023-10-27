import java.util.function.Function;

/**
 * Demonstrates the use of lambda functions in Java using the Function interface.
 *
 * @author Vanessa Rivera
 * @version 1.0
 */
public class LambdaMain1 {

    /**
     * The main entry point for the application.
     *
     * @param args Command-line arguments (unused in this example).
     */
    public static void main(String[] args) {
        // Variable for a lambda function reference variable
        Function<Integer, Integer> f;

        // f must reference a function that:
        // 1. accepts an Integer
        // 2. returns an Integer

        // Assigning a lambda function
        f = x -> 2 * x;

        // This is the syntax for a lambda function:
        // - Parameter(s) on the left of
        // - an arrow "->"
        // - An expression to return on the right

        // "Calling" the lambda function
        int result = f.apply(100);

        // This will calculate x * 2 = 100 * 2
        System.out.println(result);
    }
}
