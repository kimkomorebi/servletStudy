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
	//String brand = request.getParameter("BEER");
	String brand = (String)request.getAttribute("BRAND");
%>
<h3>추천된 맥주 : <%= brand %></h3>
</body>
</html>