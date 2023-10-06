public class InterfaceMultipleMain {
    public static void main(String[] args) {
        // Instantiations
        Defender defender = new Hero("Sailor Moon", "moon tiara action"); // Automatic up-cast
        Attacker attacker = new Dragon("Smaug", "fire"); // Automatic up-cast

        Cat cat = new Cat("Mochi");

        // Typecasting
        Defender defenderCat = cat; // automatic up-cast
        Attacker attackerCat = cat; // automatic up-cast

        Cat downCastDefenderCat = (Cat) defenderCat; // Down-cast
        Cat downCastAttackerCat = (Cat) attackerCat; // Down-cast

        // Dragon dragonCat = (Dragon) attackerCat; Invalid, attackerCat is NOT a Dragon
        // Hero heroCat = (Hero) defenderCat;       Invalid, defenderCat is NOT a Hero
        // Dragon dragonCat = (Dragon) cat;         Invalid, can't "side-cast"
        // Hero heroCat = (Hero) cat;               Invalid, can't "side-cast"

        // defend() calls
        cat.defend(attacker);
        defender.defend(cat);

        cat.defend(cat);

        // cat.defend(defenderCat); // Invalid, Java isn't sure that defenderCat is indeed an attacker
        cat.defend((Attacker) defenderCat); // Down-cast

        // attack() Calls
        cat.attack(defender);
        attacker.attack(cat);

        cat.attack(cat);

        // cat.attack(attackerCat); // Invalid, Java isn't sure that defenderCat is indeed an attacker
        cat.attack((Defender) attackerCat); // Down-cast

        // Static method call
        Defender.performBattle(cat, cat);
    }
}
