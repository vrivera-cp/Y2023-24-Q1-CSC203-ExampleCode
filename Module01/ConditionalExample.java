public class ConditionalExample {
    public static void main(String[] args) {
        int course = 203;

        if (course < 203) {
            System.out.println("You're in the wrong course!");
        } else if (course == 203) {
            System.out.println("You're in the right course.");  // This is printed
        } else {
            System.out.println("You're already done with this course!");
        }
    }
}