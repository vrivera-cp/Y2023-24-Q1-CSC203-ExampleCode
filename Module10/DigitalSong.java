public class DigitalSong extends Song {

    private int listens;

    public DigitalSong(String name, String artist, String genre, int duration, int listens) {
        super(name, artist, genre, duration);
        this.listens = listens;
    }

    public int listens() { return listens; }

    // Complete Equals Here
}