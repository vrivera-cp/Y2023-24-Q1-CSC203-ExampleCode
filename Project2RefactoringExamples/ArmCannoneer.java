public class ArmCannoneer extends GameCharacter implements Jumpable  {

    private int armCannonEnergy;

    public ArmCannoneer(String name, int armCannonEnergy) {
        super(name);
        this.armCannonEnergy = armCannonEnergy;
    }

    public void rechargeArmCannonEnergy() { armCannonEnergy++; }

    @Override
    public void doAction() {
        if (armCannonEnergy > 0) {
            armCannonEnergy--;
            System.out.println(getName() + " launched an energy blast! " + armCannonEnergy + " remaining!");
        } else {
            System.out.println(getName() + " is out of energy!");
        }
    }

    @Override
    public void jump() {
        System.out.println(getName() + " jumped!");
    }
}