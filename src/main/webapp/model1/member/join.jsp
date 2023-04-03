<%@page import="model.MemberDao"%>
<%@page import="model.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%--/jspstudy1/src/main/webapp/model1/member/join.jsp 
    	1. 파라미터 정보를 Member객체에 저장
    	2. Member객체를 이용하여 DB에 insert(member 테이블) 저장
    	3. 가입성공 : loginForm.jsp 페이지 이동
    	   가입실패 : joinForm.jsp 페이지 이동
    --%>
<%
	//1번
	request.setCharacterEncoding("UTF-8"); //한글 인코딩 파라미터 조회전 제일먼저 실행
	Member mem = new Member();
	mem.setId(request.getParameter("id"));
	mem.setPass(request.getParameter("pass"));
	mem.setName(request.getParameter("name"));
	mem.setGender(Integer.parseInt(request.getParameter("gender")));
	mem.setTel(request.getParameter("tel"));
	mem.setEmail(request.getParameter("email"));
	mem.setPicture(request.getParameter("picture"));
	//2번
	MemberDao dao = new MemberDao();
	String msg = "회원가입실패";
	String url = "joinForm.jsp";
	//mem : 회원가입 정보 저장하고있는 Member 객체
	if(dao.insert(mem)){
		msg = "회원가입 성공";
		url = "loginForm.jsp";
	} 
%>
<%-- 3번 --%>
<script type="text/javascript">
	alert("<%=msg%>");
	location.href="<%=url%>";
</script>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>join.jsp</title>
</head>
<body>

</body>
</html>