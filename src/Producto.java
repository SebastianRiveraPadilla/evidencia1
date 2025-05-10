import java.util.Scanner;

// Clase Productos como TDA
public class Producto {
    // Atributos privados (encapsulamiento)
    private String nombre;
    private double precio;
    private int cantidad;


    // Constructor por defecto (polimorfismo)
    public Producto() {
        this.nombre = "";
        this.precio = 0.0;
        this.cantidad = 0;
    }
    // Constructor con parámetros (polimorfismo)
    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    // Métodos setters y getters (encapsulamiento)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    // Método para capturar datos desde el usuario
    public void crearProducto() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre del producto: ");
        this.nombre = sc.nextLine();
        System.out.print("Ingrese el precio del producto: ");
        this.precio = sc.nextDouble();
        System.out.print("Ingrese la cantidad del producto: ");
        this.cantidad = sc.nextInt();
    }

    // Método para imprimir los datos del producto
    public void imprimirProducto() {
        System.out.println("=== Información del Producto ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Cantidad: " + cantidad);
    }
}

