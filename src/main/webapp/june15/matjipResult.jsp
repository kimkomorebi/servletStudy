<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style type="text/css">
	div {border:1px solid blue; background:lightblue; padding:20px;}
	table {background:#fff;}
</style>
</head>
<body>
	<div align="center">
		<h2>추천된 맛집은 다음과 같습니다.</h2>
		<%
		String[] matjips = (String[])request.getAttribute("MATJIP");
		out.print("<table border='1'>");
		for(int i=0; i<matjips.length; i++){
			out.print("<tr><td>"+(i+1)+"</td>");
			out.print("<td>"+matjips[i]+"</td></tr>");
		}//배열의 길이만큼 반복
		out.print("</table>");
		%>
	</div>
	
</body>
</html>