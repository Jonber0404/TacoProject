<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Taco</title>
</head>
<body>
    <h1>This is ${taco.name} page</h1>
    <p>ID: ${taco.id}</p>
    <p>Name: ${taco.name}</p>
    <p>Meat: ${taco.meat}g</p>
    <p>Chicken: ${taco.chicken}g</p>
    <p>Fish: ${taco.fish}g</p>
    <p>Beans: ${taco.beans}g</p>
    <p>Cheese: ${taco.cheese}g</p>
    <p>Cucumber: ${taco.cucumber}g</p>
    <p>Sauce: ${taco.sauce}g</p>
    <p>Corn: ${taco.corn}g</p>
    <p>Tortilla Size: ${taco.tortillaSize}</p>
    <p>Size: ${taco.size}%</p>
    <p>Weight: ${taco.weight}g</p>
    <a href="/home.html">Back to Home</a>

    <a href="editTaco.html"><button id="edit">Edit</button></a>
    <form action="eatTaco" method="post">
        <input type="hidden" name="id" value="${taco.id}" />
        <button type="submit">Eat</button>
    </form>
    <c:if test="${not empty message}">
        <p style="color: red;">${message}</p>
    </c:if>
    <a href="/home.html"><button id="exit">Exit</button></a>
    <br>
    <a href="/tacos/${taco.name}"><button>GET</button></a>
</body>
</html>