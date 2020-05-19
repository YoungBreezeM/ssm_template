<%--
  Created by IntelliJ IDEA.
  User: yqf
  Date: 2020/5/19
  Time: 下午5:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/home" method="post">
        <input type="text" name="name" value="1">
        <input type="text" name="age" value="18">
        <input type="submit">
    </form>
    <p>${user.name}</p>
    <p>${user.age}</p>
</body>
</html>
