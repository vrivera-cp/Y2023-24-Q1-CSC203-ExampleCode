public class Plumber extends GameCharacter implements Jumpable {

    public Plumber(String name) {
        super(name);
    }

    @Override
    public void doAction() {
        System.out.println(getName() + " jumped very high!");
    }

    @Override
    public void jump() {
        doAction();
    }
}