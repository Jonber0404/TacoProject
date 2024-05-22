<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
   <title>Tacos page</title>
</head>
<body>
<h1>Tacos page</h1>

<ul>
   <c:forEach items="${tacos}" var="taco">
      <li>${taco}</li>
   </c:forEach>
</ul>
</body>
</html>