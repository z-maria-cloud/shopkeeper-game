package main.java.com.zmariacloud;

public class Customer {
    String wish;

    public Customer() {
        this.wish = Utils.getRandomGlobalProductName();
        System.out.println(String.format("Customer: Hello, do you have any '%s'?", this.wish));
    }
}
