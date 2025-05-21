import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String url = ;
        String username = root;
        String password = Letsdoit!;

        Connection conection = null;
        Statement statement = null;
        ResultSet resultSet = null;


        try {
            class.forName("com.mysql.cj.jdbc.Driver");
            connection =DriverManager.getconection(url,username, password);
            System.out.println("Connected to the database successfully");

        }
    }
}