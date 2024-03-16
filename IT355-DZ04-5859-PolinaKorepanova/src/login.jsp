<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="styles/styles.css">
    <title>Login</title>
</head>
<body>
<h2>Login</h2>
<form action="servlet" method="post">
    <input type="hidden" name="action" value="login">
    Email: <input type="email"  name="email"><br>
    Password: <input type="password" name="password"><br>
    <input type="submit" value="Login">
</form>
<p id="error">${error}</p>
</body>
</html>
