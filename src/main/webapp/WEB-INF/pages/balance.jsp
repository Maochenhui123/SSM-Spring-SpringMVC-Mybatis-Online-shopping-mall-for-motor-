<%-- 
    Document   : balance
    Created on : 2019-10-20, 19:47:08
    Author     : V
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Balance</title>
        <link href="/css/main2.css" rel="stylesheet" type="text/css">
        <style>
            .info-tb{ width:300px; color:#eeeeee; float:left; margin-left:25px;}
            .info-tb td{ padding-left:10px; height:44px;vertical-align:middle; border-bottom:1px solid #999999; border-top:1px solid #999999;}
            .info-tb-t{ width:130px; border-right:1px solid #999999;}
        </style>
    </head>
    <body>
        <div class="container">
            <header id="header">
                <div id="khilogo"><img src="/img/kawasaki_logo.gif" alt="Kawasaki"></a></div>
                <div id="btn-home"><a href="index.html"><img src="/img/home.gif" width="86" height="21" alt="HOME" class="Hover"></a></div>
            </header>

            <div class="content">
                <form action="purchase">
                    <article>
                        <h1 class="model-name">${motor.name}</h1>
                        <section>
                            <img id="model-image" src="${motor.photo}" width="1000" height="450">
                        </section>

                        <div id="modelspec" style="padding: 0 150px;">
                            <table class="info-tb">
                                <tbody>
                                    <tr>
                                        <td class="info-tb-t">Name</td>
                                        <td>${motor.name}</td>
                                    </tr>
                                    <tr>
                                        <td class="info-tb-t">Dealer</td>
                                        <td>${dealer.dealerName}</td>
                                    </tr>
                                </tbody>
                            </table>
                            <table class="info-tb">
                                <tbody>
                                    <tr>
                                        <td class="info-tb-t">Balance</td>
                                        <td>${inventory.number}</td>
                                    </tr>
                                    <c:if test="${inventory.number ==0}">
                                    <tr>
                                        <td colspan="2"><div class="but"><input id="but_dis" type="submit" value="PURCHASE" disabled="true"></div></a></td>
                                    </tr>
                                    </c:if>
                                    <c:if test="${inventory.number > 0}">
                                    <tr>
                                        <td colspan="2"><div class="but"><input id="but" type="submit" value="PURCHASE"></div></a></td>
                                    </tr>
                                    </c:if>
                                </tbody>
                            </table>
                        </div>
                    </article>
                </form>
            </div>
        </div>
    </body>
</html>
