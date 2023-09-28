public class CoffeePot {

    private double coffeeInOz;
    private String strength;

    public CoffeePot(double coffeeInOz, String strength) {
        this.coffeeInOz = coffeeInOz;
        this.strength = strength;
    }

    public double getCoffeeInOz(){ return coffeeInOz; };
    public String getStrength() { return strength; }

    public void pour(double amountInOz) {
        // Don't allow pouring more coffee than is present
        if (amountInOz > coffeeInOz) {
            amountInOz = coffeeInOz;
        }

        // Pour the coffee
        if (amountInOz > 0) {
            System.out.println("Poured a delicious " + amountInOz + " oz cup of " + strength + " coffee!");
            coffeeInOz -= amountInOz;
        } else {
            System.out.println("Oops, all the coffee is gone. We should make more!");
        }
    }

    // Method Overload
    public void pour() {
        // Pour all the coffee
        if (coffeeInOz > 0) {
            System.out.println("Poured a delicious " + coffeeInOz + " oz cup of " + strength + " coffee!");
            coffeeInOz = 0;
        } else {
            System.out.println("Oops, all the coffee is gone. We should make more!");
        }
    }
}