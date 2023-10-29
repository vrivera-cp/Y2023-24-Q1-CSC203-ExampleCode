import java.util.List;
import java.util.stream.Stream;

/**
 * Demonstrates the use of map, filter, and reduce operations on streams.
 *
 * @author Vanessa Rivera
 * @version 1.0
 */
public class StreamMain3 {

    /**
     * The main entry point for the application.
     *
     * @param args Command-line arguments (unused in this example).
     */
    public static void main(String[] args) {
        // Initialize a list
        List<String> guardians = List.of(
                "Pluto",
                "Uranus",
                "Neptune",
                "Saturn"
        );

        // Initializing a stream from the list
        Stream<String> guardianStream = guardians.stream();

        // Using the stream to:
        // 1. Map each name to its length.
        // 2. Filter out values less than or equal to 5.
        // 3. Reduce to find the total length of the names.
        int totalLength = guardianStream
                .map(String::length)
                .filter(x -> x > 5)
                .reduce(0, (sum, length) -> sum + length);

        // Display the total length of the names starting with "M"
        System.out.printf("Total length of strings greater than 5 characters is: %d\n", totalLength);
    }
}
