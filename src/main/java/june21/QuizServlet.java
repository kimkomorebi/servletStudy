package june21;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/QuizServlet")
public class QuizServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public QuizServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Saito saito = new Saito();
		Suzuki suzuki = new Suzuki();
		saito.lift();
		suzuki.lift();
		Boss boss = new Boss();
		boss.pandan(saito.weight, suzuki.weight);
		Genzo genzo = new Genzo();
		genzo.pandan(suzuki.weight, saito.weight);
		Danaka danaka = new Danaka();
		danaka.whakin(boss.result, genzo.result);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
}
class Danaka {
	Danaka(){}
	void whakin(int boss, int genzo) {
		//관장의 결과, 겐조의 결과
		if(boss == genzo) {
			System.out.println("관장과 겐조의 판단이 일치합니다.");
		}else {
			System.out.println("관장과 겐조의 판단이 다릅니다.");
		}
	}
}
class Genzo {
	Genzo(){}
	int result = 0;//0 : 무승부, 1 : 사이토 승, 2 : 스즈키 승
	void pandan(double suzuki, double saito) {
		if(saito == suzuki) {
			System.out.println("무승부,"+saito+", "+suzuki);
			result = 0;
		}else if(saito > suzuki) {
			System.out.println("사이토 승,"+saito+", "+suzuki);
			result = 1;
		}else {
			System.out.println("스즈키 승,"+saito+", "+suzuki);
			result = 2;
		}
	}
}
class Boss {
	Boss(){}
	int result = 0;//0 : 무승부, 1 : 사이토 승, 2 : 스즈키 승
	void pandan(double saito, double suzuki) {
		//사이토의 기록, 스즈키의 기록
		if(saito == suzuki) { // 무승부
			System.out.println("무승부,"+saito+", "+suzuki);
			result = 0;
		}else if(saito > suzuki) { //사이토 승
			System.out.println("사이토 승,"+saito+", "+suzuki);
			result = 1;
		}else { //스즈키 승
			System.out.println("스즈키 승,"+saito+", "+suzuki);
			result = 2;
		}
	}
}
class Saito {
	Saito(){}
	double weight = 0;
	void lift() {
		weight = (int)(Math.random()*801 + 800) /10;
	}
}
class Suzuki {
	Suzuki(){}
	double weight = 0;
	void lift() {
		weight = (int)(Math.random()*801 + 800) /10;
	}
}