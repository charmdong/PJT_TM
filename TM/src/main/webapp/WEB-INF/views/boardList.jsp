<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="root" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Match Post</title>
</head>
<body>
    <h1>Board List</h1>

    <table>
        <thead>
            <th>
                <td>번호</td>
                <td>제목</td>
                <td>작성자</td>
                <td>작성 날짜</td>
                <td>매칭 상태</td>
            </th>
        </thead>
        <tbody>
            <c:forEach var="matchPost" items="${matchPostList}">
                <tr onclick="location.href='${root}/matchPost/detail.do?post_no=${matchPost.post_no}'">
                    <td>${matchPost.post_no}</td>
                    <td>${matchPost.title}</td>
                    <td>${matchPost.reg_id}</td>
                    <td>${matchPost.reg_date}</td>
                    <td>${matchPost.matching_completed}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>