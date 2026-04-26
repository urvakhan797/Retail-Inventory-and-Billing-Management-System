
import java.util.ArrayList;

public class ProductService {

    ArrayList<Product> productList = new ArrayList<Product>();

    // Add Product
    public void addProduct(Product product) {
        productList.add(product);
        System.out.println("Product Added Successfully!");
    }

    // View All Products
    public void viewProducts() {
        if (productList.isEmpty()) {
            System.out.println("No Products Available.");
        } else {
            for (Product p : productList) {
                p.displayDetails();
            }
        }
    }

    // Low Stock Alert
    public void lowStockAlert() {
        boolean found = false;
        for (Product p : productList) {
            if (p.getQuantity() < 5) {
                System.out.println("Low Stock Alert:");
                p.displayDetails();
                found = true;
            }
        }

        if (!found) {
            System.out.println("All products have sufficient stock.");
        }
    }
}