package main.java.com.zmariacloud;

import java.util.HashMap;
import java.util.Set;

public class ProductFactory {
    HashMap<String, Product> allProducts = new HashMap<>();

    public ProductFactory() {
        allProducts.put("Apple", new Product(0.5, "Apple"));
        allProducts.put("Strawberry", new Product(0.2, "Strawberry"));
        allProducts.put("Chocolate", new Product( 2.3, "Chocolate"));
    }

    public Set<String> getProductsList(){
        return this.allProducts.keySet();
    }

    public Product getProduct(String name) {
        if (this.allProducts.containsKey(name)) {
            return this.allProducts.get(name);
        } else {
            return null;
        }
    }
    
}
