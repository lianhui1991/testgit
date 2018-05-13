<%--
  Created by IntelliJ IDEA.
  User: MaiBenBen
  Date: 2018/5/8
  Time: 22:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1">
    <tr>
        <th>编号</th>
        <th>姓名</th>
        <th>地址</th>
    </tr>

    <c:forEach items="${users}" var="u">
        <tr>
            <td>${u.id}</td>
            <td>${u.username}</td>
            <td>${u.address}</td>
        </tr>
    </c:forEach>


</table>
</body>
</html>
