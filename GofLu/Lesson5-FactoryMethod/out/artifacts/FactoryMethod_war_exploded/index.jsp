<%--
  Created by IntelliJ IDEA.
  User: Tushig
  Date: 7/26/2019
  Time: 10:00 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <title>Pizza Factory</title>
    <script type="text/javascript"
            src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script type="text/javascript" src="resources/js/script.js"></script>
    <link rel="stylesheet" type="text/css" href="resources/css/style.css">
  </head>
  <body>
      <h1>Tushig's Hot Oven Pizza</h1>
      <img src="resources/images/pizza.jpg" alt="Tushig's Hot Oven Pizza"/><br/>
      <p>This is our favorite recipe here at Tushig's Pizzas. It has been enjoyed by pizza fans for many years. </p>
      <form method="post" action="pizza">
        <fieldset>
          <label for="selPizza">Choose a pizza:</label>
          <select name="selPizza">
              <option value="cheese">Cheese pizza</option>
              <option value="pepperoni">Pepperoni pizza</option>
              <option value="mushroom">Mushroom pizza</option>
              <option value="hawaii">Hawaiian pizza</option>
              
          </select>
          <label for="txtCount">How many:</label>
          <input name="txtCount" value="1" size="2"/>
          <label for="txtOrderTotal">Order Total:</label>
          <input name="txtOrderTotal" readonly/>
          <input type="submit"/>
        </fieldset
      </form>
  
      <h2>LINKS</h2>
      <ul>
          <li><a href="http://www.google.com/search?q=hot+oven+pizza+recipe&start=10" target="_blank">Search for other hot oven pizza recipes</a></li>
          <li><a href ="pizza">Show Order</a></li>
      </ul>
  <hr/>
      <pre>
          Copyright ©2019 Tushig's Pizzas 
               A Tushig's Pizzas Production     
                      All rights reserved            
      </pre>
    
      <a href="https://validator.w3.org/check/referer">
          <img src="http://mumstudents.org/cs472/images/w3c-html.png" alt="html validator"/>
      </a>
      <a href="https://jigsaw.w3.org/css-validator/check/referer">
          <img src="https://jigsaw.w3.org/css-validator/images/vcss" alt="html validator"/>
      </a>
  
  
  </body>
</html>
