package main.java.com.zmariacloud;

public class Customer {
    String wishProduct;
    int wishQuantity;

    public Customer() {
        this.wishQuantity = Utils.getRndInt(1, 5);
        this.wishProduct = Utils.getRandomGlobalProductName();
        System.out.println(String.format("Customer: Hello, do you have any '%s'? I would like %d.", this.wishProduct, this.wishQuantity));
    }

    public String getWishProduct() {
        return this.wishProduct;
    }

    public int getWishQuantity() {
        return this.wishQuantity;
    }
}
