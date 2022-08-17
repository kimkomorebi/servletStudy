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
//자바 모터스, 세단, 트럭 RV -> 가격 난수
//사원 2명 홍길동, 오길동
//홍길동이 모든 차량의 가격의 합 출력
//자바모터스의 사장이 홍길동 사원이 계산한 가격의 합에 10% 부가세를 추가해서 출력합니다.

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
		System.out.println("사장이 부가세를 더해서 구한 차량 가격의 합 : "+sumTax2+"만원");
	}
}
class Hong{
	Hong(){}
	void makeSum(int s, int t, int r) {
		int sum = s + t + r;
		System.out.println("홍길동이 구한 차량 가격의 합 : "+sum+"만원");
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