import java.util.HashMap;
import java.util.Map;

public class House {

    Map<String, Room> rooms = new HashMap<>(4);

    House(){};

    public void addRoom(String name) {
        if (!rooms.containsKey(name)) {
            rooms.put(name, new Room(name));
        }
    }
    public House changeRoomName(String oldName, String newName) {
        if (rooms.containsKey(oldName)) {
            rooms.put(newName, rooms.get(oldName));              // create new entry with new name
            rooms.get(newName).changeRoomItemsLocation(newName); // change location for items in the new entry
            rooms.remove(oldName);
        }
        return this;
    }

    public Room gotoRoom(String name) {
        return rooms.get(name);
    }

    @Override
    public String toString() {

        String output = "";

        for(Map.Entry<String, Room> entry: rooms.entrySet()) {
            output += "\n<< "
                    + entry.getKey().toUpperCase()
                    + " >>"
                    + entry.getValue();
        }

        return "\nHouse: " + output;
    }
}