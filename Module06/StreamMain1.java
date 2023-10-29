import java.util.stream.Stream;

/**
 * Demonstrates stream initialization, intermediate, and termination operations.
 *
 * @author Vanessa Rivera
 * @version 1.0
 */
public class StreamMain1 {

    /**
     * The main entry point for the application.
     *
     * @param args Command-line arguments (unused in this example).
     */
    public static void main(String[] args) {
        // Stream Initialization
        Stream<String> adversaries = Stream.of(
                "Jadeite",
                "Nephrite",
                "Zoisite",
                "Kunzite"
        );

        // Intermediate Operation
        Stream<String> sortedAdversaries = adversaries.sorted();

        // Intermediate operations:
        // - return a stream
        // - typically aren't stored in a variable, as in this example

        // Termination operation
        sortedAdversaries.forEach(System.out::println);

        // Note: most stream methods accept lambda functions

        // Terminal operations:
        // - consume a stream
        // - typically return a non-stream value or are void

        // Trying to consume a stream again produces an error
        try {
            adversaries.forEach(System.out::println);
        } catch (IllegalStateException e) {
            System.out.println("You can't print the same stream again, magical guardians!");
        }
    }
}