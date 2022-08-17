package june22;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SolutionServlet")
public class SolutionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public SolutionServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Javamotors2 jMotors = new Javamotors2();
		jMotors.hong.makeSum(jMotors.sedan.price, jMotors.rv.price, jMotors.truck.price);
		jMotors.hong.makeSum2(jMotors);
		jMotors.ceo.addTax(jMotors.hong.sum);
		jMotors.ceo.addTax2(jMotors);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
}
class Javamotors2 {
	Javamotors2(){}
	CEO ceo = new CEO();
	Sedan2 sedan = new Sedan2();
	RV2 rv = new RV2();
	Truck2 truck = new Truck2();
	Ohgildong oh = new Ohgildong();
	Hongildong hong = new Hongildong();
}
class CEO {
	CEO(){}
	 void addTax(int sum) {
		 double tax = sum * 1.1;
		 System.out.println("총 금액(부가세포함) : "+ tax);
	 }
	 void addTax2(Javamotors2 motors) {
		 double tax = motors.hong.sum * 1.1;
		 System.out.println("총 금액(부가세 포함):" + tax);
	 }
}
class Ohgildong {
	Ohgildong(){}
}
class Hongildong {
	Hongildong(){}
	int sum = 0;
	void makeSum2(Javamotors2 motors) {
		sum = motors.sedan.price + motors.rv.price + motors.truck.price;
		System.out.println("차량 가격의 합 : "+ sum);
	}
	void makeSum(int s, int r, int t) {
		sum = s + r + t;
		System.out.println("차량 가격의 합 : "+ sum);
	}
}
class Sedan2 {
	Sedan2(){}
	int price = (int)(Math.random()*9001 + 1000);
}
class RV2 {
	RV2(){}
	int price = (int)(Math.random()*9001 + 1000);
}
class Truck2 {
	Truck2(){}
	int price = (int)(Math.random()*9001 + 1000);
}