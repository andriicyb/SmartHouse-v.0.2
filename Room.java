import java.util.HashMap;
import java.util.Map;

public class Room {

    private String name;
    private Map<String, RoomItem> items = new HashMap<>();

    protected Room() {
    }

    protected Room(String name) {
        this.name = name;
    }

    public Room addRoomItem(RoomItemType item, String name) {

        if (!items.containsKey(name)) {
            switch(item) {
                case DOOR: items.put(name, new Door(name, this.name));
                case LIGHT: items.put(name, new Light(name, this.name)); break;
                case WINDOW: items.put(name, new Window(name, this.name)); break;
                case HEATING: items.put(name, new Heating(name, this.name)); break;
                case VENTILATION: items.put(name, new Ventilation(name, this.name)); break;
                case HUMIDITY_SENSOR: items.put(name, new HumiditySensor(name, this.name)); break;
                case TEMPERATURE_SENSOR: items.put(name, new TemperatureSensor(name, this.name)); break;
            }
        }

        return this;
    }

    protected void changeRoomItemsLocation(String newLocation) {
        for (RoomItem i : items.values()) {
            //i.location = newLocation;
            i.setLocation(newLocation);
        }
    }

    public RoomItem takeItem(String name) {
        return items.get(name);
    }

    @Override
    public String toString() {

        if (items.size() == 0) {

            return " No Smart items.";
        }
        else {

            String output = new String();

            for (RoomItem i : items.values()) {
                output += "\n- Name: '" + i.getName() + "'; Location: '" + i.getLocation() + "'; Raw data: " + i;
            }

            return "\nContains Smart Items [" + items.size() + "]:" + output;
        }
    }
}