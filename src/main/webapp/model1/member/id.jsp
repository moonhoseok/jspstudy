<%@page import="model.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--/jspstudy1/src/main/webapp/model1/member/id.jsp 
	1. 파라미터 값 저장(email, tel)
	2. DB에서 두개의 파라미터를 이용하여 id값 리턴 해주는 함수 구현
		MemberDao.idSearch(email, tel)
	3. id검증
		-id 존재 : opener 윈도우에 id값 전달 .현재화면 닫기
		-id 없음 : id를 찾을 수 없습니다. 메세지 출력 후 현재화면을 idForm.jsp로 이동
--%>
<%
	request.setCharacterEncoding("utf-8");
	String email = request.getParameter("email");
	String tel = request.getParameter("tel");
	MemberDao dao = new MemberDao();
	String id = dao.idSearch(email,tel);
	if(id != null){ //id 찾은경우
	
%>
<script>
	opener.document.f.id.value="<%= id%>";
	self.close();
</script>
<%} else{// id가 없는 경우%>
<script type="text/javascript">
	alert("아이디를 찾을 수 없습니다.");
	location.href = "idForm.jsp";
</script>
<%} %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>아이디</title>
</head>
<body>

</body>
</html>