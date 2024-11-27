package Cart;
import DVD.DVD;
public class CartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();

        // Tạo các DVD mẫu
        DVD dvd1 = new DVD("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DVD dvd2 = new DVD("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        DVD dvd3 = new DVD("Aladin", "Animation", null, 18.99f, null, 0);

        // Thêm DVD vào giỏ hàng
        cart.addItem(dvd1);
        cart.addItem(dvd2);
        cart.addItem(dvd3);

        //In gio hang
        cart.printCart();
        

        // Tìm kiếm 
        System.out.println("Tìm kiếm DVD có ID 'DVD2':");
        cart.searchDVDById("DVD2");

        System.out.println("\nTìm kiếm DVD có ID 'DVD4':");
        cart.searchDVDById("DVD4");

    }
}
