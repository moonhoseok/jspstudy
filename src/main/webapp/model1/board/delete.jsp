<%@page import="model.BoardDao"%>
<%@page import="model.Board"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--/jspstudy1/src/main/webapp/model1/board/delete.jsp
	
	1. num, pass 파라미터를 변수에 저장
	2. 비밀번호 검증
		틀린경우 : 비밀번호 오류 메시지 출력, deleteForm.jsp로 이동
	3. 해당게시물이 공지사항 게시물인 경우 관리자만 삭제가능
	4. 게시물 삭제
		boolean BoardDao.delete(num)
		삭제성공 : list.jsp 로 이동
		삭제실패 : 삭제실패 메시지 출력, info.jsp로이동
		
 --%>
 <%
 	int num = Integer.parseInt(request.getParameter("num"));
 	String pass = request.getParameter("pass");
 	String login =(String)session.getAttribute("login");
 	
 	BoardDao dao = new BoardDao();
 	Board b = dao.selectOne(num);
 	
 	String msg = "비밀번호가 틀렸습니다.";
 	String url = "deleteForm.jsp?num="+num;
 	
 	if(pass.equals(b.getPass()) ){
 		if(b.getBoardid().equals("1")&&
 				(login==null || !login.equals("admin"))){
 	 		msg = "관리자만 접근 가능합니다.";
 	 		url = "list.jsp?boardid="+b.getBoardid();
 	 	}else{
 			if(dao.delete(num)){
 				msg="삭제성공";
 				url="list.jsp?boardid="+b.getBoardid();
			}else{
 				msg="삭제실패";
 				url="deleteForm.jsp?num="+num;
 			}
 	 	}	
 	}
 %>
<script>
	alert("<%=msg%>")
	location.href = "<%=url%>"
</script>
