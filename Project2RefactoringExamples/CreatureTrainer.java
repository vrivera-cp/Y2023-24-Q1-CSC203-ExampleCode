import java.util.List;

public class CreatureTrainer extends GameCharacter {
    List<String> creatureTeam;

    public CreatureTrainer(String name, List<String> creatureTeam) {
        super(name);
        this.creatureTeam = creatureTeam;
    }

    public void tradeCreatures(CreatureTrainer other) {
        String creatureA = creatureTeam.remove(0);
        String creatureB = other.creatureTeam.remove(0);
        creatureTeam.add(creatureB);
        other.creatureTeam.add(creatureA);
        System.out.println(getName() + " traded their " + creatureA + ". Bye " + creatureA + "!");
        System.out.println(getName() + " traded their " + creatureB + ". Bye " + creatureB + "!");
    }

    @Override
    public void doAction() {
        for (String creature : creatureTeam) {
            System.out.println(getName() + " sent out " + creature + "!");
        }
    }
}