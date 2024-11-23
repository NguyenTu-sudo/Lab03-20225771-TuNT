// Cart.java
package Cart;

import DVD.DVD;
import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<CartItem> items;
    private double totalCost;

    public Cart() {
        items = new ArrayList<>();
        totalCost = 0;
    }

    public void addItem(DVD dvd) {
        CartItem existingItem = findItem(dvd.getId());
        if (existingItem != null) {
            existingItem.incrementQuantity();
        } else {
            items.add(new CartItem(dvd));
        }
        updateTotalCost();
    }

    public void removeItem(String dvdId) {
        items.removeIf(item -> item.getDvd().getId().equals(dvdId));
        updateTotalCost();
    }

    public void updateQuantity(String dvdId, int quantity) {
        CartItem item = findItem(dvdId);
        if (item != null) {
            item.setQuantity(quantity);
            updateTotalCost();
        }
    }

    private void updateTotalCost() {
        totalCost = 0;
        for (CartItem item : items) {
            totalCost += item.getCost();
        }
    }

    private CartItem findItem(String dvdId) {
        return items.stream()
                   .filter(item -> item.getDvd().getId().equals(dvdId))
                   .findFirst()
                   .orElse(null);
    }

    // Getters
    public List<CartItem> getItems() {
        return items;
    }

    public double getTotalCost() {
        return totalCost;
    }
}