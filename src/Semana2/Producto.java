public class Producto {
    private String nombre;
    private double precio;
    private int cantidad;

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public void vender(int cantidad) {
        if (this.cantidad >= cantidad) {
            this.cantidad -= cantidad;
        } else {
            System.out.println("No hay suficiente stock para vender esa cantidad.");
        }
    }

    public void reabastecer(int cantidad) {
        this.cantidad += cantidad;
    }

    public void mostrarProducto() {
        System.out.println("Producto: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Cantidad en stock: " + cantidad);
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        Producto producto1 = new Producto("Camiseta", 20.0, 50);
        Producto producto2 = new Producto("Pantalón", 40.0, 30);

        producto1.mostrarProducto();
        producto1.vender(10);
        producto1.mostrarProducto();
        producto1.reabastecer(20);
        producto1.mostrarProducto();

        producto2.mostrarProducto();
        producto2.vender(35);  // Intento de vender más del stock para activar el mensaje
        producto2.reabastecer(10);
        producto2.mostrarProducto();
    }
}