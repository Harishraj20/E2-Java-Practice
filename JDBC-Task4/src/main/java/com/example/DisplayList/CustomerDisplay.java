package com.example.DisplayList;

import com.example.BeanClass.Customer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.example.JDBCConnectivity.*;

public class CustomerDisplay {

    public static List<Customer> getCustomers(String query) {
        List<Customer> customers = new ArrayList<>();
        
        try (Connection con = DatabaseConnection.getConnection(); 
             PreparedStatement stmt = con.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String email = rs.getString("emailId");

                Customer customer = new Customer(name, age, email);
                customers.add(customer);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return customers;
    }
}
