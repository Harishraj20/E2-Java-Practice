package com.example;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DisplayServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String type = request.getParameter("type");
        
        if (type.equals("customers")) {

        	List<Customer> customers = fetchCustomers();
            request.setAttribute("customers", customers);
            request.getRequestDispatcher("Customers.jsp").forward(request, response);

        } else {

        	List<product> products = fetchProducts();
            request.setAttribute("products", products);
            request.getRequestDispatcher("products.jsp").forward(request, response);

        }

    }

    private List<Customer> fetchCustomers() {
    	String query = selectTable("customers"); 
    	System.out.println(query);
        List<Customer> customers = new ArrayList<>();

		try (
			Connection conn = DatabaseConnection.getConnection();
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
            System.out.println(e);
        }
        return customers;
    }
    

    private List<product> fetchProducts() {
    	String query = selectTable("products"); 
    	System.out.println(query);
        List<product> products = new ArrayList<>();
        
        try (
        	Connection conn = DatabaseConnection.getConnection();
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
         System.out.println(e);
        }
        return products;
    }
    
    private String selectTable(String table) {
        return "SELECT * FROM " + table;
    }





}
