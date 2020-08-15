<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="root" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html lang="en">

<head>
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
        <button type="submit">수정</button>
        <button location.href='${root}/user/mypage.do'">확인</button>
    </form>
</body>

</html>