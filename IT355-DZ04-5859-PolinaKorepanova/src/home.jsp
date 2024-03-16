<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="styles/styles.css">
    <title>Home</title>
</head>
<body>
<h2>Welcome to Home Page</h2>
<%
    String userEmail = "";
    Cookie[] cookies = request.getCookies();
    if (cookies != null) {
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("email")) {
                userEmail = cookie.getValue();
                break;
            }
        }
    }
%>
<% if (!userEmail.isEmpty()) { %>
<p>Your email: <%= userEmail %></p>
<% } else { %>
<p>No email found in cookies.</p>
<% } %>
</body>
</html>
