public class DigitalSong extends Song {

    private int listens;

    public DigitalSong(String name, String artist, String genre, int duration, int listens) {
        super(name, artist, genre, duration);
        this.listens = listens;
    }

    public int getListens() { return listens; }

    // instanceof version
//    @Override
//    public boolean equals(Object o) {
//        if (super.equals(o) && o instanceof DigitalSong ds) {
//            return listens == ds.listens;
//        }
//        return false;
//    }

    // getClass version
//    @Override
//    public boolean equals(Object o) {
//        if (super.equals(o)) {
//            DigitalSong ds = (DigitalSong) o;
//            return listens == ds.listens;
//        }
//        return false;
//    }

}