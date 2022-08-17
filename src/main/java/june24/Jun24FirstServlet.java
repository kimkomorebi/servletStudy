package june24;

import java.io.IOException;
import java.math.BigDecimal;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Jun24FirstServlet")
public class Jun24FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Jun24FirstServlet() {
        super();
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Adder adder = new Adder();
		System.out.println(adder.add(100, 200));
		System.out.println(adder.add(1, 1.1));
		System.out.println(adder.add(3.14, 2));
		System.out.println(adder.add(3.14, 3.14));
		BigDecimal n1 = new BigDecimal("3.14");
		BigDecimal n2 = new BigDecimal("2");
		System.out.println(n1.add(n2));
		System.out.println(n1.subtract(n2));
		System.out.println(n1.multiply(n2));
		System.out.println(n1.divide(n2));
	}
}
class Adder {
	Adder(){}
	void addaa(int a, int b) {
		int sum = a + b;
		System.out.println(sum);
	}
	//메서드의 오버로딩(overloading)
	// - 메서드의 이름을 동일하게 설정할 수 있다.
	// 조건 ) 1. 매개 변수의 갯수가 달라야 한다.
	// 조건 ) 2. 매개 변수의 갯수가 같은 경우, 데이터 타입이 달라야 한다.
	int add(int a, int b) {
		int sum = a + b;
		return sum;
	}//덧셈(int + int)
	double add(int a, double b) {
		double sum = a +b;
		return sum;
	}//덧셈(int + double)
	double add(double a, int b) {
		double sum = a + b;
		return sum;
	}//덧셈(double + int)
	double add(double a, double b) {
		double sum = a + b;
		return sum;
	}//덧셈(double + double)
}//덧셈을 처리하는 객체
