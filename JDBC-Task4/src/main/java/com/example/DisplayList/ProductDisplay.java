package com.example.DisplayList;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.example.BeanClass.product;

public class ProductDisplay {
    
    public static List<product> getProducts(Connection con, String query) {
        List<product> products = new ArrayList<>();

        try (PreparedStatement stmt = con.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String brand = rs.getString("brand");
                double price = rs.getDouble("price");
                double discountPercent = rs.getDouble("discountPercent");
                int totalQuantity = rs.getInt("totalQuantity");

                product product = new product(id, name, brand, price, discountPercent, totalQuantity);
                products.add(product);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return products;
    }
}
