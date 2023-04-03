<%@page import="model.MemberDao"%>
<%@page import="model.DBConnection"%>
<%@page import="java.sql.Connection"%>
<%@page import="model.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--/jspstudy1/src/main/webapp/model1/member/update.jsp 
   	1. 모든파라미터를 Member 객체에 저장하기
   	2. 입력된 비밀번호와 DB에 저장된 비밀번 비교. 
   		관리자인 경우 관리자비밀번호로 비교 
   		불일치 : '비밀번호 오류' 메세지 출력 후 updateForm.jsp페이지로 이동
   	3. Member객체의 내용으로 DB를 수정하기
   		- 성공 : 회원정보 수정완료 메세지 출력 후 info.jsp페이지로 이동
   		- 실패 : 회원정보 수정실패 메세지 출력 후 updateForm.jsp로 페이지 이동
--%>
<%
	request.setCharacterEncoding("UTF-8");
//1
	Member mem = new Member();
	mem.setId(request.getParameter("id"));
	mem.setPass(request.getParameter("pass"));
	mem.setName(request.getParameter("name"));
	mem.setGender(Integer.parseInt(request.getParameter("gender")));
	mem.setTel(request.getParameter("tel"));
	mem.setEmail(request.getParameter("email"));
	mem.setPicture(request.getParameter("picture"));
//2
	String login = (String)session.getAttribute("login");
	MemberDao dao = new MemberDao();
	Member dbmem = dao.selectOne(login);
	String msg = "비민번호 오류";
	String url = "updateForm.jsp?id="+ mem.getId();
	//mem.getPass() : 입력된 비밀번호
	//dbmem.getPass() : 로그인된 아이디의 비밀번호.
	if(mem.getPass().equals(dbmem.getPass())){
		// mem : 입력된 데이터 저장
		if(dao.update(mem)){
			msg="회원정보 수정 성공";
			url ="info.jsp?id="+mem.getId();	
		}else{
			msg = "회원정보 수정 실패";
		}
	}
%>
<script>
	alert("<%=msg%>");
	location.href = "<%=url%>";
</script>