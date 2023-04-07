<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--/jspstudy1/src/main/webapp/model1/board/writeForm.jsp 
	1. writeForm.jsp :
		공지사항 게시물인 경우 관리자가 아닌경우 
		등록 못하도록 조건 설정하기
--%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판글쓰기</title>
<script>
	function inputcheck(){
		f=document.f;
		if(f.writer.value.trim() ==""){
			alert("글쓴이를 입력하세요.")
			f.writer.focus();
			return false;
		}
		if(f.pass.value.trim() ==""){
			alert("비밀번호를 입력하세요.")
			f.pass.focus();
			return false;
		}
		if(f.title.value.trim() ==""){
			alert("제목을 입력하세요.")
			f.title.focus();
			return false;
		}
		if(f.content.value.trim() ==""){
			alert("내용을 입력하세요.")
			f.content.focus();
			return false;
		}
		f.submit();// submit 발생=> form의 action페이지로 요청
	}
</script>
</head>
<body>
<%	
	String boardid = (String)session.getAttribute("boardid");
	if(boardid==null) boardid = "1";
	String login = (String)session.getAttribute("login");
	if(login == null){%>
		<script>
		alert("로그인하세요.")
		location.href="../member/loginForm.jsp"
		</script>
	<% }else if(boardid.equals("1") && !login.equals("admin")){%>
		<script>
		alert("관리자만가능합니당")
		location.href="../member/loginForm.jsp"
		</script>
		
	<%} %>
<form action="write.jsp" method="post"
		enctype="multipart/form-data" name="f">
<table><caption>게시판 글쓰기</caption>
	<tr><td>글쓴이</td><td><input type="text" name="writer"></td></tr>
	<tr><td>비밀번호</td><td><input type="password" name="pass"></td></tr>
	<tr><td>제목</td><td><input type="text" name="title"></td></tr>
	<tr><td>내용</td><td><textarea rows="15" name="content"></textarea></td></tr>
	<tr><td>첨부파일</td><td><input type="file" name="file1"></td></tr>
	<tr><td colspan="2">
		<a href="javascript:inputcheck()">[게시물등록]</a></td></tr>
</table>
</form>
</body>
</html>