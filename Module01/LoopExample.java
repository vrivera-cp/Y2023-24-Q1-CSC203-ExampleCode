import java.util.ArrayList;
import java.util.List;

public class LoopExample {
    public static void main(String[] args) {
        List<String> characters = new ArrayList<>();
        characters.add("bowser");
        characters.add("gannon");
        characters.add("king dedede");

        // Using enhanced for loop
        for (String character : characters) {
            System.out.println(character);
        }

        // Using traditional for loop
        for (int i = 0; i < characters.size(); i++) {
            System.out.println(characters.get(i));
        }
    }
}