package composicion;

public class Room {

    private String roomName;

    // Package-private: solo las clases del paquete pueden crear una Room
    Room(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomName() {
        return roomName;
    }
}