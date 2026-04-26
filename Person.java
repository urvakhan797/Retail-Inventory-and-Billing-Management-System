public abstract class Person {
    protected String name;
    protected String email;

    // Constructor
    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Abstract Method
    public abstract void displayRole();
}