<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--<!DOCTYPE html>--%>
<html lang="en">
    <head>
      <title>500 Error</title>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <link href="/css/error.css" rel="stylesheet">
    </head>
    <body>
        <div class="l-page">
            <header class="l-header">
                <div class="header-top">
                    <div class="kawasaki-logo">
                        <img alt="Kawasaki-logo" src="/img/kawasaki-logo.png"/>
                    </div>
                </div>
            </header>
            <section class="l-main p-500 p-error">
                <div class="error-block">
                    <p class="text-center">
                        <strong>
                            <big>
                                Something<br> went wrong.
                            </big>
                        </strong>
                        <strong class="text--green">Error code: 500</strong>
                        <strong>${error}</strong>
                        <a href="/index.html">HOME</a>
                    </p>
                </div>
            </section>
        </div>
    </body>
</html>
