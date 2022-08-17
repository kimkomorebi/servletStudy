<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<script type="text/javascript">
		function check(){
			if(document.frm.COLOR.selectedIndex == 0){
				alert("색을 선택해야 합니다.");
				return false;
			}
		}
	</script>
	<div align="center">
		<h2>맥주 추천 APP ver1.0</h2>
		<h3>맥주 추천 APP에 오신 것을 환영합니다. 원하는 색을 선택하고, 버튼을 누르면 해당 색의 맥주가 추천됩니다.</h3>
		<form action="beerSelect3.do" name="frm" onSubmit="return check()">
			색 선택 : <select name="COLOR">
				<option>--선택하세요--</option>
				<option value="DARK">어두운 색</option>
				<option value="LIGHT">밝은색</option>
				<option value="YELLOW">노란색</option>
				<option value="BROWN">갈색</option>
			</select><br/><br/>
			<input type="submit" value="선택 완료"/>
			<input type="reset" value="취 소"/>
		</form>
	</div>
</body>
</html>