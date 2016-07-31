public enum RoomItemType {

    DOOR("Entrance door"),
    LIGHT("Light source"),
    WINDOW("Window"),
    HEATING("Floor electro heating"),
    VENTILATION("Air refreshing"),
    HUMIDITY_SENSOR("Microclimate humidity data"),
    TEMPERATURE_SENSOR("Microclimate temperature data");

    private String description;

    RoomItemType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    @Override
    public String toString() {
        return "RoomItemType{" +
                "description='" + description + '\'' +
                "} " + super.toString();
    }
}