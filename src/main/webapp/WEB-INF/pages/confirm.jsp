<%--
    Document   : appointment
    Created on : 2019-10-21, 15:41:29
    Author     : V
--%>


<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<!DOCTYPE html>
<html>
    <head>
	<title>Confirm Order</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<link type="text/css" rel="stylesheet" href="/css/bootstrap.min.css">
	<link type="text/css" rel="stylesheet" href="/css/style.css">
    </head>
    <body style="background-image: url(/img/338548909822505512.png);">

        <div id="wrap-header">
            <div id="header">
                <h1><img src="/img/abc_logo.png"></h1>
            </div>
        </div>
        <div id="bg"></div>
        <div id="black"></div>

	<div class="account">
            <div class="container">
                <div class="register">
                    <form action="insertOrder" method="post" onsubmit="return chec(this)">
                        <div class="register-top-grid">
                            <h3>Confirm Order</h3>
                            <div class="input">
                                <span>Firstname <label style="color:#ffffff;">*</label></span>
                                <input type="text" placeholder="Please input your firstname" value="${order.firstName}" disabled="true">
                            </div>
                            <div class="input">
                                <span>Secondname <label style="color:#ffffff;">*</label></span>
                                <input type="text" placeholder="Please input your secondname" value="${order.lastName}" disabled="true">
                            </div>
                            <div class="input">
                                <span>Telephone<label style="color:#ffffff;">*</label></span>
                                <input type="text" placeholder="Please input your telephone number" value="${order.telephone}" disabled="true">
                            </div>
                            <div class="input">
                                <span>Credit<label style="color:#ffffff;">*</label></span>
                                <input type="text" placeholder="Please input your credit number" value="${order.credit}" disabled="true">
                            </div>
                            <div class="input">
                                <input type="text" name="dealerId"  value="${order.dealerId}" readonly="readonly" hidden="hidden">
                            </div>
                            <div class="input">
                                <span>Model<label></label></span>
                                <input type="text" name="name"  value="${order.name}" disabled="true">
                            </div>
                            <div class="input">
                                <span>Dealer<label></label></span>
                                <input type="text" name="dealerName"  value="${item.dealerName}" disabled="true">
                            </div>
                        </div>
                        <div class="register-but text-center">
                            <input type="button" value="MODIFY" onclick="location.href='javascript:history.back(-1);'" style="margin-right: 20px;">
                           <input type="submit" value="CONFIRM">
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
