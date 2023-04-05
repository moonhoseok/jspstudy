<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--/jspstudy1/src/main/webapp/model1/board/writeForm.jsp --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판글쓰기</title>
<script>
	function inputcheck(){
		f=document.f;
		if(f.name.value.trim() ==""){
			alert("글쓴이를 입력하세요.")
			f.name.focus();
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
<form action="write.jsp" method="post"
		enctype="multipart/form-data" name="f">
<table><caption>게시판 글쓰기</caption>
	<tr><td>글쓴이</td><td><input type="text" name="name"></td></tr>
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