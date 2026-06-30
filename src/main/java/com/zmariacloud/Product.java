package main.java.com.zmariacloud;

public class Product {
    double price;
    String name;

    public Product(String name, double price) {
        this.price = price;
        this.name = name;
    }

    public void describeProduct() {
        System.out.println(String.format("Price: %d, Name: %s",this.price, this.name));
    }

    public String getName() {
        return this.name;
    }
}
