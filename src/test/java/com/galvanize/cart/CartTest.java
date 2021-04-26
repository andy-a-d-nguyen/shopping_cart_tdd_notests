package com.galvanize.cart;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
    When site is first visited, cart is empty
*/
public class CartTest {
    // 1st test:
    // Check cart is empty when program first run
    // instantiate an empty cart

    @Test
    public void initializeCartTest() {
        // Setup:
        Cart cart = new Cart("");

        // Execute + Assert
        assertEquals(0, cart.getSize(), "cart should be empty");
    }

    // 2nd test:
    // Check getTotalPrice to see if the price
    // of the total cart matches expected price
    @Test
    public void getTotalPriceTest() {
        // initialize cart
        // add items to cart
        // compute price

        // Setup:
        Cart cart = new Cart("Test");
        Item eggs = new Item("eggs", 5, 1, false);
        Item milk = new Item("milk", 5, 2, false);
        Item noodles = new Item("noodles", 3, 3, false);
        cart.addItem(eggs);
        cart.addItem(milk);
        cart.addItem(noodles);

        // Execute
        double totalPrice = cart.getTotalPrice();

        /// Assert
        assertEquals(24, totalPrice, "should return total price of cart");
    }

    // 3rd test:
    // Check itemList to see if list
    // matches expected length

    @Test
    public void getItemizedListTest() {
        Cart cart = new Cart("Test");
        Item eggs = new Item("eggs", 5, 1, false);
        Item milk = new Item("milk", 5, 2, false);
        Item noodles = new Item("noodles", 3, 3, false);
        cart.addItem(eggs);
        cart.addItem(milk);
        cart.addItem(noodles);

        int cartSize = cart.getSize();

        assertEquals(3, cartSize, "expecting cart size to match number of items added");
    }

    // 4th test:
    // Check to see if item quantity is updated,
    // which causes total price to be updated
    @Test
    public void getUpdatePriceTest() {
        // Setup:
        Cart cart = new Cart("Test");
        Item eggs = new Item("eggs", 5, 1, false);
        Item milk = new Item("milk", 5, 2, false);
        Item noodles = new Item("noodles", 3, 3, false);
        cart.addItem(eggs);
        cart.addItem(milk);
        cart.addItem(noodles);

        // Execute:
        eggs.updateQuantity(4);
        double totalPrice = cart.getTotalPrice();

        // Assert:
        assertEquals(39, totalPrice, "should update total price when an item quantity is updated");
    }

    // 5th test:
    // Check to see if item quantity is updated
    // correctly when we add quantity

    @Test
    public void updatedQuantityTest() {
        // Setup:
        Cart cart = new Cart("Test");
        Item eggs = new Item("eggs", 5, 1, false);
        cart.addItem(eggs);

        // Execute:
        eggs.updateQuantity(4);

        // Assert:
        assertEquals(4, eggs.itemQuantity, "should have updated quantity");
    }
    // 6th test:
    // Check to see if items on sale matches
    // expected list of items on sale

    @Test
    public void onSaleItemsTest() {
        Cart cart = new Cart("Test");
        Item eggs = new Item("eggs", 5, 1, false);
        Item milk = new Item("milk", 5, 2, false);
        Item noodles = new Item("noodles", 3, 3, false);
        cart.addItem(eggs);
        cart.addItem(milk);
        cart.addItem(noodles);
        Item chips = new Item("chips", 3, 1, true);
        Item chicken = new Item("chicken", 10, 2, true);
        cart.addItem(chips);
        cart.addItem(chicken);

        int saleSize = cart.getSaleSize();

        assertEquals(2, saleSize, "should have 2 items in sale list");
    }



}
