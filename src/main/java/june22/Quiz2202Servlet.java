package june22;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Quiz2202Servlet")
public class Quiz2202Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Quiz2202Servlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		JavaMotors motors = new JavaMotors();
		motors.hong.makeSum(motors.sedan.price, motors.truck.price, motors.rv.price);
		motors.sajang.makeSumTax(motors.sedan.price, motors.truck.price, motors.rv.price);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
}
//�ڹ� ���ͽ�, ����, Ʈ�� RV -> ���� ����
//��� 2�� ȫ�浿, ���浿
//ȫ�浿�� ��� ������ ������ �� ���
//�ڹٸ��ͽ��� ������ ȫ�浿 ����� ����� ������ �տ� 10% �ΰ����� �߰��ؼ� ����մϴ�.

class JavaMotors {
	JavaMotors(){}
	Sajang sajang = new Sajang();
	Hong hong = new Hong();
	Ow ow = new Ow();
	Sedan sedan = new Sedan();
	Truck truck = new Truck();
	RV rv = new RV();
}
class Sajang{
	Sajang(){}
	void makeSumTax(int s, int t, int r) {
		double sumTax = (s + t + r)*1.1 ;
		int sumTax2 =(int)sumTax;
		System.out.println("������ �ΰ����� ���ؼ� ���� ���� ������ �� : "+sumTax2+"����");
	}
}
class Hong{
	Hong(){}
	void makeSum(int s, int t, int r) {
		int sum = s + t + r;
		System.out.println("ȫ�浿�� ���� ���� ������ �� : "+sum+"����");
	}
}
class Ow{
	Ow(){}
}
class Sedan{
	Sedan(){}
	int price = (int)(Math.random()*901 + 100);
}
class Truck{
	Truck(){}
	int price = (int)(Math.random()*901 + 100);
}
class RV{
	RV(){}
	int price = (int)(Math.random()*901 + 100);
}