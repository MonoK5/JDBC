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

            Statement =connection.createStatement();

            String sqlQuery = "SELECT * FROM users";
            resultSet = statement.executeQuery(sqlQuery);

                    System.out.print("\nQuery Result : ");
                    System.out.println("ID\tUsername\temail");
                    while (resultSet.next()){
                        int id = resultSet.getInt("id");
                        String name = resultSet.getString("name");
                        String email = resultSet.getString("email");
                        System.out.println("ID\t" + id + "\t" + name + "\t" + email);
                    }
                    System.out.println("\nQuery Result : ");

        }
    }
}