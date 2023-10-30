import java.util.function.Function;

/**
 * Demonstrates the use of lambda functions containing multiple statements in Java using the Function interface.
 *
 * @author Vanessa Rivera
 * @version 1.0
 */
public class
LambdaMain2 {

    /**
     * The main entry point for the application.
     *
     * @param args Command-line arguments (unused in this example).
     */
    public static void main(String[] args) {
        // Variable for a lambda function reference variable
        Function<Double, Double> g;

        // g must reference a function that:
        // 1. accepts a Double
        // 2. returns a Double

        // Assigning a lambda function
        g = x -> {
            double y = 2.0;
            return y * x;
        };

        // This is another syntax for a lambda function:
        // - Parameter(s) on the left of the equals
        // - an arrow "->"
        // - A body enclosed by brackets containing
        // - In this case, a return statement is needed

        // "Calling" the lambda function
        Double result = g.apply(100.0);

        // This will calculate 2.0 * x = 2.0 * 100.0
        System.out.println(result);
    }
}
