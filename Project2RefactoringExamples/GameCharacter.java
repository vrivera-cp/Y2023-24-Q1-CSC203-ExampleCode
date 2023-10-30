import java.util.List;

public abstract class GameCharacter {
    private String name;

    public GameCharacter(String name) {
        this.name = name;
    }

    public abstract void doAction();

    public String getName() { return name; }
}