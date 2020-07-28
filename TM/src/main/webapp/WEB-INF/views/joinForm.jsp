<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="root" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Join Form</title>
</head>
<body>
    <form action="${root}/user/join.do" method="post">
        <label>ID</label>
        <input name="id" type="text"><br/>

        <label>PW</label>
        <input name="password" type="password"><br/>
        
        <label>PW Confirm</label>
        <input name="passwordConfirm" type="password"><br/>

        <label>Name</label>
        <input name="name" type="text"><br/>
        
        <label>Birth</label>
        <input name="birth" type="date"><br/>

        <label>Phone</label>
        <input name="phone" type="tel"><br/>
        
        <label>Email</label>
        <input name="email" type="email"><br/>

        <label>NTRP</label>
        <input name="ntrp" type="number"><br>
        
        <button onclick="checkPWValidation();">JOIN</button>
    </form>

    <script>
        function checkPWValidation() {
            let password = document.getElementsByName("password");
            let confirm = document.getElementsByName("passwordConfirm");

            return (password === confirm);
        }
    </script>
</body>
</html>