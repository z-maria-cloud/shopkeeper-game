package main.java.com.zmariacloud;

import java.util.HashMap;
import java.util.Set;

public class ProductFactory {
    HashMap<String, Product> allProducts = new HashMap<>();

    public ProductFactory() {
        for (String productName : Utils.getGlobalProductsNames()) {
            allProducts.put(productName, new Product(productName, Utils.getGlobalProductPrice(productName)));
        }
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
