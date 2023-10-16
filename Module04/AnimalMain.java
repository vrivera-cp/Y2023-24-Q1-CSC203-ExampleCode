public class AnimalMain {
    public static void main(String[] args) {
        // Demonstrate basic inheritance and use of `final` keyword
        Animal genericAnimal = new Animal("generic species", 1000);
        System.out.println("Generic Animal Population: " + genericAnimal.getPopulation());

        // Demonstrate concrete subclass and method overriding
        Dog beagle = new Dog(150, "Beagle");
        beagle.bark();
        System.out.println(beagle);  // This calls the overridden `toString` method
        System.out.println("Is the generic animal equal to beagle? " + genericAnimal.equals(beagle));  // Demonstrates the `equals` method

        // Demonstrate abstract classes and abstract methods
        Penguin penguin = new Penguin("Emperor Penguin", 200, "Vulnerable");
        penguin.conservationRecommendation();  // Calls the abstract method implemented in `Penguin`

        // Demonstrate interface implementation
        penguin.swim();  // From Swimmable
        penguin.fly();   // From Flyable, and shows penguins can't really fly!

        // A sample of hash code demonstration, if needed
        System.out.println("Hash code of beagle: " + beagle.hashCode());
        System.out.println("Hash code of generic animal: " + genericAnimal.hashCode());
    }
}
