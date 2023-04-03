<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%-- /jspstudy1/src/main/webapp/model1/member/main.jsp 
    	1. 로그인 여부 검증
    		로그인 상태 : 현재 화면
    		로그아웃상태 : 로그인이 필요한 화면입니다. 메세지 출력 후 loginForm.jsp로 페이지 이동
    --%>
<% 
// 로그인정보
	String login = (String)session.getAttribute("login");
	if(login != null){// 로그인 상태
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인화면</title>
</head>
<body>
<h3><%=login %>로 로그인 되었습니다.</h3>
<h3><a href="logout.jsp">로그아웃</a></h3>
<h3><a href="info.jsp?id=<%=login%>">회원정보보기</a></h3>
<% if(login.equals("admin")) {// 관리자 여부 확인 %> 
	<h3><a href="list.jsp">회원목록 보기</a></h3>
<% } %>
</body>
</html>
<%} //if 구문 끝 
else {%> <%--로그아웃 상태 --%>
<script>
	alert("로그인이 필요합니다.")
	location.href="loginForm.jsp"
</script>
<%}%>