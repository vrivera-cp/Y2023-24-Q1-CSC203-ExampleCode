import java.util.function.Predicate;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

/**
 * Demonstrates the use of several different functional interfaces.
 *
 * @author Vanessa Rivera
 * @version 1.0
 */
public class LambdaMain4 {

    /**
     * The main entry point for the application.
     *
     * @param args Command-line arguments (unused in this example).
     */
    public static void main(String[] args) {
        // ---------
        // Predicate
        // ---------

        // Variable for a lambda function reference variable
        Predicate<Integer> a = x -> x > 100;

        // A Predicate:
        // 1. Accepts the specified type as a parameter
        // 2. Always returns a boolean value

        System.out.println(a.test(100));
        // Predicates are called using `test()`, not `apply()`

        // -----------
        // BiPredicate
        // -----------

        // Variable for a lambda function reference variable
        BiPredicate<Integer, Double> b = (x, y) -> x > y;

        // A BiPredicate:
        // 1. Accepts the two specified types as parameters
        // 2. Always returns a boolean value

        System.out.println(b.test(100, 100.0));
        // Predicates are also called using `test()`

        // --------
        // Consumer
        // --------

        // Variable for a lambda function reference variable
        Consumer<String> c = x -> System.out.print(x + "!!!!!!!");

        // A Consumable:
        // 1. Accepts the specified type as a parameter
        // 2. Does not return anything

        c.accept("mochi");
        // Consumables are called using `accept()`
    }
}
