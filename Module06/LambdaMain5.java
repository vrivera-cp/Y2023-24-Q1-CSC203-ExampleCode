/**
 * Demonstrates using lambda functions as fields and function parameters.
 *
 * @author Vanessa Rivera
 * @version 1.0
 */
public class LambdaMain5 {

    /**
     * The main entry point for the application.
     *
     * @param args Command-line arguments (unused in this example).
     */
    public static void main(String[] args) {
        // Our PotionDrinker
        PotionDrinker mochi = new PotionDrinker("Mochi", 6, 1.0);

        // Passing a lambda function to a method (constructor)
        Potion biggifyPotion = new Potion(p -> p.heightInFt *= 2);

        // Calling the lambda function
        System.out.println(mochi.heightInFt); // Output: 1.0
        mochi.drinkPotion(biggifyPotion);
        System.out.println(mochi.heightInFt); // Output: 2.0

        // Passing another lambda function to a method (constructor)
        Potion kittenifyPotion = new Potion(p -> {
            p.name = "Kitten" + p.name;
            p.age = 0;
        });

        // Calling the lambda function
        System.out.println(mochi.name); // Output: Mochi
        System.out.println(mochi.age); // Output: 6
        mochi.drinkPotion(kittenifyPotion);
        System.out.println(mochi.name); // Output: KittenMochi
        System.out.println(mochi.age); // Output: 0

        // Using a method reference
        Potion printifyPotion = new Potion(System.out::println);

        // Method Reference Syntax:
        // - The class or object name
        // - Double colons (::) followed by the method name
        // In this example, the method (println) is assumed to take our only parameter (a PotionDrinker).

        // Calling the lambda function
        mochi.drinkPotion(printifyPotion);

        // Local variables in lambda functions
        PotionDrinker unassumingPotionDrinker = new PotionDrinker("Harvest", 5, 1.0);

        Potion deviousPotion = new Potion(p -> {
            unassumingPotionDrinker.heightInFt = 0.01;
            unassumingPotionDrinker.age = 100;
            unassumingPotionDrinker.name = "Very Hungry " + unassumingPotionDrinker.name;
        });

        // Calling the lambda function
        mochi.drinkPotion(deviousPotion);

        // Showing the result
        unassumingPotionDrinker.drinkPotion(printifyPotion);
    }
}
