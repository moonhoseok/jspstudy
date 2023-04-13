<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%--/jspstudy1/src/main/webapp/model1/member/joinForm.jsp --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<link rel="stylesheet" href="../../css/main.css">
<script type="text/javascript">
	function input_check(f){
		if(f.id.value.trim() ==""){
			alert("아이디를 입력하세요");
			f.id.focus();
			return false;
		}
		if(f.pass.value.trim() ==""){
			alert("비밀번호를 입력하세요");
			f.pass.focus();
			return false;
		}
		if(f.name.value.trim() ==""){
			alert("이름을 입력하세요");
			f.name.focus();
			return false;
		}
		return true;
		
	}
	function win_upload(){
		var op = "width=500, height=500, left=50, top=50";
		open("pictureForm.jsp","",op);
	}
	function win_open(page){
		let id= f.id.value;
		if(id==""){
			alert("아이디를 적어")
			f.id.focus();
		}else {
		let op = "width=350, height=350, left=50, top=150"
		open(page+".jsp?id="+id,"",op)
		}
	}

</script>
</head>
<body>
<form action="join.jsp" name="f" method="post" onsubmit="return input_check(this)">
	<%-- picture.jsp 페이지에서 업로드된 이미지 이름 --%>
	<input type="hidden" name="picture" value="">
	<table><tr><td rowspan="4" valign="bottom">
		<img src="" width="100" height="120" id="pic"><br>
		<font size="1"><a href="javascript:win_upload()">사진등록</a></font></td>
		<th>아이디</th><td><input type="text" name="id" ><br>
		<input type="button" value="중복확인" onclick="win_open('idchk')">
		</td></tr>
		<tr><th>비밀번호</th><td><input type="text" name="pass"></td></tr>
		<tr><th>이름</th><td><input type="text" name="name"></td></tr>
		<tr><th>성별</th>
			<td><input type="radio" name="gender" value="1" checked>남
				<input type="radio" name="gender" value="1" >여</td></tr>
		<tr><th>전화번호</th><td colspan="2"><input type="text" name="tel"></td></tr>
		<tr><th>이메일</th><td colspan="2"><input type="text" name="email"></td></tr>
		<tr><td colspan="3"><input type="submit" value="회원가입"></td></tr>
	</table>
</form>

</body>
</html>