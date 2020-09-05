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
    <title>회원 정보 조회</title>
</head>

<body>
    <form action="${root}/user/update.do" method="post">
        <table>
            <tbody>
                <tr>
                    <td>ID</td>
                    <td><input type="text" value="${user.id}" name="id" readonly></td>
                </tr>
                <c:if test="${user.id == id}">
                    <tr>
                        <td>Name</td>
                        <td><input type="text" value="${user.name}" name="name" readonly></td>
                    </tr>
                    <tr>
                        <td>Password</td>
                        <td><input type="password" value="${user.password}" name="password" readonly></td>
                        <td onclick="location.href='${root}/'">수정하기</td>
                    </tr>
                    <tr>
                        <td>Birth</td>
                        <td><input type="date" value="${user.birth}" name="birth"></td>
                    </tr>
                    <tr>
                        <td>Phone</td>
                        <td><input type="tel" value="${user.phone}" name="phone"></td>
                    </tr>
                    <tr>
                        <td>Email</td>
                        <td><input type="text" value="${user.email}" name="email"></td>
                    </tr>
                </c:if>
                <tr>
                    <td>Club</td>
                    <td><input type="text" value="${user.club_code}" name="club_code" readonly></td>
                    <td onclick="location.href='#'">search</td>
                </tr>
                <tr>
                    <td>NTRP</td>
                    <td><input type="text" value="${user.ntrp}" name="ntrp"></td>
                </tr>
                <tr>
                    <td>AVG Manner Score</td>
                    <td><input type="text" value="${user.avg_eval_grade}" name="avg_eval_grade" readonly></td>
                </tr>
            </tbody>
        </table>
        <div class="buttonBox">
            <c:if test="${user.id == id}">
                <button type="submit">수정</button>
                <button type="button" onclick="deleteConfirm();">회원 탈퇴</button>
            </c:if>
            <button type="button" onclick="history.back();">확인</button>
        </div>
    </form>

    <script>
        function deleteConfirm () {
            if(confirm("정말 회원 탈퇴를 하시겠습니까?")) {
                if(confirm("다시 한 번 생각해보시길 바랍니다. 정말로 탈퇴하시겠습니까?")) {
                    $.ajax({
                        type: 'delete',
                        url: '${root}/user/delete/${id}',
                        dataType: 'text',
                        success: function() {
                            alert("그동안 이용해 주셔서 감사합니다.");
                            document.location.href = "${root}/"
                        },
                        error: function() {
                            alert("회원 탈퇴 진행 중 오류가 발생했습니다.");
                        }
                    })
                }
            }
        }
    </script>
</body>

</html>