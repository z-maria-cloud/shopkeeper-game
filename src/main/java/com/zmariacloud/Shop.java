package main.java.com.zmariacloud;

import java.util.HashMap;

public class Shop {
    ProductFactory factory = new ProductFactory();
    HashMap<Product, Integer> inventory = new HashMap<>();

    public Shop() {
        fillRandomInventory(0, 50);
    }

    public void fillRandomInventory(int productMin, int productMax) {
        for (String productName : this.factory.getProductsList()) {
            inventory.put(this.factory.getProduct(productName), Utils.getRndInt(productMin, productMax));
        }
    }

    public void printInventory() {
        for (Product product : this.inventory.keySet()) {
            System.out.println(String.format("%s: %d", product.getName(), this.inventory.get(product)));
        }
    }
}
