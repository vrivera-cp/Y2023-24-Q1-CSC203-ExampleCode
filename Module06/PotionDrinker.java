/**
 * Represents a person (or creature) who can drink different kinds of potions.
 * The effects of the potions can modify the properties of the PotionDrinker.
 *
 * @author Vanessa Rivera
 * @version 1.0
 */
public class PotionDrinker {
    public String name;
    public int age;
    public Double heightInFt;

    /**
     * Constructs a new PotionDrinker with the specified name, age, and height.
     *
     * @param name Name of the PotionDrinker.
     * @param age Age of the PotionDrinker.
     * @param heightInFt Height of the PotionDrinker in feet.
     */
    public PotionDrinker(String name, int age, Double heightInFt) {
        this.name = name;
        this.age = age;
        this.heightInFt = heightInFt;
    }

    /**
     * Allows the PotionDrinker to drink a potion and undergo its effect.
     *
     * @param potion The potion to be drunk.
     */
    public void drinkPotion(Potion potion) {
        potion.getEffect().accept(this);
    }

    /**
     * Returns a string representation of the PotionDrinker.
     *
     * @return A string representation of the PotionDrinker.
     */
    @Override
    public String toString() {
        return String.format("PotionDrinker(name=%s, age=%2d, heightInFt=%.2f)", name, age, heightInFt);
    }
}