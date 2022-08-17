<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style type="text/css">
	h2 {border:1px solid blue; padding:10px; background:lightblue; }
	table tr td {padding:20px; font-size:20px; color:blue; text-align:center;}
	th { padding:20px;}
</style>
</head>
<body>
	<div align="center">
		<h2>메달 집계 결과</h2>
		<%
			int[] result = (int[])request.getAttribute("MEDALS");
			String name = (String)request.getAttribute("NATION");
			
			out.print("<table border='1'>");
			out.print("<tr><td colspan='2'>"+name+"</td></tr>");
			String msg = "";
			for(int cnt=0; cnt < result.length; cnt++){
				if(cnt == 0) msg = "금메달";
				else if(cnt == 1) msg = "은메달";
				else if(cnt == 2) msg = "동메달";
				out.print("<tr><th>"+msg+"</th>");
				out.print("<td>"+result[cnt]+"</td></tr>");
			}
			out.print("</table>");
		%>
	</div>
	<%
		
	%>
</body>
</html>