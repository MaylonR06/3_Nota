package Semana5.Arrailist;


public class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void showInfo() {
        System.out.println(name + " costs $" + price);
    }
}