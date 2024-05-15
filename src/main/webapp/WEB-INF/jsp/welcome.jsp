<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<h1>Welcome to fleetman, the date and time is ${dateAndTime}</h1>

<html>
<head>
        <title>Number List</title>
</head>
<body>
<ul>
        <% for (int i = 1; i <= 10; i++) { %>
        <li><%= i %></li>
        <% } %>
</ul>
</body>
