
package Store;

import DVD.DVD;
import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<DVD> itemsInStore;

    // Constructor
    public Store() {
        itemsInStore = new ArrayList<>();
    }

    // Thêm một DVD vào cửa hàng
    public void addDVD(DVD dvd) {
        if (dvd != null) {
            itemsInStore.add(dvd);
            System.out.println("Added DVD: " + dvd.getTitle());
        } else {
            System.out.println("Cannot add a null DVD.");
        }
    }

    // Xóa một DVD khỏi cửa hàng
    public void removeDVD(String title) {
        boolean removed = itemsInStore.removeIf(dvd -> dvd.getTitle().equalsIgnoreCase(title));
        if (removed) {
            System.out.println("Removed DVD: " + title);
        } else {
            System.out.println("DVD with title '" + title + "' not found.");
        }
    }

    // In danh sách DVD trong cửa hàng
    public void printStore() {
        System.out.println("***************************STORE************************");
        System.out.println("Items in Store:");
        for (int i = 0; i < itemsInStore.size(); i++) {
            DVD dvd = itemsInStore.get(i);
            System.out.println((i + 1) + ". " + dvd.toString());
        }
        System.out.println("********************************************************");
    }
}
