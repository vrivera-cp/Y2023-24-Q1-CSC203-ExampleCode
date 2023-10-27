import java.util.function.Consumer;

/**
 * Represents a potion with an effect on a PotionDrinker.
 * The effect is represented as a lambda function which can modify the properties of a PotionDrinker.
 *
 * @author Vanessa Rivera
 * @version 1.0
 */
public class Potion {
    private final Consumer<PotionDrinker> effect;

    /**
     * Constructs a new potion with the specified effect.
     *
     * @param effect The effect of the potion represented as a lambda function.
     */
    public Potion(Consumer<PotionDrinker> effect) {
        this.effect = effect;
    }

    /**
     * Returns the effect of the potion.
     *
     * @return The effect of the potion.
     */
    public Consumer<PotionDrinker> getEffect() {
        return effect;
    }
}