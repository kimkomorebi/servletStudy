package june20;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Jun20Quiz
 */
@WebServlet("/Jun20Quiz")
public class Jun20Quiz extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Jun20Quiz() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Saito sa = new Saito();
		sa.barbell();
		Suzuki su = new Suzuki();
		su.barbell();
		Genzo ge = new Genzo();
		ge.pandan(sa.weight, su.weight);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}
}
class Genzo{
	Genzo(){}
	void pandan(double saito, double suzuki) {
		if(saito == suzuki) {
			System.out.println("무승부- 사이토 점수:"+saito+",스즈키 점수:"+suzuki);
		}else if(saito > suzuki) {
			System.out.println("사이토 승 - 사이토 점수:"+saito+", 스즈키 점수:"+suzuki);
		}else {
			System.out.println("스즈키 승 - 사이토 점수:"+saito+", 스즈키 점수:"+suzuki);
		}
	}
}
class Saito{
	Saito(){}
	double weight = 0;
	void barbell() {
		weight = (int)(Math.random()*101 + 100);
	}
}
class Suzuki{
	Suzuki(){}
	double weight = 0;
	void barbell() {
		weight = (int)(Math.random()*101 + 100);
	}
}
