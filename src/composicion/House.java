package composicion;

import java.util.ArrayList;
import java.util.List;

public class House {

    private String houseName;
    private List<Room> rooms;

    public House(String houseName) {
        this.houseName = houseName;
        this.rooms = new ArrayList<>();
    }

    // Recibe solo el nombre: la propia House crea la Room
    public void addRoom(String roomName) {
        rooms.add(new Room(roomName));
    }

    public List<Room> getRooms() {
        return new ArrayList<>(rooms);
    }

    public int getTotalRooms() {
        return rooms.size();
    }
}