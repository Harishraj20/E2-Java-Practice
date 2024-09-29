package com.database;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/DataServlet")
public class DisplayServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
 

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
        String type = request.getParameter("type");
        if ("customers".equalsIgnoreCase(type)) {
        	
            List<Customer> customers = fetchCustomers();
            request.setAttribute("customers", customers);
            request.getRequestDispatcher("Customers.jsp").forward(request, response);
            
        } else if ("products".equalsIgnoreCase(type)) {
        	
            List<product> products = fetchProducts();
            request.setAttribute("products", products);
            request.getRequestDispatcher("products.jsp").forward(request, response);
            
        } else {
           return;
        }
    }


    private List<Customer> fetchCustomers() {
        List<Customer> customers = new ArrayList<>();
        String query = "SELECT * FROM customers"; 
        try {
    		Class.forName("com.mysql.cj.jdbc.Driver");
    		} catch (ClassNotFoundException e) {
    		e.printStackTrace();
    		}
        
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/harishdatabase", "root", "Harishraj@121");
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String email = rs.getString("email");
                int mobileNumber = rs.getInt("mobileNumber");
                
                Customer customer = new Customer(name, age, email, mobileNumber);
                customers.add(customer);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return customers;
    }

    private List<product> fetchProducts() {
        List<product> products = new ArrayList<>();
        String query = "SELECT * FROM products"; 
        
        try {
    		Class.forName("com.mysql.cj.jdbc.Driver");
    		} catch (ClassNotFoundException e) {
    		e.printStackTrace();
    		}
        
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/harishdatabase", "root", "Harishraj@121");
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                String name = rs.getString("name");
                String brand = rs.getString("brand");
                double price = rs.getDouble("price");
                double discountPercent = rs.getDouble("discountPercent");
                int totalQuantity = rs.getInt("totalQuantity");

                product product = new product(name, brand, price, discountPercent, totalQuantity);
                products.add(product);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return products;
    }
}
