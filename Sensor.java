public abstract class Sensor extends RoomItem {

    private double value;

    protected Sensor(String name, String location) {
        super(name, location);
    }

    public double getValue() {
        return value;
    }
}