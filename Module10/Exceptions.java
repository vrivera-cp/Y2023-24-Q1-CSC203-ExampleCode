import java.util.List;
import java.util.stream.Stream;

public class Exceptions {
    public static void main(String[] args) {
        System.out.println("mochi");
        Outer("mochi");

        System.out.println("harvest");
        Outer("harvest");

        System.out.println("pearl");
        Outer("pearl");

        System.out.println("waffles");
        Outer("waffles");

        System.out.println("walter");
        Outer("walter");

        System.out.println("Empty String");
        Outer("");
    }

    public static void Outer(String str) {
        System.out.println("\tOuter: Begin");
        try {
            if (!str.equals("waffles")) {
                Inner(str);
            }
        } catch (ArithmeticException e) {
            System.out.println("\tOuter: Arithmetic");
        } catch (NullPointerException e) {
            System.out.println("\tOuter: NullPointer");
        } finally {
            System.out.println("\tOuter: finally");
        }
        System.out.println("\tOuter: End");
    }

    public static void Inner(String str) {
        System.out.println("\t\tInner: Begin");
        try {
            switch (str) {
                case "mochi" -> {
                    double x = 100 / 0;
                }
                case "harvest" -> {
                    List<Point> points = List.of(new Point(0, 0));
                    Point myPoint = points.get(100000);
                }
                case "pearl" -> {
                    String a = "a";
                    String b = null;
                    b.equals(a);
                }
                case "walter" -> {
                    Stream<Integer> intStream = Stream.of(1, 2, 3);
                    List<Integer> intList = intStream.toList();
                    List<Integer> intListCopy = intStream.toList();
                }
                default -> {
                    System.out.println("\t\tInner: Return");
                    return;
                }
            }
        } catch (ArithmeticException e) {
            System.out.println("\t\tInner: Arithmetic");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("\t\tInner: IndexOutOfBounds");
        } finally {
            System.out.println("\t\tInner: finally");
        }
        System.out.println("\t\tInner: End");
    }
}