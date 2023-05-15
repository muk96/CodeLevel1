package org.example.shoppingcart;

import java.util.List;

public class Billing implements CostCalculator{
    private float amountPayable = 0;

    @Override
    public float calculateCost(ShoppingCart cart) {
        List<Item> itemList = cart.getItemList();
        for (Item item : itemList) {
            amountPayable += item.getPrice();
        }
        printBill(itemList);
        return amountPayable;
    }

    public void printBill(List<Item> itemList){
        for (Item item : itemList) {
            System.out.println(item.getName() + " : " + item.getPrice());
        }
        System.out.println("Total payable amount : " + amountPayable);
    }
}
