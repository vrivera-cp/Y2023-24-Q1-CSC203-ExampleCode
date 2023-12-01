import java.util.Comparator;
import java.util.List;

public class SongComparators {
    public static void main(String[] args) {
        List<Song> playlist = List.of(
                new Song("River Flows in You", "Yiruma", "New-age", 188),
                new Song("While My Guitar Gently Weeps", "The Beatles", "Rock", 286),
                new Song("Moonlight Legend", "DALI","J-pop", 175),
                new Song("Let it Be", "The Beatles", "Rock", 243)
        );

        // Explicit Syntax
        System.out.println("(a, b) -> a.getDuration() - b.getDuration()");
        playlist.stream()

                .sorted((a, b) -> a.getDuration() - b.getDuration())

                .map(s -> "\t" + s)
                .forEach(System.out::println);
        System.out.println();

        // Key Extractor Syntax (for ints)
        System.out.println("Comparator.comparingInt(Song::getDuration)");
        playlist.stream()

                .sorted(Comparator.comparingInt(Song::getDuration))

                .map(s -> "\t" + s)
                .forEach(System.out::println);
        System.out.println();

        // Key Extractor Syntax for objects
        System.out.println("Comparator.comparing(Song::getArtist)");
        playlist.stream()

                .sorted(Comparator.comparing(Song::getArtist))

                .map(s -> "\t" + s)
                .forEach(System.out::println);
        System.out.println();

        // Reversed
        System.out.println("Comparator.comparingInt(Song::getDuration).reversed()");
        playlist.stream()

                .sorted(Comparator.comparingInt(Song::getDuration).reversed())

                .map(s -> "\t" + s)
                .forEach(System.out::println);
        System.out.println();

        // "Tie Breaking"
        System.out.println("Comparator.comparing(Song::getArtist).thenComparing(Song::getName)");
        playlist.stream()

                .sorted(Comparator.comparing(Song::getArtist).thenComparing(Song::getName))

                .map(s -> "\t" + s)
                .forEach(System.out::println);
        System.out.println();

    }
}