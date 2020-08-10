# PJT_TM
개인 혹은 클럽 대항 테니스 경기 매칭 및 전적 관리 웹 사이트 제작

<h1> 게시글 TODO </h1>
<p>1. 로그인 한 사용자만 게시글 작성 가능<br/>
2. 수정 및 삭제 기능은 작성자 + 관리자에 한함 (USER 테이블에 isAdmin 컬럼)<br/>
3. 게시글 작성시, 경기 날짜는 작성 일자보다 앞설 수 없음 - 유효성 검사<br/>
4. 게시글마다 신청 관련 정보 관리 테이블 생성
</p>

<!-- 8월 2주차 -->
<table>
        <thead>
            <tr>
                <th>8월 2주차</th>
                <th>TODO LIST</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>08/10 MON</td>
                <td>
                    1. 게시글 관련 신청글 관리 테이블 생성
                </td>
            </tr>
            <tr>
                <td>08/11 TUE</td>
                <td>
                    1. 신청 버튼 - 모달 사용
                </td>
            </tr>
            <tr>
                <td>08/12 WED</td>
                <td></td>
            </tr>
            <tr>
                <td>08/13 THU</td>
                <td></td>
            </tr>
            <tr>
                <td>08/14 FRI</td>
                <td></td>
            </tr>
            <tr>
                <td>08/15 SAT</td>
                <td></td>
            </tr>
            <tr>
                <td>08/16 SUN</td>
                <td></td>
            </tr>
            <tr>
                <td>TODO</td>
                <td></td>
            </tr>
        </tbody>
    </table>
<!-- 8월 1주차 -->
<table>
  <thead>
    <tr>
      <td>8월 1주차</td>
      <td>TODO List</td>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>08/03 MON</td>
      <td>
        1. Service - evaluateUser 구현<br/>
        2. evaluateUser에 따른 des_user의 평점 계산을 위한 trigger 설정
      </td>
    </tr>
    <tr>
      <td>08/04 TUE</td>
      <td>
        1. Club, Court CRUD 구현<br/>
        2. DAO, Service, Controller 구현
      </td>
    </tr>
    <tr>
      <td>08/05 WED</td>
      <td>
        1. updateClub, deleteClub 
      </td>
    </tr>
    <tr>
      <td>08/06 THU</td>
      <td>
        1. 
      </td>
    </tr>
    <tr>
      <td>08/07 FRI</td>
      <td>
        1. 
      </td>
    </tr>
    <tr>
      <td>08/08 SAT</td>
      <td>
        1. DB서버, Application서버 timezone 일치화<br/>
        2. trigger 테스트<br/>
        3. 전체적인 설계도 작성<br/>
        4. 화면 개발 - club
      </td>
    </tr>
    <tr>
      <td>08/09 SUN</td>
      <td>
        1. 
      </td>
    </tr>
    <tr>
      <td>TODO</td>
      <td>
        1. User -> address 추가<br/>
        2. 회원가입시 우편번호 찾기 -> 카카오 open API<br/>
        3. Filter 적용 여부<br/>
        4. 각 테이블 pk, contraint 정리<br/>
        5. 전체 설계도 작성
      </td>
    </tr>
  </tbody>
</table>

<!-- 7월 4주차 -->
<table>
  <thead>
    <tr>
      <td>7월 4주차</td>
      <td>TODO List</td>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>07/27 MON</td>
      <td>
        1. TABLE DATE type to DATETIME<br/>
        2. main, login page - jsp<br/>
        3. Controller 구현
      </td>
    </tr>
    <tr>
      <td>07/28 TUE</td>
      <td>
        1. login 기능 구현<br/>
        2. logout 기능 구현<br/>
        3. 회원가입 기능 구현
      </td>
    </tr>
    <tr>
      <td>07/29 WED</td>
      <td>
        1. 
      </td>
    </tr>
    <tr>
      <td>07/30 THU</td>
      <td>
        1. 회원 정보 수정 구현
      </td>
    </tr>
    <tr>
      <td>07/31 FRI</td>
      <td>
        1. successPage 구현(update, 게시글 올리기, etc)<br/>
        2. success, error 시 코드 및 메세지 정리
      </td>
    </tr>
    <tr>
      <td>08/01 SAT</td>
      <td>
        1. 회원 탈퇴, 회원 정보 조회 구현
      </td>
    </tr>
    <tr>
      <td>08/03 SUN</td>
      <td>
        1. info.jsp 구현
      </td>
    </tr>
    <tr>
      <td>TODO</td>
      <td>
        1. User -> address 추가<br/>
        2. 회원가입시 우편번호 찾기 -> 카카오 open API
      </td>
    </tr>
  </tbody>
</table>

<!-- 7월 3주차 -->
<table>
  <thead>
    <tr>
      <td>7월 3주차</td>
      <td>TODO List</td>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>07/20 MON</td>
      <td>
        1. PREFER_COURT, AUTH table 생성
      </td>
    </tr>
    <tr>
      <td>07/21 TUE</td>
      <td>
        1. Spring Boot Project 생성<br/>
        2. application.properties 설정
      </td>
    </tr>
    <tr>
      <td>07/22 WED</td>
      <td>
        1. DTO 생성
      </td>
    </tr>
    <tr>
      <td>07/23 THU</td>
      <td>
        1. MyBatis 설정<br/>
        2. *DAO 생성<br/>
        3. *DAO.xml 생성
      </td>
    </tr>
    <tr>
      <td>07/24 FRI</td>
      <td>
        1.
      </td>
    </tr>
    <tr>
      <td>07/25 SAT</td>
      <td>
        1. 공통 코드 테이블 생성
      </td>
    </tr>
    <tr>
      <td>07/26 SUN</td>
      <td>
        1. 공통 코드 테이블 생성<br/>
        2. MyBatis 설정<br/>
        3. DAO 및 .xml 생성
      </td>
    </tr>
  </tbody>
</table>
