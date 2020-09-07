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

    <style>
        #applyList tbody td {
            width: 100px;
            overflow: hidden;
        }
    </style>
</head>

<body>
    <div id="match_info">
        <label for="title">TITLE</label>
        <input type="text" value="${matchInfo.title}" readonly><br />

        <label for="reg_id">REG ID</label>
        <input type="text" value="${matchInfo.reg_id}" readonly>

        <label for="reg_date">REG_DATE</label>
        <input type="date" value="${matchInfo.reg_date}" readonly><br />

        <label for="match_date">MATCH_DATE</label>
        <input type="date" value="${matchInfo.match_date}" readonly><br />

        <label for="match_court_code">MATCH_COURT</label>
        <input type="text" value="${matchInfo.match_court_code}" readonly><br />

        <label for="match_type">MATCH_TYPE</label>
        <input type="text" value="${matchInfo.match_type}" readonly><br />

        <label for="matching_completed">MATCHING_STATUS</label>
        <input type="text" value="${matchInfo.matching_completed}" readonly><br />

        <label for="description">DESCRIPTION</label><br />
        <textarea name="description" cols="30" rows="10" readonly>${matchInfo.description}</textarea>
    </div>

    <div>
        <button onclick="location.href='${root}/matchPost/search.do'">LIST</button>
        
        <c:if test="${matchInfo.reg_id != id and id != null and isApplied == 0}">
            <button onclick="openModal('apply_modal');">경기 신청</button>
        </c:if>

        <c:if test="${isApplied == 1}">
            <button onclick="confirmCancel('${matchInfo.post_no}');">매칭 취소</button>
        </c:if>

        <c:if test="${id eq matchInfo.reg_id or isAdmin == true}">
            <button onclick="openModal('modify_modal');">수정</button>
            <button onclick="confirmDelete('${matchInfo.post_no}');">삭제</button>
            <button onclick="showApplyList('${matchInfo.post_no}');">신청 현황</button>
        </c:if>
    </div>

    <div id="applyList" style="display: none; margin-top:50px;">
        <table align="center" style="text-align: center;">
            <thead>
                <tr>
                    <th>번호</th>
                    <th>신청자</th>
                    <th>신청 날짜</th>
                    <th>내용</th>
                </tr>
            </thead>
            <tbody>
                
            </tbody>
        </table>
    </div>

    <div class="modal" id="apply_modal" style="margin:0 auto;">
        <form id="apply_modal_form" action="${root}/matchPost/insertApply.do" method="post" style="text-align: center;">
            <input type="text" name="post_no" value="${matchInfo.post_no}" hidden>
            <input type="text" name="apply_id" value="${id}" hidden>
            <label for="description">내용</label><br />
            <textarea name="description" id="description" cols="45" rows="15"></textarea><br />
            <input type="button" value="신청하기" onclick="confirmRegist();">
            <button type="button" onclick="closeModal('apply_modal');">close</button>
        </form>
    </div>

    <div class="modal" id="modify_modal" style="margin:0 auto;">
        <form action="${root}/matchPost/update.do" method="post" style="text-align: center;">
            <input type="text" name="post_no" value="${matchInfo.post_no}" hidden>

            <label for="title">TITLE</label>
            <input type="text" name="title" value="${matchInfo.title}">
    
            <input type="text" name="reg_id" value="${matchInfo.reg_id}" hidden>
    
            <input type="date" name="reg_date" value="${matchInfo.reg_date}" hidden><br />
    
            <label for="match_date">MATCH_DATE</label>
            <input type="date" name="match_date" value="${matchInfo.match_date}"><br />
    
            <label for="match_court_code">MATCH_COURT</label>
            <input type="text" name="match_court_code" value="${matchInfo.match_court_code}"><br />
    
            <label for="match_type">MATCH_TYPE</label>
            <input type="text" name="match_type" value="${matchInfo.match_type}"><br />
    
            <input type="text" name="matching_completed" value="${matchInfo.matching_completed}" hidden>
    
            <label for="description">DESCRIPTION</label><br />
            <textarea name="description" cols="30" rows="10">${matchInfo.description}</textarea>
            <br/>
            <button>수정하기</button>
            <button type="button" onclick="closeModal('modify_modal');">close</button>
        </form>
    </div>

    <script>
        openModal = function (modalId) {
            $("#" + modalId).show();
        };

        closeModal = function (modalId) {
            $("#" + modalId).hide();
            $("#" + modalId + " textarea").val("");
        };

        function confirmRegist() {
            if(confirm("신청하시겠습니까?")) {
                // $("#apply_modal_form").submit();

                $.ajax({
                    url: '${root}/matchPost/registApply',
                    contentType: 'application/json; charset=utf-8',
                    type: 'post',
                    dataType: 'text',
                    data: JSON.stringify({
                        post_no: '${matchInfo.post_no}',
                        apply_id: '${id}',
                        description: $('#description').val()
                    }),
                    success: function(response) {
                        console.dir(response);

                        alert("경기 매칭 신청이 완료되었습니다.");
                        location.reload();
                    },
                    error: function(response) {
                        console.dir(response);

                        alert("경기 매칭 신청 중 오류가 발생했습니다.");
                    }
                })
            } 
        }

        function confirmCancel(post_no) {
            if (confirm("정말 취소하시겠습니까?")) {
                // document.location.href = "${root}/matchPost/deleteApply.do?post_no=" + post_no + "&apply_id=${id}";
            
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
        }

        function confirmDelete(post_no) {
            if (confirm("정말 삭제하시겠습니까?")) {
                document.location.href='${root}/matchPost/delete.do?post_no=' + post_no;
            }
        }

        function showApplyList(post_no) {
            $.ajax({
                type: 'get',
                url : '${root}/matchPost/searchApplyList/' + post_no,
                dataType: 'text',
                success: function(response) {
                    response = JSON.parse(response);

                    for(var index = 0; index < response.length; index++) {
                        var tr = '<td>' + response[index].no + '</td>' +
                                    '<td>' + response[index].apply_id + '</td>' +
                                    '<td>' + response[index].apply_date + '</td>' +
                                    '<td>' + response[index].description + '</td>';
                        $('#applyList tbody').append('<tr>' + tr + '</tr>');
                    }

                    $('#applyList').show();
                },
                error: function(response) {
                    alert("신청 현황 조회 중 오류가 발생했습니다.");
                }
            })
        }
    </script>
</body>

</html>