package org.example.shoppingcart;

public class Main {
    public static void main(String... args){
        User user1 = new User("Mukul", "7982836377");
        Billing billing = new Billing();
        ShoppingCart cart1 = user1.getMyCart();

        cart1.addItem(new Item("Liquid Handwash", 500));
        cart1.addItem(new Item("Maggi", 50));
        cart1.addItem(new Item("Pasta", 80));

        billing.calculateCost(cart1);
    }
}
