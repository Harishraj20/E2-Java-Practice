import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcOperations {
    public static void main(String[] args) {
        String query = "SELECT studentName, studentDpt FROM stduent WHERE studentAge = 20";
        String query1 = "UPDATE stduent SET studentName = 'mahesh' WHERE studentAge = 20";
        String queryUpdate = "INSERT INTO stduent VALUES (6,'Mukesh','18','EEE')";
        
        String url = "jdbc:mysql://localhost:3306/harishdb";
        String username = "root";
        String password = "Harishraj@12";

        try (Connection connection = DriverManager.getConnection(url, username, password);
             Statement statement = connection.createStatement()) {

 
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                String name = resultSet.getString("studentName");
                String dpt = resultSet.getString("studentDpt");
                System.out.println(name + " " + dpt);
            }

            resultSet.close();
            
            int res = statement.executeUpdate(query1);
            System.out.println(res + " rows updated.");
            
            int res1 = statement.executeUpdate(queryUpdate);
            System.out.println(res1 + " rows added.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
