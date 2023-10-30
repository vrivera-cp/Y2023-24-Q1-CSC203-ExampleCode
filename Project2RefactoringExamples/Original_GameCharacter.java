import java.util.List;

public class Original_GameCharacter {
    private String kind;
    private String name;
    private int armCannonEnergy;
    private List<String> creatureTeam;

    public Original_GameCharacter(String kind, String name, int armCannonEnergy, List<String> creatureTeam) {
        this.kind = kind;
        this.name = name;
        this.armCannonEnergy = armCannonEnergy;
        this.creatureTeam = creatureTeam;
    }

    public void doActionPlumber() {
        System.out.println(name + " jumped very high!");
    }

    public void doActionArmCannoneer() {
        if (armCannonEnergy > 0) {
            armCannonEnergy--;
            System.out.println(name + " launched an energy blast! " + armCannonEnergy + " remaining!");
        } else {
            System.out.println(name + " is out of energy!");
        }
    }

    public void doActionCreatureTrainer() {
        for (String creature : creatureTeam) {
            System.out.println(name + " sent out " + creature + "!");
        }
    }

    public void doAction() {
        switch (kind) {
            case "Plumber" -> doActionPlumber();
            case "ArmCannoneer" -> doActionArmCannoneer();
            case "CreatureTrainer" -> doActionCreatureTrainer();
        }
    }

    public void jump() {
        switch (kind) {
            case "Plumber" -> doActionPlumber();
            case "ArmCannoneer" -> System.out.println(name + " jumped!");
        }
    }

    public void rechargeArmCannonEnergy() { armCannonEnergy++; }

    public void tradeCreatures(Original_GameCharacter other) {
        String creatureA = creatureTeam.remove(0);
        String creatureB = other.creatureTeam.remove(0);
        creatureTeam.add(creatureB);
        other.creatureTeam.add(creatureA);
        System.out.println(name + " traded their " + creatureA + ". Bye " + creatureA + "!");
        System.out.println(other.name + " traded their " + creatureB + ". Bye " + creatureB + "!");
    }

    public String getKind() { return kind; }
    public String getName() { return name; }
}