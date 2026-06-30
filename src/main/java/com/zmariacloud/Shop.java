package main.java.com.zmariacloud;

import java.util.HashMap;

public class Shop {
    double money;
    HashMap<Product, Integer> inventory = new HashMap<>();

    public Shop() {
        this.money = 0;
        fillRandomInventory(0, 50);
    }

    public void fillRandomInventory(int productMin, int productMax) {
        for (String productName : Utils.factory.getProductsList()) {
            inventory.put(Utils.factory.getProduct(productName), Utils.getRndInt(productMin, productMax));
        }
    }

    public void printInventory() {
        System.out.println(String.format("You have %.2f$.", this.money));
        for (Product product : this.inventory.keySet()) {
            System.out.println(String.format("%s: %d in stock. Individual price: %.2f$",
            product.getName(),
            this.inventory.get(product),
            product.getPrice()
            ));
        }
    }

    public boolean isInInventory(String what) {
        for (Product product : this.inventory.keySet()) {
            if (product.getName() == what) {
                return true;
            }
        }
        return false;
    }

    public int howManyInInventory() {
        return 0;
    }

    public void gameLoop() {
        Customer c = new Customer();
        System.out.println(String.format("Do you want to sell %d '%s'?", c.getWishQuantity(), c.getWishProduct()));
    }
}
