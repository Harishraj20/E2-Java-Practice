

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/LoginInfoServlet")
public class LoginInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String name = request.getParameter("uname");
	String age = request.getParameter("age");
	String gender = request.getParameter("gender");
	String email = request.getParameter("email");

	request.setAttribute("uname",name);
	request.setAttribute("age", age);
	request.setAttribute("gender", gender);
	request.setAttribute("email", email);
	
	HttpSession session = request.getSession();
	session.setAttribute("uname",name);
	
	
	
	if(name.equalsIgnoreCase("Harish") && name!=null){
		request.getRequestDispatcher("greetings.jsp").forward(request, response);// forward the request rather creating new request
	}else {
		response.sendRedirect("hello.html"); //making new request to the hello.html
	}
	
	}



}
