public class Dragon implements Attacker {
    String name;
    String breath;

    public Dragon(String name, String breath) {
        this.name = name;
        this.breath = breath;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void attack(Defender defender) {
        System.out.printf("%s bellows its %s breath against %s\n", name, breath, defender.getName());
    }
}
