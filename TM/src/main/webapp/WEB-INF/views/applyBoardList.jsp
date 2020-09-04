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
    <title>신청 현황</title>
</head>
<body>
    <h1 align="center">Apply Board List</h1>

    <table align="center" style="text-align: center;">
        <thead>
            <tr>
                <th>번호</th>
                <th>제목</th>
                <th>작성자</th>
                <th>작성 날짜</th>
                <th>매칭 상태</th>
                <th>신청 취소</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="matchPost" items="${matchPostList}">
                <tr class="boardList">
                    <td>${matchPost.post_no}</td>
                    <td onclick="location.href='${root}/matchPost/detail.do?post_no=${matchPost.post_no}'" onmouseover="this.style.cursor='pointer'">${matchPost.title}</td>
                    <td onclick="location.href='${root}/user/info.do?id=${matchPost.reg_id}'" onmouseover="this.style.cursor='pointer'">${matchPost.reg_id}</td>
                    <td>${matchPost.reg_date}</td>
                    <td>${matchPost.matching_completed}</td>
                    <td>
                        <button onclick="confirmCancel('${matchPost.post_no}');">취소하기</button>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <div align="center" class="buttonBox" style="margin-top: 20px;">
        <button onclick="location.href='${root}/'">HOME</button>    
    </div>

    <script>
        function confirmCancel(post_no) {
            if(confirm("정말 취소 하시겠습니까?")) {
                $.ajax({
                    url: '${root}/matchPost/deleteApply/${id}/' + post_no,
                    type: 'delete',
                    dataType: 'text',
                    success: function(response) {
                        alert('경기 매칭이 취소되었습니다.');
                        location.reload();
                    },
                    error: function() {
                        alert('경기 매칭 취소 중 오류가 발생했습니다.');
                    }
                })    
            }
        };
    </script>
</body>
</html>