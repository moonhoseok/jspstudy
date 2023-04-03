<%@page import="model.Member"%>
<%@page import="model.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%--/jspstudy1/src/main/webapp/model1/member/login.jsp 
    	1. 파라미터 저장.
    	2. DB에서 id에 해당하는 정보를 읽어서 Member객체에 저장.
    	3. DB의 내용과 입력된 내용 비교.
    		- id 존재 유무 : 없는경우 :id 없음 메세지 출력, loginForm.jsp페이지로 이동
    		- 			: 있는경우 :
    		- pass 비교 : 
    				일치 : session에 로그인 등록. main.jsp페이지 이동
    				불일치 : 비밀번호 오류메세지 출력. loginForm.jsp페이지로 이동
    --%>
<% 
	//1번
	request.setCharacterEncoding("UTF-8");
	String id = request.getParameter("id");
	String pass = request.getParameter("pass");
	//2번
	// mem : id 값에 해당하는 정보를 DB의 member테이블에서 조회하여 DB에 대한 정보 저장
	Member mem = new MemberDao().selectOne(id);
	//3번 
	String msg = "아이디 오류";
	String url = "loginForm.jsp";
	if(mem != null){//아이디 존재
		//pass : 입력된 비밀번호  
		//mem.getPass() : DB에 저장된 비밀번호.
		if(pass.equals(mem.getPass())){//비밀번호 일치
			session.setAttribute("login", id); // 로그인 정보를 session에 저장
			msg = mem.getName()+"님이 로그인 했습니다.";
			url = "main.jsp";
		}else{ // 비밀번호 불일치
			msg = "비민번호가 오류";
		}
	}
%>
<<script type="text/javascript">
	alert("<%=msg%>")
	location.href="<%=url%>"
</script>