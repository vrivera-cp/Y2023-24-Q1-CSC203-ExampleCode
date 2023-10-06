public class InterfaceInstantiationMain {
    public static void main(String[] args) {
        // Attacker instantiations
        Dragon dragon = new Dragon("Charizard", "dragon");

        Attacker attacker = new Dragon("Smaug", "fire"); // Up-cast
        
        /* Invalid instantiations:
            Attacker attacker = new Attacker(); Can't instantiate an interface!
         */

        // Defender Instantiations
        Hero hero = new Hero("Ash Ketchum", "Pikachu");
        Wizard wizard = new Wizard();

        Defender defender = new Hero("Sailor Moon", "moon tiara action"); // Up-cast
        Defender anotherDefender = new Wizard(); // Up-cast

        /* Invalid instantiations:
            Defender defender = new Defender(); Can't instantiate an interface!
            Hero wizardHero = new Wizard(); A Wizard is not a Hero
            Wizard heroWizard = new Hero("Name", "Ability"); A Hero is not a Wizard
         */
    }
}
