public abstract class RoomItem {

    String name;
    String location;

    private RoomItem() {}

    protected RoomItem(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "RoomItem{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}