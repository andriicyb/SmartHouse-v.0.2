public class TemperatureSensor extends Sensor{

    // random data generator
    private double value = 15 + Math.round(Math.random() * 35) / 10.0;

    protected TemperatureSensor(String name, String location) {
        super(name, location);
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "TemperatureSensor{" +
                "name=" + super.name +
                ", location=" + super.location +
                ", temperature=" + value + "\u00B0C" +
                "}";
    }

}