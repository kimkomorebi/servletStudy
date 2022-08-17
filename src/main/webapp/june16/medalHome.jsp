<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style type="text/css">
	.btn {width:100px; height:50px; padding:10px; font-size:18px; color:#f00; text-align:center;}
	h2 {border:1px solid blue; padding:10px; background:lightblue; }
</style>
</head>
<body>
	<script type="text/javascript">
		function check(){
			if(document.fm.NATION.selectedIndex == 0){
				alert("국가를 선택해야 합니다!");
				return false;
			}
			var cf = confirm("입력하신 정보가 올바릅니까?");
			if( !cf ) return false;
			else return true;
		}
	</script>
	<div align="center">
		<h2>올림픽 메달 갯수 목록</h2>
		<h3>원하시는 나라를 선택하고, 버튼을 누르세요.</h3>
		<form action="medalFind.do" name="fm" onSubmit="return check()" >
			국 가 선 택 : 
			<select name="NATION">
				<option>--나라를 선택하세요--</option>
				<option value="K">대한민국</option>
				<option value="J">일 본</option>
				<option value="C">중 국</option>
				<option value="T">태 국</option>
			</select><br/><br/>
			<input type="submit" value="갯수 보기" class="btn"/>
			<input type="reset" value="취 소" class="btn"/>
		</form>
	</div>
</body>
</html>