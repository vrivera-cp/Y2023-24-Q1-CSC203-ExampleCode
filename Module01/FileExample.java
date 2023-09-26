import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) {
        try {
            // Reading from a file
            FileReader reader = new FileReader("./Module01/input.txt");
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();

            // Writing to another file
            FileWriter writer = new FileWriter("./Module01/output.txt");
            writer.write("This is a new line of text.");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}