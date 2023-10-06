public class InterfaceMethodMain {
    public static void main(String[] args) {
        // Instantiations
        Attacker attacker = new Dragon("Smaug", "fire"); // Automatic up-cast

        Dragon dragon = new Dragon("Charizard", "dragon");

        Defender defender = new Hero("Sailor Moon", "moon tiara action"); // Automatic up-cast
        Defender anotherDefender = new Wizard(); // Automatic up-cast

        Hero hero = new Hero("Ash Ketchum", "Pikachu");

        Wizard wizard = new Wizard();

        // defend() calls
        defender.defend(attacker);
        hero.defend(attacker);

        defender.defend(dragon);
        hero.defend(dragon);

        // attack() Calls
        attacker.attack(anotherDefender);
        dragon.attack(defender);
        attacker.attack(hero);
        dragon.attack(wizard);

        // Static method call
        Defender.performBattle(dragon, hero);
    }
}
