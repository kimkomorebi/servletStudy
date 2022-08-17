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
	//�޼����� �����ε�(overloading)
	// - �޼����� �̸��� �����ϰ� ������ �� �ִ�.
	// ���� ) 1. �Ű� ������ ������ �޶�� �Ѵ�.
	// ���� ) 2. �Ű� ������ ������ ���� ���, ������ Ÿ���� �޶�� �Ѵ�.
	int add(int a, int b) {
		int sum = a + b;
		return sum;
	}//����(int + int)
	double add(int a, double b) {
		double sum = a +b;
		return sum;
	}//����(int + double)
	double add(double a, int b) {
		double sum = a + b;
		return sum;
	}//����(double + int)
	double add(double a, double b) {
		double sum = a + b;
		return sum;
	}//����(double + double)
}//������ ó���ϴ� ��ü
