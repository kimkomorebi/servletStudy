<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
// 	String beer1 = request.getParameter("B1");
// 	String beer2 = request.getParameter("B2");
// 	String beer3 = request.getParameter("B3");
	String beer1 = (String)request.getAttribute("BR1");
	String beer2 = (String)request.getAttribute("BR2");
	String beer3 = (String)request.getAttribute("BR3");
	
%>
<h2>추천된 첫 번째 맥주 <%= beer1 %>, 두 번째 맥주 : <%= beer2 %>, 세 번째 맥주 : <%= beer3 %></h2>
</body>
</html>