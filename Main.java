import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        DBConnection.getConnection();

        Scanner sc = new Scanner(System.in);

        ProductService productService = new ProductService();
        OrderService orderService = new OrderService();

        // Default Admin Login
        String adminEmail = "admin@gmail.com";
        String adminPassword = "1234";

        System.out.println("===== Retail Inventory & Billing Management System =====");

        // Admin Login
        System.out.print("Enter Admin Email: ");
        String email = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        if (email.equals(adminEmail) && password.equals(adminPassword)) {

            System.out.println("\nLogin Successful!");
            System.out.println("Welcome Admin\n");

            int choice;

            do {
                System.out.println("===== ADMIN MENU =====");
                System.out.println("1. Add Product");
                System.out.println("2. View Products");
                System.out.println("3. Create Order");
                System.out.println("4. View Orders");
                System.out.println("5. Low Stock Alert");
                System.out.println("6. Exit");

                System.out.print("Enter Choice: ");
                choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        System.out.print("Enter Product ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Product Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Price: ");
                        double price = sc.nextDouble();

                        System.out.print("Enter Quantity: ");
                        int quantity = sc.nextInt();

                        Product p = new Product(id, name, price, quantity);
                        productService.addProduct(p);
                        break;

                    case 2:
                        productService.viewProducts();
                        break;

                    case 3:
                        // Updated Create Order (Auto Bill Generation)

                        System.out.print("Enter Order ID: ");
                        int orderId = sc.nextInt();

                        System.out.print("Enter User ID: ");
                        int userId = sc.nextInt();

                        System.out.print("Enter Product Price: ");
                        double productPrice = sc.nextDouble();

                        System.out.print("Enter Quantity: ");
                        int orderQuantity = sc.nextInt();

                        // Auto Bill Calculation
                        double total = productPrice * orderQuantity;

                        sc.nextLine();
                        System.out.print("Enter Status: ");
                        String status = sc.nextLine();

                        System.out.println("Total Bill = " + total);

                        Order o = new Order(orderId, userId, total, status);
                        orderService.createOrder(o);
                        break;

                    case 4:
                        orderService.viewOrders();
                        break;

                    case 5:
                        productService.lowStockAlert();
                        break;

                    case 6:
                        System.out.println("System Closed.");
                        break;

                    default:
                        System.out.println("Invalid Choice!");
                }

            } while (choice != 6);

        } else {
            System.out.println("Invalid Login Credentials!");
        }

        sc.close();
    }
}
