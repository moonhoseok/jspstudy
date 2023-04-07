<%@page import="model.MemberDao"%>
<%@page import="model.Member"%>
<%@page import="javax.print.attribute.HashPrintRequestAttributeSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	String id = request.getParameter("id");
	MemberDao dao = new MemberDao();
	Member m = dao.selectOne(id);
	String msg = "아이디 사용 가능 합니당.";
	String myid="";
	if(m==null){
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>중복검사</title>
<link rel="stylesheet" href="css/main.css">
<script type="text/javascript">
	function idsend(id){
		opener.document.f.id.value=id;
		self.close();
	}
	function getid(){
		my.n.value = opener.window.document.getElementById("id").value; 
		
	}
	
</script>
</head>
<body>
<form name="my">
<table>
  <tr><th>아이디</th>
	<td><input type="button" name="n" onclick="getid()"></td>
  </tr>
  <tr><td colspan="2">
     <input type="button" value="아이디사용" 
     		onclick="idsend('<%=myid%>')">
  </td>
  </tr>
</table>
</form>
</body>
</html>
<%}else {%>
<script>
	alert("<%=msg%>")
	location.href="joinForm.jsp"
</script>	
<%} %>






