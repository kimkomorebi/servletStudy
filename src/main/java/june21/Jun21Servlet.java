package june21;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Jun21Servlet")
public class Jun21Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Jun21Servlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Lemon l = new Lemon();
		Kiwi k = new Kiwi();
		System.out.println(l.price);
		System.out.println(k.price);
		FruitMart fm = new FruitMart();
		System.out.println(fm.l.price); // 과일 가게 안의 레몬 가격
		System.out.println(fm.k.price);// 과일 가게 안의 키위 가격
		if(l == fm.l) {
			System.out.println("같다.");
		}else {
			System.out.println("다르다.");
		}
		Bag bag = new Bag();
		System.out.println(bag.w.p.listPrice);
		//가방 안의 지갑 안의 지폐 안의 액면가 출력
		Paper p = new Paper();
		System.out.println(p.listPrice); 
		//지폐의 액면가 출력
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
}
//레몬의 가격은 200원입니다.
//키위의 가격은 500원입니다.
//
//레몬과 키위가 과일 가게 안에 있습니다.
//과일 가게 안에 있는 레몬과 키위의 가격을 출력합니다.
class FruitMart {
	FruitMart (){}
	Lemon l = new Lemon();
	Kiwi k = new Kiwi();
}//과일 가게
class Lemon {
	Lemon(){}
	int price = 200;
}
class Kiwi {
	Kiwi(){}
	int price =500;
}

//지폐가 있습니다. 액면가가 1000원입니다.
//지폐까 지갑 안 에 있습니다.
//지갑이 가방 안에 있습니다.
//문, 지갑 안의 가방 안의 지폐의 액면가를 출력합니다
class Bag {
	Bag(){}
	Wallet w = new Wallet();
}
class Wallet {
	Wallet(){}
	Paper p = new Paper();
}
class Paper{
	Paper(){}
	int listPrice = 1000;
}//지폐 객정