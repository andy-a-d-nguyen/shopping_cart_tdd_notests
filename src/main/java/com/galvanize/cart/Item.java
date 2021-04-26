package com.galvanize.cart;


public class Item {
    // item name
    public String itemName;
    // item price 
    public double itemPrice;
    // item quantity
    public int itemQuantity;
    // on sale status
    public boolean onSale;
    
    // constructor
    public Item(String itemName, double itemPrice, int itemQuantity, boolean onSale) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemQuantity = itemQuantity;
        this.onSale = onSale;
    }


    public void updateQuantity(int quantity) {
        this.itemQuantity = quantity;
    }
    
    // 5.
    // itemQuantities: update qty if more than
    // one of the same item is added
}
