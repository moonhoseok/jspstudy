<%@page import="model.MemberDao"%>
<%@page import="model.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%--/jspstudy1/src/main/webapp/model1/member/delete.jsp 
    	1. 파라미터 정보 저장
    	2. 로그인정보 검증
    		- 로그아웃상태 : 로그인하세요 메세지 출력 후 loginForm.jsp로 이동
    		- 다른사람탈퇴(관리자제외) : 본인만 탈퇴 가능 메세지 출력 후 main.jsp로 이동
    	3. 관리자 탈퇴는 불가능
    		-관리자정보 탈퇴 : 관리자는 탈퇴불가. list.jsp로 이동
    	4. 비밀번호 검증
    		로그인 정보로 비밀번호 검증
    		- 비밀번호 불일치 : 비밀번호 오류 메세지 출력 후 deleteForm.jsp로 페이지 이동
    	5. DB에서 delete실행
    		- boolean MemberDao.delete(id)
    		- 탈퇴성공 : 
    			- 일반사용자 : 로그아웃 실행. 탈퇴완료 메세지 출력 후 loginForm.jsp로 이동
    			- 관리자	: 탈퇴완료 메세지 출력 후 list.jsp로 이동
    		- 탈퇴실패 : 
    			- 일반사용자 : 탈퇴실패 메세지 출력 후 info.jsp로 이동
    			- 관리자	: 탈퇴실패 메세지 출력 후 list.jsp로 이동 
    --%>
<%
	
	//1
	String id = request.getParameter("id");
	String pass = request.getParameter("pass");
	//2
	String login = (String)session.getAttribute("login");
	String msg = null;
	String url = null;
	if(login == null){
		msg = "로그인하세요";
		url = "loginForm.jsp";
	} else if(!id.equals(login)&&!login.equals("admin")){
		msg = "본인만 탈퇴가능합니다.";
		url = "main.jsp";
	} else if(id.equals("admin")){
		msg = "관리자는 탈퇴 불가능 합니다..";
		url = "list.jsp";
	} else{//탈퇴가능
		// 비밀번호 검증
		MemberDao dao = new MemberDao();
		Member dbMem = dao.selectOne(login); //로그인한 사용자의 정보
		// pass : 입력된 비밀번호, 
		// dbMem.getPass() : DB에 등록된 비밀번호
		if(pass.equals(dbMem.getPass())){//비밀번호 일치
			if(dao.delete(id)){ //탈퇴 성공
				msg=id+"고객님 탈퇴성공";
				if(login.equals("admin")){ // 관리자
					url = "list.jsp";	
				}else{   					// 일반사용자
					session.invalidate(); //로그아웃
					url = "loginForm.jsp";
				}
			}else{//탈퇴 실패
				msg=id+"고객님 탈퇴실패";
				if(login.equals("admin")){ //관리자
					url = "list.jsp";	
				}else{						//일반사용자
					session.invalidate();
					url = "info.jsp?id="+id;
				}
			}
		}else{//비밀번호 오류
			msg = "비밀번호가 다릅니다.";
			url = "deleteForm.jsp?id="+id;
		}	
	}
%>
<script>
	alert("<%=msg%>");
	location.href = "<%=url%>";
</script>
<!DOCTYPE html>
<html> 
<head>
<meta charset="UTF-8">
<title>회원탈퇴</title>
</head>
<body>

</body>
</html>
