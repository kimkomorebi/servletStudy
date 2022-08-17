<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style type="text/css">
	table {border-collapse:collapse; text-align:center;}
</style>
</head>
<body>
	<script type="text/javascript">
		function check(){
			if(document.FORM.COUNTRY.selectedIndex == 0){
				alert("국가를 선택하3");
				return false;
			}
			var confirmCheck = confirm("선택하시겠습니까?");
			if( ! confirmCheck) return false;
		}
	</script>
	<div align="center">
		<h2>올림픽 메달 확인 APP ver1.0</h2>
		<h3>국가를 선택하고 버튼을 누르면, 메달 갯수가 출력됩니다.</h3>
		<form action="medalFind.do" name="FORM" onSubmit="return check()" method="get">
			국가 : 
			<select name="COUNTRY">
				<option value="KOREA">--국가를 선택해주세요--</option>
				<option value="KOREA">대한민국</option>
				<option value="JAPAN">일본</option>
				<option value="CHINA">중국</option>
				<option value="USA">미국</option>
			</select><br/><br/>
			<input type="submit" value="확 인"/>
			<input type="reset" value="취 소"/>
		</form>
	</div>
</body>
</html>