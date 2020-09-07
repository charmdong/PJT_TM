<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="root" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html lang="en">
<head>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.0.0/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-modal/0.9.1/jquery.modal.min.js"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jquery-modal/0.9.1/jquery.modal.min.css" />

    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>index page</title>
</head>
<body>
    <h1 align="center">hello world</h1>
    <div align="center" class="buttonBox">
        <c:choose>
            <c:when test="${id eq null}">
                <button onclick="openModal('#login_modal');">login</button>
                <button onclick="openModal('#join_modal');">Join</button>
            </c:when>
            <c:otherwise>
                <button onclick="location.href='${root}/user/logout.do'">logout</button>
                <button onclick="location.href='${root}/user/mypage.do'">mypage</button>
            </c:otherwise>
        </c:choose>
        <button onclick="location.href='${root}/matchPost/search.do'">BoardList</button>
    </div>
    
    <div class="modal" id="login_modal" style="margin:0 auto;">
        <form action="${root}/user/login.do" method="post">
            <label for="id">ID</label>
            <input type="text" id="id" name="id"/>
            <br/>
            <label for="password">PW</label>
            <input type="password" id="password" name="password"/>
            <br/>
            <button type="submit">로그인</button>
            <button type="button" onclick="closeModal('#login_modal');">취소</button>
        </form>
    </div>

    <div class="modal" id="join_modal" style="margin:0 auto;">
        <form action="${root}/user/join.do" method="post">
            <label>ID</label>
            <input name="id" type="text"><br/>
    
            <label>PW</label>
            <input id="password" name="password" type="password"><br/>
            
            <label>PW Confirm</label>
            <input id="passwordConfirm" name=passwordConfirm" type="password"><br/>
    
            <label>Name</label>
            <input name="name" type="text"><br/>
            
            <label>Birth</label>
            <input name="birth" type="date"><br/>
    
            <label>Phone</label>
            <input name="phone" type="tel"><br/>
            
            <label>Email</label>
            <input name="email" type="email"><br/>
    
            <label>NTRP</label>
            <input name="ntrp"><br>
            
            <div align="center" class="buttonBox">
                <button onclick="checkPWValidation();">가입하기</button>
                <button type="button" onclick="closeModal('#join_modal');">취소</button>
                <button type="reset">초기화</button>
            </div>
        </form>
    </div>

    <script>
        function openModal(modal) {
            $(modal).show();
        };

        function closeModal(modal) {
            $(modal).hide();
        };

        function checkPWValidation() {
            return($('#password').val() == $('passwordConfirm').val());
        };
    </script>
</body>
</html>