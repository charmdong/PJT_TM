<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="root" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>index page</title>
</head>
<body>
    <h1>hello world</h1>
    <c:choose>
        <c:when test="${id eq null}">
            <button onclick="location.href='${root}/user/loginForm.do'">login</button>
            <button onclick="location.href='${root}/user/joinForm.do'">Join</button>
        </c:when>
        <c:otherwise>
            <button onclick="location.href='${root}/user/logout.do'">logout</button>
        </c:otherwise>
    </c:choose>
</body>
</html>