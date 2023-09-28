import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class CoffeeMakerTests {

    public static final double DELTA = 0.0001; // Used for checking double values within a tolerance

    @Test
    public void testCoffeeMakerConstructor() {
        CoffeeMaker coffeeMaker = new CoffeeMaker(); // Default constructor

        Assertions.assertEquals(0, coffeeMaker.getWaterInOz(), DELTA);
    }

    @Test
    public void testCoffeeMakerGetWaterInOz() {
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        coffeeMaker.addWaterToCapacity(1.111111);
        Assertions.assertEquals(1.1111, coffeeMaker.getWaterInOz(), DELTA);
    }

    @Test
    public void testCoffeeMakerAddWaterToCapacity() {
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        coffeeMaker.addWaterToCapacity(1.111111);
        Assertions.assertEquals(1.1111, coffeeMaker.getWaterInOz(), DELTA);

        coffeeMaker.addWaterToCapacity(CoffeeMaker.WATER_CAPACITY);
        Assertions.assertEquals(CoffeeMaker.WATER_CAPACITY, coffeeMaker.getWaterInOz(), DELTA);
    }

    @Test
    public void testBrewCoffeeStrong() {
        CoffeeMaker coffeeMaker = new CoffeeMaker();

        coffeeMaker.addWaterToCapacity(1.0);
        coffeeMaker.addCoffeeGrounds(100.0);

        CoffeePot coffeePot = coffeeMaker.brewCoffee();

        Assertions.assertEquals(1.0, coffeePot.getCoffeeInOz(), DELTA);
        Assertions.assertEquals("Strong", coffeePot.getStrength());
    }

    @Test
    public void testBrewCoffeeWeak() {
        CoffeeMaker coffeeMaker = new CoffeeMaker();

        coffeeMaker.addWaterToCapacity(CoffeeMaker.WATER_CAPACITY);
        coffeeMaker.addCoffeeGrounds(1.0);

        CoffeePot coffeePot = coffeeMaker.brewCoffee();

        Assertions.assertEquals(CoffeeMaker.WATER_CAPACITY, coffeePot.getCoffeeInOz(), DELTA);
        Assertions.assertEquals("Weak", coffeePot.getStrength());
    }

    @Test
    public void testBrewCoffeeAverage() {
        CoffeeMaker coffeeMaker = new CoffeeMaker();

        coffeeMaker.addWaterToCapacity(6.0);
        coffeeMaker.addCoffeeGrounds(1.0);

        CoffeePot coffeePot = coffeeMaker.brewCoffee();

        Assertions.assertEquals(6.0, coffeePot.getCoffeeInOz(), DELTA);
        Assertions.assertEquals("Average", coffeePot.getStrength());
    }
}
