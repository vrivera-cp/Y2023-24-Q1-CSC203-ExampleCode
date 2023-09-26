import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> charactersArrayList = new ArrayList<>();
        charactersArrayList.add("mario");
        charactersArrayList.add("zelda");
        charactersArrayList.add("kirby");

        List<String> charactersLinkedList = new LinkedList<>();
        charactersLinkedList.add("mario");
        charactersLinkedList.add("zelda");
        charactersLinkedList.add("kirby");
    }
}