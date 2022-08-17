package june24;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Jun24SecondServlet")
public class Jun24SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Jun24SecondServlet() {
        super();
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Tiger t1 = new Tiger(); t1.name = "호돌이"; t1.age = 1;
		Tiger t2 = new Tiger(); t2.name = "호순이"; t2.age = 2;
		Tiger t3 = new Tiger("어흥이"); t3.age = 1;
		Tiger t4 = new Tiger(3); t4.name = "포돌이";
		Tiger t5 = new Tiger("포순이", 2);
		Tiger t6 = new Tiger(4, "포돌이");
		//고객 정보 등록(이름, 나이, 주소, 연락처,몸무게, 신장)
		Customer c1 = new Customer();
		c1.name = "홍길동"; c1.age = 23; c1.address = "서울";
		c1.phone = "01012342311"; c1.weight = 77.8;
		c1.height = 165.3;
		Customer c2 = new Customer("김길동", 32, "경기", "01099882342", 80.5, 172.8);
		Customer c3 = new Customer("오길동");
		Customer c4 = new Customer("구길동", 45);
	}
}
class Customer {
	Customer(){}//기본 생성자
	Customer(String a){name = a;}//이름만으로 고객을 등록
	Customer(String a, int b) {name = a; age = b;}//이름, 나이로 고객을 등록
	Customer(String a, int b, String c, String d, double e, double f) { //모든 정보를 위한 생성자
		name = a; age = b; address = c; phone = d; weight = e ;
		height = f;
	}
	String name; int age; String address; String phone;
	double weight; double height;
}
class Tiger {
	Tiger(){}//생성자 (constructor) : 객체를 등록할 때 사용하는 메서드
	Tiger(String a){name = a;}
	Tiger(int a){age = a;}
	Tiger(String a, int b){name = a; age = b;}
	Tiger(int a, String b){age = a; name = b;}
	//메서드의 오버로딩(overloading)
	String name; int age;
}