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

    // intanceof version
//    @Override
//    public boolean equals(Object o) {
//        if (o instanceof Song s) {
//            return name.equals(s.name) &&
//                    artist.equals(s.artist) &&
//                    genre.equals(s.genre) &&
//                    duration == s.duration;
//        }
//        return false;
//    }

    // getClass version
//    public boolean equals(Object o) {
//        if (o == null) return false;
//        if (o.getClass() != getClass()) return false;
//        Song s = (Song) o;
//        return name.equals(s.name) &&
//                artist.equals(s.artist) &&
//                genre.equals(s.genre) &&
//                duration == s.duration;
//    }
}