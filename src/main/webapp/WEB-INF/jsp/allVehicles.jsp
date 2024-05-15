<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
   <title>Vehicles page</title>
</head>
<body>
<h1>Vehicles page</h1>

<ul>
   <c:forEach items="${vehicles}" var="vehicle">
      <li>${vehicle}</li>
   </c:forEach>
</ul>
</body>
</html>
