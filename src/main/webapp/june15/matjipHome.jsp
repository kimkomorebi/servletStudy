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
			if(document.f.TOWN.selectedIndex == 0){
				alert("지역을 선택하세요.");
				return false;
			}
			var c = confirm("선택한 내용이 맞습니까?");
			if( ! c) return false;
			else return true;
		}
	</script>
	<div align="center">
		<h2>맛집 추천 APP ver1.0</h2>
		<h3>지역을 선택하고 버튼을 누르면, 맛집이 출력됩니다.</h3>
		<form action="matjipFind.do" name="f" onSubmit="return check()">
			지역 : 
				<select name="TOWN">
					<option>--지역을 선택하세요--</option>
					<option value="1">종로구</option>
					<option value="2">강서구</option>
					<option value="3">강남구</option>
					<option value="4">마포구</option>
				</select><br/><br/>
				<input type="submit" value="맛집 찾기"/>
				<input type="reset" value="취 소"/>
		</form>
	</div>
</body>
</html>