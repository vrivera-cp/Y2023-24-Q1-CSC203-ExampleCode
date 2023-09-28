public class CoffeeMaker {
    // Constants
    public static final double WATER_CAPACITY = 24.0;
    public static final double AVERAGE_COFFEE_WATER_RATIO = 1.0 / 6.0; // tbsp per oz

    private double waterInOz;
    private double coffeeInTbsp;

    public double getWaterInOz() {
        return waterInOz;
    }

    private double getRemainingCapacity() {
        return WATER_CAPACITY - waterInOz;
    }

    private String calculateCoffeeStrength() {
        double coffeeWaterRatio = coffeeInTbsp / waterInOz;
        double strength_rating = coffeeWaterRatio / AVERAGE_COFFEE_WATER_RATIO;

        if (strength_rating >= 1.5) {
            return "Strong";
        } else if (strength_rating >= 0.5) {
            return "Average";
        } else {
            return "Weak";
        }
    }

    public void addWaterToCapacity(double amountInOz) {
        if (amountInOz > getRemainingCapacity()) {
            amountInOz = getRemainingCapacity();
        }
        waterInOz += amountInOz;
    }

    public void addCoffeeGrounds(double amountInTbsp) {
        coffeeInTbsp += amountInTbsp;
    }

    public CoffeePot brewCoffee() {
        // Brew a pot of coffee
        CoffeePot coffeePot = new CoffeePot(waterInOz, calculateCoffeeStrength());

        waterInOz = 0; // Converted to coffee
        coffeeInTbsp = 0; // Cleaned out the coffee maker

        return coffeePot;
    }
}