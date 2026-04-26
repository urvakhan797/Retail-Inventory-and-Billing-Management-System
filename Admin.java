//Inheritance + Polymorphism
//Admin class extends User class 
public class Admin extends User {

    // Constructor
    public Admin(int id, String name, String email, String password) {
        super(id, name, email, password, "admin");
    }

    // Method Overriding (Polymorphism)
    @Override
    public void displayUser() {
        System.out.println("===== Admin Information =====");
        super.displayUser();
    }

    // Extra Admin Feature
    public void manageSystem() {
        System.out.println("Admin can manage products, billing and orders.");
    }
}