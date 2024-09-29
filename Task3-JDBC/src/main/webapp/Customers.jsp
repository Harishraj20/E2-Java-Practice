<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="com.database.Customer" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Customer List</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <h1>Customer List</h1>
    <table>
        <thead>
            <tr>
                <th>Name</th>
                <th>Age</th>
                <th>Email</th>
                <th>Mobile Number</th>
            </tr>
        </thead>
        <tbody>
            <%
                List<Customer> customers = (List<Customer>) request.getAttribute("customers");
                if (customers != null && !customers.isEmpty()) {
                    for (Customer item : customers) {
            %>
                <tr>
                    <td><%= item.getName() %></td>
                    <td><%= item.getAge() %></td>
                    <td><%= item.getEmail() %></td>
                    <td><%= item.getMobileNumber() %></td>
                </tr>
            <%
                    } 
                } else {
            %>
                <tr>
                    <td colspan="4">No customers available.</td>
                </tr>
            <%
                } 
            %>
        </tbody>
    </table>
</body>
</html>
