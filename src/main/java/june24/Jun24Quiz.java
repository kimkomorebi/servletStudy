package june24;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Jun24Quiz")
public class Jun24Quiz extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Jun24Quiz() {
        super();
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HiMart hi = new HiMart();
		hi.laptop.ResultPrice(hi.laptop.parts);
		hi.h.buy(hi.laptop);	
		int money2 = (int)hi.h.money;
		System.out.println("이거"+money2);
	}
}
class HiMart {
	HiMart(){}
	Hongildong h = new Hongildong();
	Laptop laptop = new Laptop();
}
class Laptop {
	Laptop(){}
	Parts parts = new Parts(35000, 55000, 110000, 90000);
	double sum = 0;
	void ResultPrice(Parts parts) {
		sum = (parts.cpu+parts.mainboard+parts.samsumRam+parts.graphicCard) *1.1;
		System.out.println("부품 총 합계 가격:"+sum);
	}
}
class Parts {
	Parts(){}
	Parts(int price1, int price2, int price3, int price4){
		cpu = price1; mainboard = price2; samsumRam = price3;
		graphicCard = price4;
	}
	int cpu; int mainboard; int samsumRam; int graphicCard;
}
class CPU {
	CPU(){}
}
class MainBoard {
	MainBoard(){}
}
class SamsungRam {
	SamsungRam(){}
}
class GraphicCard {
	GraphicCard(){}
}
class Hongildong {
	Hongildong(){}
	double money = 500000;
	void buy(Laptop laptop) {
		money = money - laptop.sum;
		int money2 = (int)money;
		System.out.println(money2);
	}
}
