public class SongEquals {
    public static void main(String[] args) {
        // A song (e.g., "Mario" main theme)
        Song song1 = new Song("Overworld Theme", "Koji Kondo", "8-bit", 180);

        // A different song with the same values (e.g., "Zelda" main theme)
        Song song2 = new Song("Overworld Theme", "Koji Kondo", "8-bit", 180);

        // A "remixed" version of one of the songs
        Song song3 = new Song("Overworld Theme", "Koji Kondo", "classical", 180);

        // Question: What's happening here?
        Song song4 = song1;

        // Question: What is the value of each expression?
        System.out.println(song1 == song2);
        System.out.println(song1.equals(song2));

        System.out.println(song2.equals(song1)); // Question: Does order matter?

        System.out.println(song1 == song3);
        System.out.println(song1.equals(song3));

        System.out.println(song1 == song4);
        System.out.println(song1.equals(song4));

        // Remix an existing song
        song1.remix("classical");

        // Question: What is the value of each expression?
        System.out.println(song1 == song2);
        System.out.println(song1.equals(song2));

        System.out.println(song1 == song3);
        System.out.println(song1.equals(song3));

        System.out.println(song1 == song4);
        System.out.println(song1.equals(song4));
    }
}
