<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- /jspstudy1/src/main/webapp/model1/member/layout/layout.jsp
	1. jar-download.com
	2. sitemesh 검색
	3. jar_files.zip 다운로드 3.0
	4. sitemesh-3.0.1.jar 파일을 WEB-INF/lib 폴더에 복사
	<sitemesh:write property='title'/> :
		joinForm.jsp 페이지의 title태그의 내용을 적용
	<sitemesh:write property='head'/> :
		joinForm.jsp 페이지의 head태그의 내용을 적용. title 태그는 제외
	<sitemesh:write property='body'/> : 
		joinFor.jsp 페이지의 body태그의 내용을 적용.
--%>
<% String path = request.getContextPath(); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><sitemesh:write property='title'/></title>
<link rel="stylesheet" href="../../css/main.css">
<sitemesh:write property='head'/>
</head>
<body>
<table>
	<tr><td colspan="3" style="text-align:right;">
<%

	String login = (String)session.getAttribute("login");
	if(login == null){%>
	<a href="<%=path%>/model1/member/loginForm.jsp">로그인</a>
	<a href="<%=path%>/model1/member/joinForm.jsp">회원가입</a>
<%} else {%>
	<%=login%>님.<a href="<%=path%>/model1/member/logout.jsp">로그아웃</a>
  <%}%>
  	</td></tr>
<tr><td width="15%" valign="top">
	<a href="<%=path%>/model1/member/main.jsp">회원관리</a><br>
	<a href="<%=path%>/model1/board/list.jsp?boardid=1">공지사항</a><br>
	<a href="<%=path%>/model1/board/list.jsp?boardid=2">자유게시판</a><br>
	<a href="<%=path%>/model1/board/list.jsp?boardid=3">QnA</a><br>
</td>
<td colspan="2" style="text-align: left; vertical-align: top">
<sitemesh:write property='body'/></td></tr>
<tr><td colspan="3">구디아카데미</td></tr>
</table>
</body>
</html>