<%@page import="model.MemberDao"%>
<%@page import="model.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%--/jspstudy1/src/main/webapp/model1/member/info.jsp
    	1. id파라미터값을 조회.
    	2. 로그인 상태 검증
    	  - 로그아웃상태 : '로그인하세요' 메세지 출력 후 loginForm.jsp페이지 호출
    	  - 로그인 상태 
    	    - 다른 id 조회시(관리자 제외) : 
    	  	'내 정보 조회만 가능합니다.' 메세지 출력 후 main.jsp페이지 호출
    	3. DB에서 id에 해당하는 데이터 조회
    	4. 조회된 내용을 화면에 출력하기
     --%>
<%
	//1
	String id = request.getParameter("id");
	//2-1 : 로그아웃 상태 검증
	String login = (String)session.getAttribute("login");
	if(login == null){ //로그아웃 상태 %>
	<script>
		alert("로그인하세요")
		location.href="loginForm.jsp"
	</script>
<%} else if(!id.equals(login)&&!login.equals("admin")){ // 개인 로그인 상태%>
	<script>
		alert("내정보만 조회 가능합니다.")
		location.href="main.jsp"
	</script>
<%} else{ //관리자가 정상적으로 로그인 한 상태 
	//mem : id파라미터에 해당하는 DB에 저장된 회원정보.
	Member mem = new MemberDao().selectOne(id);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보 조회</title>
<link rel="stylesheet" href="../../css/main.css">
</head>
<body>
<table><caption>회원정보보기</caption>
<tr><td rowspan="6" width="30%">
<img src ="picture/<%=mem.getPicture()%>" width="200" height="210"></td>
<th width="20%">아이디</th><td><%=mem.getId() %></td></tr>
<tr><th>이름</th><td><%=mem.getName()%></td></tr>
<tr><th>성별</th><td><%=mem.getGender()==1?"남":"여"%></td></tr>
<tr><th>전화</th><td><%=mem.getTel()%></td></tr>
<tr><th>이메일</th><td><%=mem.getEmail()%></td></tr>
<tr><td colspan="2">
<a href="updateForm.jsp?id=<%=mem.getId()%>">수정</a>
<a href="deleteForm.jsp?id=<%=mem.getId()%>">탈퇴</a>
</td></tr>
</table>
</body>
</html>
<%} %>