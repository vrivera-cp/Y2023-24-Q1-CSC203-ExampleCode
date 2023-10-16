public abstract class EndangeredAnimal extends Animal {

    private String conservationStatus;

    public EndangeredAnimal(String species, int population, String conservationStatus) {
        super(species, population);
        this.conservationStatus = conservationStatus;
    }

    public void setConservationStatus(String conservationStatus) {
        this.conservationStatus = conservationStatus;
    }

    public String getConservationStatus() {
        return conservationStatus;
    }

    public abstract void conservationRecommendation();
}
