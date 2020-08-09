<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="root" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>게시글 작성</title>
</head>
<body>
    <h1>게시글 작성하기</h1>
    <form action="${root}/matchPost/insert.do" method="post">
        <label for="title">TITLE</label>
        <input type="text" name="title" placeholder="Input Title">
        <br/>
        <label for="match_date">MATCH_DATE</label>
        <input type="date" name="match_date">
        <br/>
        <!-- selectBox로 변경 -->
        <label for="match_type">MATCH_TYPE</label> 
        <input type="number" name="match_type">
        <br/>
        <label for="match_court_code">MATCH_COURT</label>
        <input type="number" name="match_court_code">
        <br/>
        <label for="descrpition">DESCRIPTION</label><br/>
        <textarea name="description" cols="30" rows="10"></textarea>
        <br/>
        <button type="submit">submit</button>
        <button type="reset">reset</button>
    </form>
</body>
</html>