<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="root" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>${pageTitle}</title>
</head>
<body>
    <h1 align="center">Board List</h1>

    <table align="center" style="text-align: center;">
        <thead>
            <tr>
                <th>번호</th>
                <th>제목</th>
                <th>작성자</th>
                <th>작성 날짜</th>
                <th>매칭 상태</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="matchPost" items="${matchPostList}">
                <tr class="boardList">
                    <td>${matchPost.post_no}</td>
                    <td onclick="location.href='${root}/matchPost/detail.do?post_no=${matchPost.post_no}'" onmouseover="this.style.cursor='pointer'">${matchPost.title}</td>
                    <td onclick="location.href='${root}/user/info.do?id=${matchPost.reg_id}'" onmouseover="this.style.cursor='pointer'">${matchPost.reg_id}</td>
                    <td>${matchPost.reg_date}</td>
                    <c:if test="${matchPost.matching_completed == false}">
                        <td style="color:chocolate;">진행 중...</td>
                    </c:if>
                    <c:if test="${matchPost.matching_completed != false}">
                        <td style="color:greenyellow;">매칭 완료</td>
                    </c:if>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <div class="buttonBox" align="center" style="margin-top:20px;">
        <c:if test="${id != null}">
            <button onclick="location.href='${root}/matchPost/registerForm.do'">게시글 작성</button>
        </c:if>
        <button onclick="location.href='${root}/'">HOME</button>
    </div>
</body>
</html>