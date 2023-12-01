public class Animal {
    private final String species;
    private int population;

    public Animal(String species, int population) {
        this.species = species;
        this.population = population;
    }

    public final int getPopulation() {
        return population;
    }

    public final void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", population=" + population +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return population == animal.population && species.equals(animal.species);
    }

    @Override
    public int hashCode() {
        int hash = 1;
        hash = hash * 31 + ((species != null) ? species.hashCode() : 0);
        hash = hash * 31 + population;
        return hash; // alternatively, return Objects.hash(species, population)
    }
}