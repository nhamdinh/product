<%--
  Created by IntelliJ IDEA.
  User: tom
  Date: 07/03/2020
  Time: 20:40
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List product</title>
</head>
<body>
<h>Products</h>
<table border="2">
    <tr>
        <td>Name</td>
        <td>Prime</td>
        <td>Description</td>
        <td>Company</td>
        <td>Edit</td>
        <td>Delete</td>
    </tr>
    <c:forEach items='${requestScope["products"]}' var="Product">

    <tr>
        <td></td>
        <td>${Product.getPrime()}</td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>



    </tr>
    </c:forEach>



</table>



</body>
</html>
