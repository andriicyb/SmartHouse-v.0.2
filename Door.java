public class Door extends RoomItem{

    private boolean closed = false;
    private boolean locked = false;

    protected Door(String name, String location) {
        super(name, location);
    }

    public boolean isClosed() {
        return closed;
    }

    public boolean isLocked() {
        return locked;
    }

    public Door closeTheDoor() {
        closed = true;
        return this;
    }

    public Door lockTheDoor() {
        if(isClosed()) {
            locked = true;
        }
        return this;
    }

    @Override
    public String toString() {
        return "Door{" +
                "name=" + super.name +
                ", location=" + super.location +
                ", closed=" + closed +
                ", locked=" + locked +
                "}";
    }

}