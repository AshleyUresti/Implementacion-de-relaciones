import agregacion.AggregationExample;
import asociacion.AssociationExample;
import composicion.CompositionExample;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nRelaciones POO\n" +
                    "1) Asociación\n" +
                    "2) Agregación\n" +
                    "3) Composición\n" +
                    "0) Salir");
            System.out.print("Opción: ");

            // Evita que el programa truene si escriben letras
            if (!in.hasNextInt()) {
                in.next();
                System.out.println("Escribe un número válido.");
                opcion = -1;
                continue;
            }
            opcion = in.nextInt();
            System.out.println();

            switch (opcion) {
                case 1:
                    AssociationExample.main(new String[]{});
                    break;
                case 2:
                    AggregationExample.main(new String[]{});
                    break;
                case 3:
                    CompositionExample.main(new String[]{});
                    break;
                case 0:
                    System.out.println("Hasta la protsima");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 0);

        in.close();
    }
}