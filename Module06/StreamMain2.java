import java.util.List;
import java.util.stream.Stream;

/**
 * Demonstrates stream initialization using lists and terminal operations with collectors.
 *
 * @author Vanessa Rivera
 * @version 1.0
 */
public class StreamMain2 {

    /**
     * The main entry point for the application.
     *
     * @param args Command-line arguments (unused in this example).
     */
    public static void main(String[] args) {
        // Initialize a list
        List<String> guardians = List.of(
            "Moon",
            "Mercury",
            "Mars",
            "Jupiter",
            "Venus"
        );

        // Initializing a stream from the list
        Stream<String> guardianStream = guardians.stream();

        // Display the list and stream
        System.out.printf("List:   %s\n", guardians);
        System.out.printf("Stream: %s\n", guardianStream);

        // Working directly on stream elements is not intended

        // Using the stream to:
        // 1. Keep only the first 3 items
        // 2. Convert them to a list
        List<String> earlyGuardians = guardianStream
                .limit(3)
                .toList();
        // Note: Stream operations are usually "dotted" together as above

        // Display the input and output lists
        System.out.printf("List:   %s\n", guardians);
        System.out.printf("New List: %s\n", earlyGuardians);
    }
}