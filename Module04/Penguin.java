public class Penguin extends EndangeredAnimal implements Swimmable, Flyable {

    public Penguin(String species, int population, String conservationStatus) {
        super(species, population, conservationStatus);
    }

    @Override
    public void conservationRecommendation() {
        System.out.println("Reduce climate change, disease, habitat destruction, and disturbance at breeding colonies by humans.");
    }

    @Override
    public void swim() {
        System.out.println("Swish!");
    }

    @Override
    public void fly() {
        System.out.println("The penguin is trying to fly, but can't!");
    }
}
