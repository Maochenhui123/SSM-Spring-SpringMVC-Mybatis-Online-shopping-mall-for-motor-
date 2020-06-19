<%--
    Document   : appointment
    Created on : 2019-10-21, 15:41:29
    Author     : V
--%>


<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<!DOCTYPE html>
<html>
    <head>
	<title>Order Information</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<link type="text/css" rel="stylesheet" href="/css/bootstrap.min.css">
	<link type="text/css" rel="stylesheet" href="/css/style.css">
    </head>
    <script type="text/javascript">
        function chec(form){
            var t = document.getElementByName('telephone');
            var reg = "^\d{11}$";
            if(!reg.test(t)){
                alert("WRONG PHONE NUMBER FORMAT!");
                return false;
            }
            else{
                return true;
            }
        }
        var formObj = document.getElementById('passForm');
        formObj.submit();
    </script>
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
                    <form action="/order/confirm" method="post" onsubmit="return chec(this)" id="passForm">
                        <div class="register-top-grid">
                            <h3>Client information</h3>
                            <div class="input">
                                <span>Firstname <label style="color:#ffffff;">*</label></span>
                                <input type="text" name="firstName" placeholder="Please input your firstname" title="Please fill in this field">
                            </div>
                            <div class="input">
                                <span>Secondname <label style="color:#ffffff;">*</label></span>
                                <input type="text" name="lastName" placeholder="Please input your secondname" title="Please fill in this field">
                            </div>
                            <div class="input">
                                <span>Telephone<label style="color:#ffffff;">*</label></span>
                                <input type="text" name="telephone" placeholder="Please input your telephone number (11 digit)" title="Please fill in this field">
                            </div>
                            <div class="input">
                                <span>Credit<label style="color:#ffffff;">*</label></span>
                                <input type="text" name="credit" placeholder="Please input your credit number" title="Please fill in this field">
                            </div>
                            <div class="input">
                                <input type="text" name="dealerId"  value="${dealer.dealerId}" readonly="readonly" hidden="hidden">
                            </div>
                            <div class="input">
                                <span>Model<label></label></span>
                                <input type="text" name="name"  value="${motor.name}" readonly="readonly">
                            </div>
                            <div class="input">
                                <span>Dealer<label></label></span>
                                <input type="text" name="dealerName"  value="${dealer.dealerName}" readonly="readonly">
                            </div>
                        </div>
                        <div class="register-but text-center">
                           <input type="submit" value="COMPLETE">
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
