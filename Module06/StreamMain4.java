import java.util.List;
import java.util.stream.Stream;
import java.util.Random;

/**
 * Demonstrates grid-based tasks using streams.
 *
 * @author Vanessa Rivera
 * @version 1.0
 */
public class StreamMain4 {

    // Constants defining the size of the arena and the position of the adversary
    public static final int ARENA_WIDTH = 9;
    public static final int ARENA_HEIGHT = 9;
    public static final Point ADVERSARY_POSITION = new Point(4, 4);
    public static final int CHECK_DISTANCE = 4;

    // Graphic symbols to represent the adversary and the positions on the grid
    public static final char ADVERSARY_GRAPHIC = 'X';
    public static final char POSITION_GRAPHIC_NEAR = ' ';
    public static final char POSITION_GRAPHIC_FAR = '.';

    /**
     * The main entry point for the application.
     *
     * @param args Command-line arguments (unused in this example).
     */
    public static void main(String[] args) {
        // Initialize a list
        List<String> guardians = List.of(
                "Moon", "Mercury", "Venus", "Mars", "Jupiter",
                "Saturn", "Uranus", "Neptune", "Pluto"
        );

        // Using Stream.Builder to generate all possible positions in our arena
        Stream.Builder<Point> pointBuilder = Stream.builder();

        for (int i = 0; i < ARENA_HEIGHT; ++i) {
            for (int j = 0; j < ARENA_WIDTH; ++j) {
                pointBuilder.add(new Point(j, i));
            }
        }

        // Convert the builder to a stream
        Stream<Point> pointStream = pointBuilder.build();

        // Process positions, selecting those near the adversary for guardians
        Random rand = new Random();
        List<Point> guardianPositions = pointStream
                .filter(p -> !p.equals(ADVERSARY_POSITION))         // Exclude adversary's position
                .filter(p -> p.manhattanDistanceTo(ADVERSARY_POSITION) < CHECK_DISTANCE)  // Within a certain range
                .sorted((e1, e2) -> rand.nextInt(3) - 1)     // Randomize the order
                .limit(guardians.size())                            // Limit to number of guardians
                .toList();                                          // Collect to a list

        // Print column headers for the arena
        System.out.print("   "); // Space for row header
        for (int j = 0; j < ARENA_WIDTH; ++j) {
            System.out.print(j + " ");
        }
        System.out.println();

        // Print separator line
        System.out.print("  ");
        for (int j = 0; j < ARENA_WIDTH; ++j) {
            System.out.print("--");
        }
        System.out.println();

        // Print the arena content
        for (int i = 0; i < ARENA_HEIGHT; ++i) {
            System.out.print(i + "| "); // Row header
            for (int j = 0; j < ARENA_WIDTH; ++j) {
                Point p = new Point(j, i);
                // Check and display guardian, adversary, or position graphics as appropriate
                if (guardianPositions.contains(p)) {
                    int index = guardianPositions.indexOf(p);
                    System.out.print(guardians.get(index).charAt(0));
                } else if (p.equals(ADVERSARY_POSITION)) {
                    System.out.print(ADVERSARY_GRAPHIC);
                } else if (p.manhattanDistanceTo(ADVERSARY_POSITION) < CHECK_DISTANCE) {
                    System.out.print(POSITION_GRAPHIC_NEAR);
                } else {
                    System.out.print(POSITION_GRAPHIC_FAR);
                }
                System.out.print(" ");
            }
            System.out.println(); // Move to the next line for the next row
        }
    }
}