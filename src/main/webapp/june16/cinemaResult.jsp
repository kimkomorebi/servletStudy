<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style type="text/css">
	table {width:50%; margin:0 auto;}
	h2 {border:1px solid #f00; padding:10px; background:aqua; }
	table tr td {padding:20px; font-size:18px; color:#fff; text-align:center; background:coral;}
	th { padding:20px; font-size:22px;}
</style>
</head>
<body>
	<div align="center">
		<h2>결과 장르별 추천</h2>
		<%
		String[] cinemaName = (String[])request.getAttribute("CN");
		String name = (String)request.getAttribute("GENRE");
		out.print("<table border='1'>");
		out.print("<tr><th colspan='2'>"+name+"</th></tr>");
		String genre = "";
		for(int cnt=0; cnt < cinemaName.length; cnt++){
			if( cnt == 0) genre = "1";
			else if( cnt == 1)  genre = "2";
			else if( cnt == 2)  genre = "3";
			else if( cnt == 3)  genre = "4";
			else if( cnt == 4)  genre = "5";
			out.print("<tr><td>"+genre+"</td>");
			out.print("<td>"+cinemaName[cnt]+"</td></tr>");
		}
		out.print("</table>");
	%>
	</div>
	
</body>
</html>