
import java.util.ArrayList;

public class OrderService {

    ArrayList<Order> orderList = new ArrayList<Order>();

    // Create Order
    public void createOrder(Order order) {
        orderList.add(order);
        System.out.println("Order Created Successfully!");
    }

    // View All Orders
    public void viewOrders() {
        if (orderList.isEmpty()) {
            System.out.println("No Orders Available.");
        } else {
            for (Order o : orderList) {
                o.displayDetails();
            }
        }
    }
}