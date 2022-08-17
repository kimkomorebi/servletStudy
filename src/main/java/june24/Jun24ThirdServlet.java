package june24;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Jun24ThirdServlet")
public class Jun24ThirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Jun24ThirdServlet() {
        super();
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(100); //정수
		System.out.println(3.14);//실수
		System.out.println('A');//문자하나
		System.out.println("KOREA");//문자열
		System.out.println(true);//불린
		MainBoard2 mb = new MainBoard2(50000);
		System.out.println(mb.price);
		NotebookComputer nc = new NotebookComputer();
		System.out.println("노트북 가격:"+nc.price);
		Himart2 himart = new Himart2();
		System.out.println(himart.nc.price);
		Hongildong2 h= new Hongildong2(500000);
		h.buy(himart);
		
	}
}
class Hongildong2 {
	Hongildong2(){}
	Hongildong2(int m){pocketMoney = m;}
	int pocketMoney;
	void buy(Himart2 himart) {
		pocketMoney = pocketMoney - himart.nc.price;
		System.out.println("잔액:"+pocketMoney);
	}
	
}
class Himart2 {
	Himart2(){}
	NotebookComputer nc = new NotebookComputer();
}
class NotebookComputer {
	NotebookComputer(){
		int partsPrice = cpu.price + board.price;
		System.out.println("파트 가격:"+partsPrice);
		price = (int)(partsPrice + partsPrice * 0.1); 
	}
	int price;
	CPU2 cpu = new CPU2(150000);
	MainBoard2 board = new MainBoard2(50000);
}
class CPU2 {
	CPU2(){}
	CPU2(int p){price = p;}
	int price;
}
class MainBoard2 {
	//MainBoard2(){}
	int price;
	MainBoard2(int a){
		price = a + sr.price + gc.price;
	}
	 SamsungRam2 sr = new  SamsungRam2(40000);
	 GraphicCard2 gc = new GraphicCard2(200000);
}
class SamsungRam2 {
	int price;
	SamsungRam2(){}
	SamsungRam2(int a){price = a;}
}
class GraphicCard2 {
	int price;
	GraphicCard2(){}
	GraphicCard2(int a){price = a;}
}