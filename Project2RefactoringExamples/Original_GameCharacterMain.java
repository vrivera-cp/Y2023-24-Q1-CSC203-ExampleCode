import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Original_GameCharacterMain {
    public static void main(String[] args) {
        // Create a roster of game characters
        Map<String, Original_GameCharacter> roster = new HashMap<>();

        roster.put("Luigi", new Original_GameCharacter("Plumber", "Luigi", 0, null));
        
        roster.put("Mega Man",  new Original_GameCharacter("ArmCannoneer", "Mega Man",   10, null));
        roster.put("Samus",     new Original_GameCharacter("ArmCannoneer", "Samus Aran", 100, null));
        
        roster.put("Red",   new Original_GameCharacter("CreatureTrainer",  "Ash",    0,  new ArrayList<>(List.of("Pikachu"))));
        roster.put("Blue",  new Original_GameCharacter("CreatureTrainer",  "Gary",   0,  new ArrayList<>(List.of("Eevee"))));

        // Perform actions
        for (Original_GameCharacter gameCharacter : roster.values()) {
            gameCharacter.doAction();
        }
        
        // Jumping
        for (Original_GameCharacter gameCharacter : roster.values()) {
            gameCharacter.jump();
        }
        
        // Recharging
        for (Original_GameCharacter gameCharacter : roster.values()) {
            if (gameCharacter.getKind().equals("ArmCannoneer")) {
                gameCharacter.rechargeArmCannonEnergy();
            }
        }

        // Find the first two CreatureTrainer's creatures for trading
        List<Original_GameCharacter> trainers = new ArrayList<>();
        for (Original_GameCharacter gameCharacter : roster.values()) {
            if (gameCharacter.getKind().equals("CreatureTrainer")) {
                trainers.add(gameCharacter);
            }
            if (trainers.size() == 2) {
                trainers.get(0).tradeCreatures(trainers.get(1));
                break;
            }
        }

        // Search for a particular kinds of Original_GameCharacters
        List<String> desiredKinds = List.of("Plumber", "CreatureTrainer");
        for (String kind : desiredKinds) {
            for (Original_GameCharacter gameCharacter : roster.values()) {
                if (gameCharacter.getKind().equals(kind)) {
                    System.out.println("Found a " + kind + ": " + gameCharacter.getName());
                }
            }
        }
    }
}