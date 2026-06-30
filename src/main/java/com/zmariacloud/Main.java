package main.java.com.zmariacloud;

public class Main {
    public static void main(String[] args) {
        Utils utils = new Utils();
        Shop shop = new Shop();

        System.out.println("=== Starting the game! Shop inventory: ===");
        shop.printInventory();
        System.out.println("==========================================");
        shop.gameLoop();
    }
}
