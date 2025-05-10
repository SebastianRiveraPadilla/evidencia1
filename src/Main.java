import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Producto> listaProductos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n------ MENÚ PRINCIPAL ------");
            System.out.println("1. Crear producto");
            System.out.println("2. Imprimir productos");
            System.out.println("3. Salir del programa");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    Producto nuevoProducto = new Producto();
                    nuevoProducto.crearProducto();
                    listaProductos.add(nuevoProducto);
                    break;
                case 2:
                    if (listaProductos.isEmpty()) {
                        System.out.println("No hay productos registrados.");
                    } else {
                        for (Producto p : listaProductos) {
                            p.imprimirProducto();
                        }
                    }
                    break;
                case 3:
                    System.out.println("Saliendo del programa. . .");
                    break;
                default:
                    System.out.println("Opción no válida. Seleccione una opción válida.");
            }
        } while (opcion != 3);
    }
}
