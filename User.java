//This class shows encapsulation (private variables + getters/setters)
public class User extends Person {
    private int id;
    private String name;
    private String email;
    private String password;
    private String role;

    // Constructor
    public User(int id, String name, String email, String password, String role) {
    super(name, email);
    this.id = id;
    this.password = password;
    this.role = role;
}

    // Getter
    public int getId() {
        return id;
    }
    // Getter
    public String getName() {
        return name;
    }
    // Getter
    public String getEmail() {
        return email;
    }
    // Getter
    public String getRole() {
        return role;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }
    // Setter
    public void setEmail(String email) {
        this.email = email;
    }

    // Display Method
    public void displayUser() {
        System.out.println("User ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Role: " + role);
    }
    @Override
    public void displayRole() {
        System.out.println("Role: " + role);
}
}