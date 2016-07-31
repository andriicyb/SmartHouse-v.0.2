public class Heating extends RoomItem {

    private boolean active = false;
    private int power = 0;

    protected Heating(String name, String location) {
        super(name, location);
    }

    public boolean isActive() {
        return active;
    }

    public Heating turnOn() {
        active = true;
        return this;
    }

    public Heating turnOff() {
        active = false;
        return this;
    }

    public int getPower() {
        return power;
    }

    public Heating setPower(int power) {
        if (power >= 0 && power <= 100){
            this.power = power;
        }
        return this;
    }

    @Override
    public String toString() {
        return "Heating{" +
                "name=" + super.name +
                ", location=" + super.location +
                ", active=" + active +
                ", power=" + power +
                "}";
    }

}