public class CoffeeMain {
    public static void main(String[] args) {
        CoffeeMaker coffeeMaker = new CoffeeMaker(); // Default constructor is being used

        System.out.println("Coffee Maker has: " + coffeeMaker.getWaterInOz() + " oz of water");
        coffeeMaker.addWaterToCapacity(10);
        System.out.println("Coffee Maker has: " + coffeeMaker.getWaterInOz() + " oz of water");

        coffeeMaker.addWaterToCapacity(100);
        System.out.println("Coffee Maker has: " + coffeeMaker.getWaterInOz() + " oz of water");

        coffeeMaker.addCoffeeGrounds(4);

        // The CoffeeMaker.brewCoffee() method creates an instance, no need for "new" keyword
        CoffeePot coffeePot = coffeeMaker.brewCoffee();

        System.out.println("Coffee Maker has: " + coffeeMaker.getWaterInOz() + " oz of water");

        coffeePot.pour(4);
        coffeePot.pour();
        coffeePot.pour(1);
    }
}
