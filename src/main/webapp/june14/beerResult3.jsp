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
	String[] brands = (String[])request.getAttribute("BRANDS");
%>
<h3>추천 맥주1 : <%= brands[0] %>, 추천 맥주2 : <%= brands[1] %>, 추천 맥주3 : <%= brands[2] %></h3>
</body>
</html>