import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/your_database_name";
        String username = "root";
        String password = "Letsdoit!";

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");


            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database successfully");


            statement = connection.createStatement();


            String sqlQuery = "SELECT * FROM users";
            resultSet = statement.executeQuery(sqlQuery);


            System.out.println("\nQuery Result:");
            System.out.println("ID\tUsername\tEmail");

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");

                System.out.println(id + "\t" + name + "\t" + email);
            }

        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Database connection failed.");
            e.printStackTrace();
        } finally {

            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
