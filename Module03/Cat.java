public class Cat implements Attacker, Defender {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void attack(Defender defender) {
        System.out.printf("%s uses its claws against %s\n", name, defender.getName());
    }

    @Override
    public void defend(Attacker attacker) {
        System.out.printf("%s hides in a box\n", name);
    }
}
