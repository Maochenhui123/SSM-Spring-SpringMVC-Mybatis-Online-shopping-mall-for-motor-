<%-- 
    Document   : payfailure
    Created on : 2019-10-21, 21:25:55
    Author     : V
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Payment Failure</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link type="text/css" rel="stylesheet" href="/css/bootstrap.min.css">
	<link type="text/css" rel="stylesheet" href="/css/style.css">
    </head>
    <body style="background-image: url(/img/338548909822505512.png);">
        <div id="wrap-header">
            <div id="header">
                <h1><img src="/img/abc_logo.png"/></h1>
            </div>
	</div>
	<div id="bg"></div>
	<div id="black"></div>
        <%
            String info = (String)request.getSession().getAttribute("return");
            out.println(info);
        %>
	<div class="cart-items"  >
            <div class="container" style=align-self:center>
                <div class="alert alert-danger" style="margin-top: 40px;"><%=info%></div>
                <p style="display: inline; margin-right: 20px;"><a class="btn btn-success" href="javascript:history.back(-1)">Backward</a></p>
                <p style="display: inline"><a class="btn btn-success" href="index.html">Back to Homepage</a></p>
            </div>
	</div>
    </body>
</html>