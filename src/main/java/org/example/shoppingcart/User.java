package org.example.shoppingcart;

public class User {
    private String name;
    private String phoneNo;

    //Every user has a single cart allotted to them (Like in Amazon)
    private final ShoppingCart myCart;

    public User(String name, String phoneNo) {
        this.name = name;
        this.phoneNo = phoneNo;
        myCart = new ShoppingCart();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public ShoppingCart getMyCart() {
        return myCart;
    }
}
