public class Light extends RoomItem {

    private boolean active = false;
    private int brighness = 0;

    protected Light(String name, String location) {
        super(name, location);
    }

    public boolean isActive() {
        return active;
    }

    public Light turnOn() {
        active = true;
        return this;
    }

    public Light turnOff() {
        active = false;
        return this;
    }

    //this method created just for fun :)
    public Light switchLight() {
        active = !active; //activated ? false : true;
        return this;
    }

    public int getBrighness() {
        return brighness;
    }

    public Light setBrighness(int brighness) {
        if (brighness >= 0 && brighness <= 100){
            this.brighness = brighness;
        }
        return this;
    }

    @Override
    public String toString() {
        return "Light{" +
                "name=" + super.name +
                ", location=" + super.location +
                ", active=" + active +
                ", brighness=" + brighness +
                "}";
    }

}