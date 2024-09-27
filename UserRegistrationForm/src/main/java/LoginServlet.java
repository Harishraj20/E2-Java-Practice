import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	
		String studentName = request.getParameter("sname");
		int studentAge = Integer.parseInt(request.getParameter("sage"));
		String studentDepartment = request.getParameter("sdept");
		int studentRollNumber = Integer.parseInt(request.getParameter("sroll"));
		
		String addQuery = "INSERT INTO stduent VALUES (?, ?, ?, ?)";
		
	
		String url = "jdbc:mysql://localhost:3306/harishdb";
		String username = "root";
		String password = "Harishraj@12";
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
		e.printStackTrace();
		}
		try (
			Connection connection = DriverManager.getConnection(url, username, password);
			PreparedStatement statement = connection.prepareStatement(addQuery)
		) {
			
			// Set the parameters for the query
			statement.setInt(1, studentRollNumber);       
			statement.setString(2, studentName);                 
			statement.setInt(3, studentAge); 
			statement.setString(4, studentDepartment);
	
			int result = statement.executeUpdate();       
		
			System.out.println(result + " record(s) inserted.");
			
		} catch (SQLException e) {
	        e.printStackTrace();
	    }
	}
}
