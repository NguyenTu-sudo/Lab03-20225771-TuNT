package AIMS;

import DVD.DVD;
import Cart.Cart;

public class AIMS {
    public static void main(String[] args) {
        // Create a new cart
        Cart anOrder = new Cart();
        
        DVD dvd1 = new DVD("0001", "The lion king1", "Animation", 19.25, "Roger Aller", 5);
        anOrder.addItem(dvd1);
        
        DVD dvd2 = new DVD("0002", "The lion king2", "Animation", 19.25, "Roger Aller", 5);
        anOrder.addItem(dvd2);
        
        DVD dvd3 = new DVD("0003", "The lion king3", "Animation", 19.25, "Roger Aller", 5);
        anOrder.addItem(dvd3);
        
        DVD dvd4 = new DVD("0004", "The lion king4", "Animation", 19.25, "Roger Aller", 5);
        anOrder.addItem(dvd4);
        
        DVD dvd5 = new DVD("0005", "The lion king5", "Animation", 19.25, "Roger Aller", 5);
        anOrder.addItem(dvd5);
        
        System.out.println("Total cost is: " + anOrder.getTotalCost());
    }
}