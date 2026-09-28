package composicion;

public class CompositionExample {

    public static void main(String[] args) {
        House house = new House("Casa de Ensueño");

        // La casa crea sus habitaciones internamente
        house.addRoom("Sala");
        house.addRoom("Dormitorio");
        house.addRoom("Cocina");
        house.addRoom("Baño");

        System.out.println("Total de habitaciones: " + house.getTotalRooms());

        System.out.println("Nombres de las habitaciones:");
        for (Room room : house.getRooms()) {
            System.out.println("- " + room.getRoomName());
        }

        // Si la casa desaparece, sus habitaciones desaparecen con ella
        house = null;
        System.out.println("La casa fue destruida: sus habitaciones ya no existen.");
    }
}