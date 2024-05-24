<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<h1>Welcome to tacoproject</h1>
<div id="dateAndTime">${dateAndTime}</div>

<html>
<head>
    <title>Home</title>
    <style>
            #dateAndTime {
                position: absolute;
                top: 10px;
                right: 10px;
            }
        </style>
</head>
<body>
    <h2>Here are 4 basic tacos</h2>

    <br>
    <a href="/taco.html?taco=FishTaco"><button id="taco1">FishTaco</button></a>
    <br>
    <br>
    <a href="/taco.html?taco=MeatTaco"><button id="taco2">MeatTaco</button></a>
    <br>
    <br>
    <a href="/taco.html?taco=BeanTaco"><button id="taco3">BeanTaco</button></a>
    <br>
    <br>
    <a href="/taco.html?taco=MixedTaco"><button id="taco4">MixedTaco</button></a>
    <br>
    <br>
    <br>
    <br>
    <br>
    <h2>Custom made tacos</h2>
    <br>
    <a href="/website/tacos/list.html"><button id="viewAllTacos">View All Tacos</button></a>
    <br>
    <br>
    <a href="/website/tacos/newTaco.html"><button id="createNewTaco">Bake new taco</button></a>
    <br>
    <br>
    <form action="/taco.html" method="get">
            <label for="search">Search for a Taco:</label>
            <input type="text" id="search" name="taco" placeholder="Enter taco name" required>
            <button type="submit">Search</button>
        </form>

</body>
</html>
