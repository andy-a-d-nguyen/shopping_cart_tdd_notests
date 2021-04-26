package com.galvanize.cart;

import java.util.ArrayList;
/*
   When site is first visited, cart is empty
*/
public class Cart {
    // 1.
    // cart instantiation
    public String name;
    public ArrayList<Item> cart = new ArrayList<Item>();
    public ArrayList<String> saleCart = new ArrayList<String>();

    // constructor
    public Cart(String name) {
        this.name = name;
    }

    public int getSize() {
        return cart.size();
    }

    public int getSaleSize() {
//        System.out.println("sale cart " + saleCart.toArray());
//        System.out.println("sale cart size" + saleCart.size());
        return saleCart.size();
    }

    public void addItem(Item item) {
        if (item.onSale) {
//            System.out.println("sale item added" + item.itemName);
            saleCart.add(item.itemName);
//            System.out.println("sale item list number" + saleCart.size());
        }
        cart.add(item);
    }

    public double getTotalPrice() {
        double price = 0;
        for (int i = 0; i < cart.size(); i++) {
            price += (cart.get(i).itemPrice * cart.get(i).itemQuantity);
        }
        return price;
    }



    // 2. (4??)
    // getTotalPrice:
    // to update price of cart
    // when we add an item

    // 3.
    // itemizedList: show the items added
    // to cart along with price

    // 6.
    // onSaleItems: show items that are on sale
    // in the cart
}
