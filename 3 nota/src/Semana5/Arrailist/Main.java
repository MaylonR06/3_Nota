package semana5;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        // Crear un ArrayList de productos
        ArrayList<Product> products = new ArrayList<>();

        // Agregar 5 productos
        products.add(new Product("Laptop", 1200.50));
        products.add(new Product("Smartphone", 799.99));
        products.add(new Product("Tablet", 450.00));
        products.add(new Product("Monitor", 300.25));
        products.add(new Product("Keyboard", 50.75));

        // Recorrer con for-each y mostrar info
        for (Product p : products) {
            p.showInfo();
        }
    }
}