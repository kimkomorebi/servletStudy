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
		<h2>가입자 등록</h2>
		<form action="register" method="post" name="frm" onSubmit="return check(this)">
			이름 : <input type="text" name="NAME"/><br/>
			계정 : <input type="text" name="ID"/>
			<input type="button" value="중복검사" onClick="idCheck()"/><br/>
			주소 : <input type="text" name="ADDR"/><br/>
			연락처 : <input type="text" name="TEL"/><br/>
			암호 : <input type="password" name="PWD"/><br/>
			암호 확인 : <input type="password" name="CFM"/><br/>
			성별 : 남 <input type="radio" name="GENDER" value="M"/>,
			여 <input type="radio" name="GENDER" value="F"/><br/>
			이메일 : <input type="text" name="EMAIL"/><br/>
			직 업 : 
			<select name="JOB">
				<option>--선택하세요--</option>
				<option>회사원</option>
				<option>학생</option>
				<option>기타</option>
			</select><br/><br/>
			<input type="submit" value="등 록"/>
			<input type="reset" name="RESET" value="취 소"/>
		</form>
	</div>
	<script type="text/javascript">
		function check(f){
			if(f.NAME.value == '') {
				alert("이름을 입력하세요."); return false;
			}
			if(f.ID.value == ''){
				alert("계정을 입력하세요."); return false;
			}
			if(f.ADDR.value == ''){
				alert("주소를 입력하세요."); return false;
			}
			if(f.ADDR.value == ''){
				alert("연락처를 입력하세요"); return false;
			}
			if(f.PWD.value == ''){
				alert("암호를 입력하세요."); return false;
			}
			if(f.PWD.value != f.CFM.value){
				alert("암호가 일치하지 않습니다."); return false;
			}
			if(! f.GENDER[0].checked && ! f.GENDER[1].checked){
				alert("성별을 선택하세요."); return false;
			}
			if(f.JOB.selectedIndex < 1){
				alert("직업을 선택하세요."); return false;
			}
			if(confirm("정말로 가입하시겠습니까?")){
				return true;
			}else {
				return false;
			}
		}
	</script>
</body>
</html>