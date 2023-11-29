public class Vehicle {
    public VehicleType type;
    public double batteryLevel;
    public double fuel;
    public Point position;
    public double speed;
    public int tires;

    void applyBrakes() { }

    void changeTires() {}

    void dock() {
        switch (type) {
            case ROWBOAT:
                dockToPort();
                break;
            case SPACE_SHUTTLE:
                dockToSpaceStation();
                break;
            default:
                throw new UnsupportedOperationException(String.format(
                        "Action not supported for %s",
                        type
                ));
        }
    }
    void dockToPort() {}
    void dockToSpaceStation() {}

    void move() {
        switch (type) {
            case BICYCLE:
            case ELECTRIC_CAR:
                moveTires();
                break;
            case ROWBOAT:
                moveWater();
                break;
            case SPACE_SHUTTLE:
                moveSpace();
                break;
            case TRAIN:
                moveTrain();
            default:
                throw new UnsupportedOperationException(String.format(
                   "Action not supported for %s",
                   type
                ));
        }
    }
    void moveTires() {}
    void moveTrain() {}
    void moveWater() {}
    void moveSpace() {}

    void refuel() {
        if (type == VehicleType.ELECTRIC_CAR) {
            refuelElectricCar();
        } else if (type == VehicleType.SPACE_SHUTTLE){
            /* refuel normally */
        }
    }
    void refuelElectricCar() { }
}
