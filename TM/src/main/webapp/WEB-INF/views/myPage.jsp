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
    <title>Document</title>
</head>
<body>
    <ul>
        <li>
            <button onclick="location.href='${root}/user/info.do?id=${id}'">정보 수정</button>
        </li>
        <li>
            <button onclick="location.href='${root}/matchPost/searchMyPost.do?id=${id}'">내가 쓴 게시글</button>
        </li>
        <li>
            <button onclick="location.href='${root}/matchPost/searchMyApplyPost.do?id=${id}'">내가 신청한 게시글</button>
        </li>
    </ul>
</body>
</html>