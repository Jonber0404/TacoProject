<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create New Taco</title>
</head>
<body>
    <h1>Create New Taco</h1>
    <form action="/website/tacos/newTaco.html" method="POST">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required><br>

        <label for="meat">Meat:</label>
        <input type="number" id="meat" name="meat" required><br>
        <label for="chicken">Chicken:</label>
                <input type="number" id="chicken" name="chicken" required><br>
        <label for="fish">Fish:</label>
                <input type="number" id="fish" name="fish" required><br>
        <label for="beans">Beans:</label>
                <input type="number" id="beans" name="beans" required><br>
        <label for="cheese">Cheese:</label>
                 <input type="number" id="cheese" name="cheese" required><br>
        <label for="cucumber">Cucumber:</label>
                <input type="number" id="cucumber" name="cucumber" required><br>
        <label for="sauce">Sauce:</label>
                        <input type="number" id="sauce" name="sauce" required><br>
        <label for="corn">Corn:</label>
                        <input type="number" id="corn" name="corn" required><br>
        <label for="tortillaSize">Tortilla Size:</label>
            <select id="tortillaSize" name="tortillaSize" required>
                <option value="SMALL">Small</option>
                <option value="MEDIUM">Medium</option>
                <option value="LARGE">Large</option>
            </select>

        <button type="submit">Save</button>
    </form>
</body>
</html>