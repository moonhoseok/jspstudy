<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%--
    	1. id파라미터 저장
    	2. 로그인 정보 검즘
    		- 로그아웃 상태 : 로그인하세요 메세지 출력. loginForm.jsp로 페이지 이동
    		- 관리자제외. 다른사용자 탈퇴 불가
    			본인만 탈퇴가능합니다. 메세지 출력 후.main.jsp로 이동
    	3. 화면 출력
   	--%>
<%
	String id = request.getParameter("id");
	String login = (String)session.getAttribute("login");
	if(login==null){%>
		<script>
			alert("로그인하세요")
			location.href="loginForm.jsp"
		</script>
<% }else if(!id.equals(login)&&!login.equals("admin")) {%>
	<script>
		alert("본인탈퇴만 가능합니다.")
		location.href="loginForm.jsp"
	</script>
<%}else{%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원탈퇴</title>
<link rel="stylesheet" href="../../css/main.css">
<script type="text/javascript">
	function inputcheck(f){
		if(f.pass.value.trim()==""){
			alert("비밀번호를 입력하세요")
			f.pass.focus();
			return false;
		}
	//	return true;
	}
</script>
</head>
<body>
<form action="delete.jsp" method="post" onsubmit="return inputcheck(this)">
	<input type="hidden" name="id" value="<%=id%>">
	<table><caption>회원비밀번호 입력</caption>
		<tr><th>비밀번호</th>
			<td><input type="password" name="pass"></td></tr>
		<tr><td colspan="2">
			<input type="submit" value="탈퇴하기"></td></tr>
	</table>
</form>
</body>
</html>
<%}%>