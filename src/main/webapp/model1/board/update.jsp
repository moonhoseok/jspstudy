<%@page import="model.BoardDao"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@page import="java.io.File"%>
<%@page import="model.Board"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--/jspstudy1/src/main/webapp/model1/board/update.jsp
	1. 파라미터정보들을 Board 객체 저장
	2. 비밀번호 검증
		비밀번호 오류 메세지 출력후 updateForm.jsp로 이동
	3. 수정
		첨부파일의 변경이 없는 경우 file2 파라미터의 내용을 다시 저장하기
		boolean BoardDao.update(Board)
			수정 성공 : info.jsp 로 이동
			수정 실패 : 수정실패메세지 출력 후 updateForm.jsp로 이동	
--%>
<%
 	Board b = new Board();

	String path = application.getRealPath("/")+"model1/board/file/";
	int size = 10*1024*1024;
	File f = new File(path);
	String login = (String)session.getAttribute("login");
	if(!f.exists())f.mkdirs();
	MultipartRequest multi = 
			new MultipartRequest(request, path, size, "utf-8");
	
	b.setNum(Integer.parseInt(multi.getParameter("num")));
	b.setWriter(multi.getParameter("writer"));
	b.setPass(multi.getParameter("pass"));
	b.setTitle(multi.getParameter("title"));
	b.setContent(multi.getParameter("content"));
	b.setFile1(multi.getParameter("file1"));
	if(b.getFile1()==null || b.getFile1().equals("")){
		b.setFile1(multi.getParameter("file2"));
	}
	//2. 비번검증
	BoardDao dao = new BoardDao();
	Board dbboard = dao.selectOne(b.getNum());
	String msg = "비밀번호틀림";
	String url = "updateForm.jsp?num="+b.getNum();
	if(b.getPass().equals(dbboard.getPass())){
		//3
		if(dao.update(b)){//db 수정
			url = "info.jsp?num="+b.getNum();
			response.sendRedirect(url);
		}else{
			msg = "게시물 수정 실패";		
		}
	}
%> 
<script type="text/javascript">
	alert("<%=msg%>");
	location.href = "<%=url%>";
</script>   
