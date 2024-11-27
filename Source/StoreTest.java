package Store;

import DVD.DVD;

public class StoreTest {
    public static void main(String[] args) {
        // Tạo một cửa hàng
        Store store = new Store();

        // Tạo các đối tượng DVD
        DVD dvd1 = new DVD("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DVD dvd2 = new DVD("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        DVD dvd3 = new DVD("Aladin", "Animation", null, 0, 18.99f);

        // Thêm DVD vào cửa hàng
        store.addDVD(dvd1);
        store.addDVD(dvd2);
        store.addDVD(dvd3);

        // In danh sách DVD trong cửa hàng
        store.printStore();

        // Xóa một DVD khỏi cửa hàng
        store.removeDVD("Star Wars");

        // In lại danh sách DVD trong cửa hàng
        store.printStore();

        // Thử xóa DVD không tồn tại
        store.removeDVD("Nonexistent DVD");
    }
}
