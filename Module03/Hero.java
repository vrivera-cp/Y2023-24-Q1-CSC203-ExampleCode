public class Hero implements Defender {
    private String name;
    private String ability;
    public Hero(String name, String ability) {
        this.name = name;
        this.ability = ability;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void defend(Attacker attacker) {
        System.out.printf("%s defends against %s using %s\n", name, attacker.getName(), ability);
    }
}
