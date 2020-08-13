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
    <title>게시글 보기</title>
</head>
<body>
    <div id="match_info">
        <label for="title">TITLE</label>
        <input type="text" value="${matchInfo.title}" readonly><br/>

        <label for="reg_id">REG ID</label>
        <input type="text" value="${matchInfo.reg_id}" readonly>

        <label for="reg_date">REG_DATE</label>
        <input type="date" value="${matchInfo.reg_date}" readonly><br/>

        <label for="match_date">MATCH_DATE</label>
        <input type="date" value="${matchInfo.match_date}" readonly><br/>

        <label for="match_court_code">MATCH_COURT</label>
        <input type="text" value="${matchInfo.match_court_code}" readonly><br/>

        <label for="match_type">MATCH_TYPE</label>
        <input type="text" value="${matchInfo.match_type}" readonly><br/>

        <label for="matching_completed">MATCHING_STATUS</label>
        <input type="text" value="${matchInfo.matching_completed}" readonly><br/>

        <label for="description">DESCRIPTION</label><br/>
        <textarea name="description" cols="30" rows="10">${matchInfo.description}</textarea>
    </div>
    <button onclick="location.href='${root}/matchPost/search.do'">LIST</button>
    <button onclick="openModal();">경기 신청</button>

    <div class="modal" style="margin:0 auto;">
        <form action="${root}/matchPost/insertApply.do" method="post">
            <input type="text" name="post_no" value="${matchInfo.post_no}" hidden>
            <input type="text" name="apply_id" value="${id}" hidden>
            <label for="description">내용</label><br/>
            <textarea name="description" id="description" cols="40" rows="10"></textarea><br/>
            <button>신청하기</button>
        </form>
        <button onclick="closeModal();">close</button>
    </div>

    <script>
        openModal = function() {
            $(".modal").show();
        };

        closeModal = function() {
            $(".modal").hide();
            $("#description").val("");
        };
    </script>
</body>
</html>