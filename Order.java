public class Order implements Displayable {
    private int orderId;
    private int userId;
    private double totalAmount;
    private String status;

    // Constructor
    public Order(int orderId, int userId, double totalAmount, String status) {
        this.orderId = orderId;
        this.userId = userId;
        this.totalAmount = totalAmount;
        this.status = status;
    }

    // Getters
    public int getOrderId() {
        return orderId;
    }

    public int getUserId() {
        return userId;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public String getStatus() {
        return status;
    }

    // Setter
    public void setStatus(String status) {
        this.status = status;
    }
    //implement the method of  Displayable interface
    @Override
    public void displayDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("User ID: " + userId);
        System.out.println("Total Bill: " + totalAmount);
        System.out.println("Status: " + status);
        System.out.println("----------------------------");
    }
}