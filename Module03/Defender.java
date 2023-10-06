public interface Defender {
    String getName();

    // Default method
    default void defend(Attacker attacker) {
        System.out.printf("%s defends against %s\n", getName(), attacker.getName());
    }

    // Interfaces can have static methods
    static void performBattle(Attacker attacker, Defender defender) {
        attacker.attack(defender);
        defender.defend(attacker);
    }
}
