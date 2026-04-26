
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static Connection getConnection() {
        Connection con = null;

        try {
            // Driver load karna zaroori hai
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/inventory_db";
            String user = "root";
            String password = "Khan8916@";

            con = DriverManager.getConnection(url, user, password);

            System.out.println("Database Connected Successfully!");

        } catch (Exception e) {
            System.out.println("Database Connection Failed!");
            System.out.println(e);
        }

        return con;
    }
}