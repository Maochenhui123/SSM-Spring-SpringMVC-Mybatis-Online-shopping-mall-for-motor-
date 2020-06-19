<%--
  Created by IntelliJ IDEA.
  User: mch
  Date: 2020/6/15
  Time: 15:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>Dealer</h3>
    <form action="dealer/province">
        Province: <input type="text" name="province">
        <input type="submit" value="submit">
    </form>
    <h3>Inventory</h3>
    <form action="inventory/findNumber">
        Dealer_Name: <input type="text" name="dealerName">
        <br/>
        Motor_Name: <input type="text" name="name">
        <br/>
        <input type="submit" value="submit">
    </form>

    <br/>
    <form action="inventory/update">
        Dealer_Id: <input type="text" name="dealerId">
        <br/>
        Motor_Name: <input type="text" name="name">
        <br/>
        <input type="submit" value="submit">
    </form>
    <h3>Motor</h3>
    <form action="motor/findMotorByName">
        Motor_Name: <input type="text" name="name">
        <br/>
        <input type="submit" value="submit">
    </form>
    <h3>Order</h3>
    <form action="order/insertOrder">
        firstName: <input type="text" name="firstName">
        lastName: <input type="text" name="lastName">
        telephone: <input type="text" name="telephone">
        credit:<input type="text" name="credit">
        dealerId: <input type="text" name="dealerId">
        Name: <input type="text" name="name">

        <br/>
        <input type="submit" value="submit">
    </form>
</body>
</html>
