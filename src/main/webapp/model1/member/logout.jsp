<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%--/jspstudy1/src/main/webapp/model1/member/logout.jsp
    	1. session의 로그인 정보 제거
    	//2. loginForm.jsp로 페이지 이동
    	2. 로그아웃 메세지 출력 후 loginForm.jsp로 페이지 이동
    --%>
<% 
	session.removeAttribute("login"); // login 속성정보 제거.
	session.invalidate(); // 새로운 session 객체로 변경.
//	response.sendRedirect("loginForm.jsp");
%>
<script>
	alert("로그아웃 되었습니다.");
	location.href="loginForm.jsp"
</script>