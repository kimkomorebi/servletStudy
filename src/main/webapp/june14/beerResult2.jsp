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
	/* String name1 = request.getParameter("BR1");
	String name2 = request.getParameter("BR2");
	String name3 = request.getParameter("BR3"); */
	String[] names = (String[])request.getAttribute("BRS");
%>
<h3>추천된 맥주1:<%= names[0] %>, 추천된 맥주2:<%= names[1] %>, 추천된 맥주3:<%= names[2] %></h3>
</body>
</html>