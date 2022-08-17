package june21;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/QuizJune21Servlet")
public class QuizJune21Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public QuizJune21Servlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Chulsoo chulsoo = new Chulsoo();
		Younghee younghee = new Younghee();
		chulsoo.dice();
		younghee.dice();
		Minsoo minsoo = new Minsoo();
		minsoo.pandan(chulsoo.number, younghee.number);
//		chulsoo.result(chulsoo.number, younghee.number);
//		younghee.result(chulsoo.number, younghee.number);
		chulsoo.result(minsoo.result);
		younghee.result(minsoo.result);
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
class Minsoo {
	Minsoo(){}
	int result = 0;
	void pandan(int chulsoo, int younghee) {
		if(chulsoo == younghee) {
			System.out.println("주사위 값이 같습니다. 철수 : "+chulsoo+", 영희 : "+younghee);
			result = 0; // 동점
		}else if(chulsoo > younghee) {
			System.out.println("철수의 주사위 값이 더 높습니다. 철수 : "+chulsoo+", 영희 : "+younghee);
			result = 1; //철수 승
		}else if(chulsoo < younghee) {
			System.out.println("영희의 주사위 값이 더 높습니다. 철수 : "+chulsoo+", 영희 : "+younghee);
			result = 2; //영희 승
		}
	}
}
class Chulsoo {
	Chulsoo(){}
	int number = 0;
	void dice() {
		number = (int)(Math.random()*6 +1);
	}
	void result(int result) {
//		if(chulsoo == younghee) {
//			System.out.println("철수가 생각하기에 주사위 값이 같습니다.");
//		}else if(chulsoo > younghee) {
//			System.out.println("철수가 생각하기에 철수의 값이 높습니다");
//		}else {
//			System.out.println("철수가 생각하기에 영희의 값이 높습니다.");
//		}
		switch(result) {
		case 0 : System.out.println("철수가 생각하기에 주사위 값이 같습니다."); break;
		case 1 : System.out.println("철수가 생각하기에 철수의 값이 높습니다.");  break;
		case 2 : System.out.println("철수가 생각하기에 영희의 값이 높습니다."); break;
		}
	}
	
}
class Younghee {
	Younghee(){}
	int number = 0;
	void dice() {
		number = (int)(Math.random()*6 +1);
	}
	void result(int result) {
//		if(chulsoo == younghee) {
//			System.out.println("영희가 생각하기에 주사위 값이 같습니다.");
//		}else if(chulsoo > younghee) {
//			System.out.println("영희가 생각하기에 철수의 값이 높습니다");
//		}else {
//			System.out.println("영희가 생각하기에 영희의 값이 높습니다.");
//		}
		switch(result) {
		case 0 : System.out.println("영희가 생각하기에 주사위 값이 같습니다."); break;
		case 1 : System.out.println("영희가 생각하기에 철수의 값이 높습니다.");  break;
		case 2 : System.out.println("영희가 생각하기에 영희의 값이 높습니다."); break;
		}
	}
}