<%--
  Created by IntelliJ IDEA.
  User: mch
  Date: 2020/6/15
  Time: 15:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>SUCCESS 查询了所有信息</h3>
    <c:forEach items="${dealers}" var="dealer">
        ${dealer.toString()}
    </c:forEach>
    ${inven2.number}
    ${motor.toString()}
    ${dealer.toString()}
    ${order.toString()}
</body>
</html>
