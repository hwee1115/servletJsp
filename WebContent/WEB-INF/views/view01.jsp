<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
   
<%-- 템플릿 --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h5>view01.jsp</h5>
	</hr>
	<%-- 스크립트릿 --%>
	<%
	String name = "JSP";
	%>
	
	
	<%-- 표현식 --%>
	이름:<%=name%>
	
	<%-- 태그와 자바코드를 결합한 형태 --%>
	<%for(int i=0; i<5; i++){%>
		<h<%=i%>><%=name%></h<%=i%>>
	<%}%>
</body>
</html>