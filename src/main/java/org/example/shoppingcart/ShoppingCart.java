package org.example.shoppingcart;

import java.util.ArrayList;
import java.util.List;

//We'll only use S -> Single Responsibility Principle
//ShoppingCart has only one responsibility -> Handling of items
public class ShoppingCart {
    private List<Item> itemList;

    public ShoppingCart(){
        itemList = new ArrayList<>();
    }

    public void addItem(Item item){
        itemList.add(item);
        System.out.println(item.getName() + " added to cart.");
    }

    public void removeItem(Item item){
        itemList.remove(item);
        System.out.println(item.getName() + " removed from cart.");
    }

    public List<Item> getItemList() {
        return itemList;
    }
}
