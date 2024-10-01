<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="com.example.product" %>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Product List</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <h1>Product List</h1>
    <table>
        <thead>
            <tr>
                <th>Name</th>
                <th>Brand</th>
                <th>Price</th>
                <th>Discount Percentage</th>
                <th>Total Quantity</th>
            </tr>
        </thead>
        <tbody>
            <%
            List<product> products = (List<product>) request.getAttribute("products");
                if (products != null && !products.isEmpty()) {
                    for (product item : products) {
            %>
                <tr>
                    <td><%= item.getName() %></td>
                    <td><%= item.getBrand() %></td>
                    <td><%= item.getPrice() %></td>
                    <td><%= item.getDiscountPercent() %></td>
                    <td><%= item.getTotalQuantity() %></td>
                </tr>
            <%
                    } 
                } else {
            %>
                <tr>
                    <td colspan="5">No products available to view!!</td>
                </tr>
            <%
                } 
            %>
        </tbody>
    </table>
     <button onclick="window.location.href='index.html'">Back</button>
</body>
</html>
