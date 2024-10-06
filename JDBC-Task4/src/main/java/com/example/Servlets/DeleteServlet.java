package com.example.Servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.BeanClass.product;
import com.example.DisplayList.ProductDisplay;
import com.example.JDBCConnectivity.DatabaseConnection;

public class DeleteServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
        response.setHeader("Pragma", "no-cache");
        response.setHeader("Expires", "0");

        String val = request.getParameter("productName");


        String deleteQuery = "DELETE FROM products WHERE id = ?";

        try (   Connection con = DatabaseConnection.getConnection();
                PreparedStatement stmt = con.prepareStatement(deleteQuery)) {

            stmt.setInt(1, Integer.parseInt(val));
            stmt.executeUpdate();

            String fetchQuery = "SELECT * FROM products"; 
            List<product> products = ProductDisplay.getProducts(con, fetchQuery); 

            request.setAttribute("products", products);
            request.getRequestDispatcher("products.jsp").forward(request, response);

        } catch (Exception e) {
            e.printStackTrace(); 
        }
    }
}
