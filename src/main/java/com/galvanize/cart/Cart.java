package com.galvanize.cart;

import java.util.ArrayList;
/*
   When site is first visited, cart is empty
*/
public class Cart {
    // 1.
    // cart instantiation
    public String name;
    public ArrayList<Item> cart = new ArrayList<>();
    public ArrayList<String> saleCart = new ArrayList<>();

    // constructor
    public Cart(String name) {
        this.name = name;
    }

    public int getSize() {
        return cart.size();
    }

    public int getSaleSize() {
        return saleCart.size();
    }

    public void addItem(Item item) {
        if (item.onSale) {
            saleCart.add(item.itemName);
        }
        cart.add(item);
    }

    // 2. (4??)
    // getTotalPrice:
    // to update price of cart
    // when we add an item
    public double getTotalPrice() {
        double price = 0;
        for (int i = 0; i < cart.size(); i++) {
            price += (cart.get(i).itemPrice * cart.get(i).itemQuantity);
        }
        return price;
    }

    // 3.
    // itemizedList: show the items added
    // to cart along with price
    public String getItemizedList() {
        var sb = new StringBuilder();
        for (Item item : cart) {
            sb.append(item.itemName);
            sb.append(" cost ");
            sb.append(item.itemPrice);
            sb.append(" dollars");
            sb.append("\n");
        }
        return sb.toString();
    }

    // 6.
    // onSaleItems: show items that are on sale
    // in the cart
    public String showOnSaleItems() {
        var sb = new StringBuilder();
        sb.append("Items on sale: ");
        for (String item : saleCart) {
            sb.append(item);
            sb.append(" ");
        }
        return sb.toString();
    }
}
