package main.java.com.zmariacloud;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Utils {
    static ProductFactory factory;
    static HashMap<String, Double> globalProductsList = new HashMap<>();
    static List<String> customerWishLines = new ArrayList<String>();

    public Utils() {
        this.factory = new ProductFactory();
        fillGlobalProductList();
    }

    static void fillGlobalProductList() {
        globalProductsList.put("Apple", 0.4);
        globalProductsList.put("Strawberry", 0.25);
        globalProductsList.put("Chocolate", 0.7);
    }

    static String getRandomGlobalProductName() {
        int rnd = getRndInt(0, getGlobalProductsNames().size() - 1);
        int i = 0;
        for (String element : getGlobalProductsNames()) {
            if (i == rnd) {
                return element;
            }
            i++;
        }
        return null;
    }

    static Set<String> getGlobalProductsNames(){
        return globalProductsList.keySet();
    }

    static double getGlobalProductPrice(String name) {
        return globalProductsList.get(name);
    }
    

    static int getRndInt(int min, int max) {
        return min + (int)(Math.random() * ((max - min) + 1));
    }
}
