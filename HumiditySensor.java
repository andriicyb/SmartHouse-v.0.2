public class HumiditySensor extends Sensor {

    // random data generator
    private double value = 10 + Math.round(Math.random() * 85);

    protected HumiditySensor(String name, String location) {
        super(name, location);
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "HumiditySensor{" +
                "name=" + super.name +
                ", location=" + super.location +
                ", humidity=" + (int)value + "%" +
                "}";
    }

}