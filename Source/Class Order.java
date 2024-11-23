package Order;

//Order.java
import Cart.CartItem;
import payment.PaymentTransaction;
import java.util.*;

public class Order {
 private String id;
 private String customerEmail;
 private List<CartItem> items;
 private OrderStatus status;
 private DeliveryInfo deliveryInfo;
 private PaymentTransaction payment;
 private float totalCost;
 private float deliveryFee;
 private Date dateCreated;

 public enum OrderStatus {
     PENDING, APPROVED, REJECTED
 }

 public Order(String customerEmail, List<CartItem> items) {
     this.id = UUID.randomUUID().toString();
     this.customerEmail = customerEmail;
     this.items = new ArrayList<>(items);
     this.status = OrderStatus.PENDING;
     this.dateCreated = new Date();
     calculateTotalCost();
 }

 public void calculateDeliveryFee() {
     // Implementation of delivery fee calculation
 }

 public void generateInvoice() {
     System.out.println("=== INVOICE ===");
     System.out.println("Order ID: " + id);
     System.out.println("Customer: " + customerEmail);
     System.out.println("\nItems:");
     for (CartItem item : items) {
         System.out.printf("%s x%d: $%.2f\n", 
             item.getMedia().getTitle(), 
             item.getQuantity(), 
             item.getCost());
     }
     System.out.printf("\nSubtotal: $%.2f\n", totalCost);
     System.out.printf("VAT (10%%): $%.2f\n", totalCost * 0.1);
     System.out.printf("Delivery Fee: $%.2f\n", deliveryFee);
     System.out.printf("Total: $%.2f\n", 
         totalCost * 1.1 + deliveryFee);
 }

 private void calculateTotalCost() {
     totalCost = 0;
     for (CartItem item : items) {
         totalCost += item.getCost();
     }
 }
}