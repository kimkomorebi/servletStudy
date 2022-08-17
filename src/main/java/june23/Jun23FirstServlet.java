package june23;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Jun23FirstServlet")
public class Jun23FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public Jun23FirstServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		JavaDepartmentStore jds = new JavaDepartmentStore();
		//1. 백화점의 가전매장의 TV가격
		System.out.println("TV 가격:"+jds.gm.tv.price);
		System.out.println("청바지 가격"+jds.um.j.price);
		Gobayasi go = new Gobayasi();
		go.buy(jds.gm.tv); // TV 구매
		go.buy(jds.um.j); //청바지 구매
		System.out.println("남은 용돈:"+go.poketMoney);
	}
}
class Gobayasi {
	Gobayasi(){}
	int poketMoney = 50000; //용돈
	//백화점의 가전 매장의 TV를 구매
	void buy(TV tv) {
		poketMoney = poketMoney - tv.price;
	}
	//백화점의 의류 매장의 청바지를 구매
	void buy(Jean j) {
		poketMoney = poketMoney - j.price;
	}
	//백화점의 과일 매장의 사과를 구매
	void buy(Apple a) {
		poketMoney = poketMoney - a.price;
	}
}//고바야시 

class JavaDepartmentStore {
	JavaDepartmentStore(){}
	GajeonMart gm = new GajeonMart();
	GualMart gam = new GualMart();
	UrueMart um = new UrueMart();
}//자바 백화점

class GajeonMart {
	GajeonMart(){}
	TV tv = new TV();
	Radio r = new Radio();
}//가전 매장

class TV {
	TV(){}
	int price = (int)(Math.random()*11 + 10);
}

class Radio {
	Radio(){}
	int price = (int)(Math.random()*11 + 10);
}

class GualMart {
	GualMart(){}
	Grape g = new Grape();
	Apple a = new Apple();
	
}//과일 매장

class Grape {
	Grape(){}
	int price = (int)(Math.random()*11 + 10);
}

class Apple {
	Apple(){}
	int price = (int)(Math.random()*11 + 10);
}

class UrueMart{
	UrueMart(){}
	Tshirt t = new Tshirt();
	Jean j = new Jean();
}//의류 매장

class Tshirt {
	Tshirt(){}
	int price = (int)(Math.random()*11 + 10);
}

class Jean {
	Jean(){}
	int price = (int)(Math.random()*11 + 10);
}



