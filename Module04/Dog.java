import java.util.Objects;

public class Dog extends Animal {
    private final String breed;

    public Dog(int population, String breed) {
        super("canus familiaris", population);
        this.breed = breed;
    }

    public void bark() {
        System.out.println("Woof!");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return Objects.equals(breed, dog.breed);
    }

    @Override
    public int hashCode() {
        return 31 * super.hashCode() + Objects.hash(breed);
    }

}
