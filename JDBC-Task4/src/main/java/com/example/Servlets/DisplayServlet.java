package com.example.Servlets;

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

import com.example.BeanClass.Customer;
import com.example.BeanClass.product;
import com.example.JDBCConnectivity.DatabaseConnection;


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
            List<product> products = fetchproducts(); 
            request.setAttribute("products", products);
            request.getRequestDispatcher("products.jsp").forward(request, response);
        }
    }

    protected static List<Customer> fetchCustomers() {
        String query = "SELECT * FROM customers"; 
        List<Customer> customers = new ArrayList<>();

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String email = rs.getString("emailId");

                Customer customer = new Customer(name, age, email);
                customers.add(customer);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return customers;
    }

    protected static List<product> fetchproducts() {
        String query = "SELECT * FROM products"; 
        List<product> products = new ArrayList<>();

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String brand = rs.getString("brand");
                double price = rs.getDouble("price");
                double discountPercent = rs.getDouble("discountPercent");
                int totalQuantity = rs.getInt("totalQuantity");

                product product = new product(id,name, brand, price, discountPercent, totalQuantity);
                products.add(product);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return products;
    }
}
