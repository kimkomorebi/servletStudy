package june22;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Quiz22Servlet")
public class Quiz22Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Quiz22Servlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		JavaFlowerShop shop = new JavaFlowerShop();
		shop.alba.makeSum(shop.j.price, shop.k.price, shop.b.price);
		shop.boss.makeSum(shop.j.price, shop.k.price, shop.b.price);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
}
class Boss {
	Boss(){}
	void makeSum(int j, int k, int b) {
		int sum = j + k + b;
		System.out.println("사장이 계산한 합:"+sum);
	}
}//꽃집의 사장 클래스
class Alba {
	Alba(){}
	void makeSum(int j, int k, int b) {
		int sum = j + k + b;
		System.out.println("알바생이 계산한 합:"+sum);
	}//꽃집의 꽃 가격의 합을 계산
}
class JavaFlowerShop{
	Boss boss = new Boss();
	Alba alba = new Alba();
	JavaFlowerShop(){}
	JangMi j = new JangMi(2500);
	KookWha k = new KookWha();
	BaekHap b = new BaekHap();
}
class JangMi {
	int price = (int)(Math.random()* 9001 + 1000);
	JangMi(){}
	JangMi(int a){price = a;}
	
	//등록된 class - > 객체 : instance
}
class KookWha{
	KookWha(){}
	int price = (int)(Math.random()* 9001 + 1000);
}
class BaekHap{
	BaekHap(){}
	int price = (int)(Math.random()* 9001 + 1000);
}