public class InterfaceTypeCastMain {
    public static void main(String[] args) {
        // Instantiations
        Attacker attacker = new Dragon("Smaug", "fire"); // Automatic up-cast

        Dragon dragon = new Dragon("Charizard", "dragon");

        Defender defender = new Hero("Sailor Moon", "moon tiara action"); // Automatic up-cast
        Defender anotherDefender = new Wizard(); // Automatic up-cast

        Hero hero = new Hero("Ash Ketchum", "Pikachu");

        Wizard wizard = new Wizard();

        // Typecasting
        Attacker typecastedDragon = dragon; // automatic up-cast
        Defender typeCastedHero = hero; // automatic up-cast
        Defender typeCastedWizard = wizard; // automatic up-cast

        Dragon typecastedAttacker = (Dragon) attacker; // Down-cast
        Hero typecastedDefender = (Hero) defender; // Down-Cast
        Wizard invalidTypeCast = (Wizard) defender; // Erroneous down-cast, defender is NOT a Wizard

        // Why does this not produce a compile error?
        Attacker doesntExistYet = (Attacker) hero;
    }
}
