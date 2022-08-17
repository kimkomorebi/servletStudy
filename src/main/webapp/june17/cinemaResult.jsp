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
		<%
			String[] result = (String[])request.getAttribute("RESULT");
		out.print("<table border='1'>");
		for(int idx=0; idx < result.length; idx++){
			out.print("<tr><th>"+(idx+1)+"</th>");
			out.print("<td>"+result[idx]+"</td></tr>");
		}
		out.print("</table>");
		%>
	</div>
</body>
</html>