import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GameCharacterMain {
    public static void main(String[] args) {
        // Create a roster of game characters
        Map<String, GameCharacter> roster = new HashMap<>();

        roster.put("Luigi", new Plumber("Luigi"));
        
        roster.put("Mega Man", new ArmCannoneer("Mega Man",   10));
        roster.put("Samus", new ArmCannoneer("Samus Aran", 100));
        
        roster.put("Red", new CreatureTrainer("Ash", new ArrayList<>(List.of("Pikachu"))));
        roster.put("Blue", new CreatureTrainer("Gary", new ArrayList<>(List.of("Eevee"))));

        // Perform actions
        for (GameCharacter gameCharacter : roster.values()) {
            gameCharacter.doAction();
        }
        
        // Jumping
        for (GameCharacter gameCharacter : roster.values()) {
            if (gameCharacter instanceof Jumpable jumper) { // "pattern matching": Automatically typecasts and assigns to new variable
                jumper.jump();
            }
        }
        
        // Recharging
        for (GameCharacter gameCharacter : roster.values()) {
            if (gameCharacter instanceof ArmCannoneer ac) { // "pattern matching": name can be anything
                ac.rechargeArmCannonEnergy();
            }
        }

        // Find the first two CreatureTrainer's creatures for trading
        List<CreatureTrainer> trainers = new ArrayList<>();
        for (GameCharacter gameCharacter : roster.values()) {
            if (gameCharacter instanceof CreatureTrainer) { // No pattern matching used
                trainers.add((CreatureTrainer) gameCharacter); // must typecast explicitly
            }
            if (trainers.size() == 2) {
                trainers.get(0).tradeCreatures(trainers.get(1));
                break;
            }
        }

        // Search for a particular kinds of GameCharacters
        List<Class<?>> desiredKinds = List.of(Plumber.class, CreatureTrainer.class); // Don't simply use the class, must use .class
        for (Class<?> kind : desiredKinds) { // Iterate through the list of classes
            for (GameCharacter gameCharacter : roster.values()) {
                if (gameCharacter.getClass() == kind) { // Compare the object's class with the desired one
                    System.out.println("Found a " + kind + ": " + gameCharacter.getName());
                }
            }
        }
    }
}