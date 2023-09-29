public class KittenMain {
    public static void main(String[] args) {
        Kitten k = new Kitten("kitten", 10);
        k.incrementAge();
        System.out.println(k.getAge());
    }
}
