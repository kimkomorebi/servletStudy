<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h2>국가별 메달 획득수는 다음과 같습니다.</h2>
		<%
			String[] medals = (String[])request.getAttribute("MEDALSCORE");
			String country = (String)request.getAttribute("COUNTRY");
			out.print("<h3>선택한 나라 : "+country+"</h3>");
			out.print("<table border='1'>");
			out.print("<tr><td>금메달</td><td>은메달</td><td>동메달</td></tr><tr>");
			for(int i = 0; i<medals.length; i++){
				out.print("<td>"+medals[i]+"</td>");
			}
			out.print("</tr></table>");
		%>
	</div>
</body>
</html>