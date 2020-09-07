<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="root" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>login page</title>
</head>
<body>
    <form action="${root}/user/login.do" method="post">
        <label for="id">ID</label>
        <input type="text" id="id" name="id"/>
        <br/>
        <label for="password">PW</label>
        <input type="password" id="password" name="password"/>
        <br/>
        <button type="submit">LOGIN</button>
    </form>
    
    <script>
        window.onload = function() {
            document.getElementById("id").focus();
        }
    </script>
</body>
</html>