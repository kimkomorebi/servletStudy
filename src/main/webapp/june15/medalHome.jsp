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
				alert("������ ������3");
				return false;
			}
			var confirmCheck = confirm("�����Ͻðڽ��ϱ�?");
			if( ! confirmCheck) return false;
		}
	</script>
	<div align="center">
		<h2>�ø��� �޴� Ȯ�� APP ver1.0</h2>
		<h3>������ �����ϰ� ��ư�� ������, �޴� ������ ��µ˴ϴ�.</h3>
		<form action="medalFind.do" name="FORM" onSubmit="return check()" method="get">
			���� : 
			<select name="COUNTRY">
				<option value="KOREA">--������ �������ּ���--</option>
				<option value="KOREA">���ѹα�</option>
				<option value="JAPAN">�Ϻ�</option>
				<option value="CHINA">�߱�</option>
				<option value="USA">�̱�</option>
			</select><br/><br/>
			<input type="submit" value="Ȯ ��"/>
			<input type="reset" value="�� ��"/>
		</form>
	</div>
</body>
</html>