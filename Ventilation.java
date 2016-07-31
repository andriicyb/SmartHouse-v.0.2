public class Ventilation extends RoomItem {

    private boolean active = false;

    protected Ventilation(String name, String location) {
        super(name, location);
    }

    public boolean isActive() {
        return active;
    }

    public Ventilation turnOn() {
        active = true;
        return this;
    }

    public Ventilation turnOff() {
        active = false;
        return this;
    }

    @Override
    public String toString() {
        return "Ventilation{" +
                "name=" + super.name +
                ", location=" + super.location +
                ", active=" + active +
                "}";
    }

}