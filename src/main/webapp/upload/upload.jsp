<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@page import="java.io.File"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--/jspstudy1/src/main/webapp/upload/upload.jsp
	1. enctype ="multipart/form-data" 형식으로 요청됨
		=> request객체 사용 안됨. request 객체에 파라미터정보, 파일정보, 파일내용이 저장됨.
		=> cos.jar 파일의 설정된 MultipartRequest 객체 사용됨. 
 --%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파일업로드 결과</title>
</head>
<body>
<%
	//업로드 되는 실제 경로 : 웹어플리케이션폴더/upload폴더로 설정함
	String uploadPath = application.getRealPath("/")+"upload/";
	//업로드 가능한 파일의 최대 크기 설정
	int size = 10*1024*1024;
	File f = new File(uploadPath);
	// 업로드 폴더가 없으면 폴더생성.
	if(!f.exists())f.mkdirs();
	MultipartRequest multi = new MultipartRequest(request, uploadPath, size, "UTF-8");
	/*
		request : 요청정보, 파라미터, 파일정보, 파일내용
		uploadPath : 파일이 업로드 되는 폴더 경로
		size : 업로드 가능 최대사이즈
		UTF-8 : 파라미터 값 인코딩 코드
		=> MultipartRequest 객체생성시 업로드 완료
	*/
	String name = multi.getParameter("name");
	String title = multi.getParameter("title");
	String fname = multi.getFilesystemName("file1"); //파일이름
%>
업로드 위치 : <%=uploadPath %><br>
올린 사람 	:<%=name %><br>
제	목 : <%=title %><br>
파 	일 : <a href="<%=fname%>"><%=fname%></a><br>
<img src="<%=fname %>"> 
</body>
</html>