public class Window extends RoomItem{

    private boolean closed = false;

    protected Window(String name, String location) {
        super(name, location);
    }

    public boolean isClosed() {
        return closed;
    }

    public Window closeWindow() {
        closed = true;
        return this;
    }

    public Window openWindow() {
        closed = false;
        return this;
    }

    @Override
    public String toString() {
        return "Window{" +
                "name=" + super.name +
                ", location=" + super.location +
                ", closed=" + closed +
                "}";
    }

}