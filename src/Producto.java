import java.util.Scanner;

public class Producto {
    private String nombre;
    private double precio;
    private int cantidad;


    public Producto() {
        this.nombre = "";
        this.precio = 0.0;
        this.cantidad = 0;
    }

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

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

    public void crearProducto() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre del producto: ");
        this.nombre = sc.nextLine();
        System.out.print("Ingrese el precio del producto: ");
        this.precio = sc.nextDouble();
        System.out.print("Ingrese la cantidad del producto: ");
        this.cantidad = sc.nextInt();
    }

    public void imprimirProducto() {
        System.out.println("=== Información del Producto ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Cantidad: " + cantidad);
    }
}

