public class EqualityExample {
    public static void main(String[] args) {
        int x = 5;
        double y = 5.0;
        String z = "5";

        System.out.println(x == y);  // true, as in Python
        System.out.println(z.equals(x));  // false, since an integer and a string aren't comparable in this manner
        System.out.println(z.equals("5"));  // true, because the String values are equivalent
    }
}