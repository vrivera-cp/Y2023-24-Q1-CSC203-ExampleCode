public class Song {
    private String name;
    private String artist;
    private String genre;
    private int duration;

    public Song(String name, String artist, String genre, int duration) {
        this.name = name;
        this.artist = artist;
        this.genre = genre;
        this.duration = duration;
    }

    public String getName() { return name; }

    public String getArtist() { return artist; }

    public String getGenre() { return genre; }

    public int getDuration() { return duration; }

    public void remix(String remixedGenre) { genre = remixedGenre; }

    @Override
    public String toString() {
        return String.format("%s by %s, %s (%d sec)", name, artist, genre, duration);
    }

    // Complete Equals Here
}