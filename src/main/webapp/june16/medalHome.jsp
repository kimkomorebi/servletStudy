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
				alert("������ �����ؾ� �մϴ�!");
				return false;
			}
			var cf = confirm("�Է��Ͻ� ������ �ùٸ��ϱ�?");
			if( !cf ) return false;
			else return true;
		}
	</script>
	<div align="center">
		<h2>�ø��� �޴� ���� ���</h2>
		<h3>���Ͻô� ���� �����ϰ�, ��ư�� ��������.</h3>
		<form action="medalFind.do" name="fm" onSubmit="return check()" >
			�� �� �� �� : 
			<select name="NATION">
				<option>--���� �����ϼ���--</option>
				<option value="K">���ѹα�</option>
				<option value="J">�� ��</option>
				<option value="C">�� ��</option>
				<option value="T">�� ��</option>
			</select><br/><br/>
			<input type="submit" value="���� ����" class="btn"/>
			<input type="reset" value="�� ��" class="btn"/>
		</form>
	</div>
</body>
</html>