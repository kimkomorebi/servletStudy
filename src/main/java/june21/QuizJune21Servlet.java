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
			System.out.println("�ֻ��� ���� �����ϴ�. ö�� : "+chulsoo+", ���� : "+younghee);
			result = 0; // ����
		}else if(chulsoo > younghee) {
			System.out.println("ö���� �ֻ��� ���� �� �����ϴ�. ö�� : "+chulsoo+", ���� : "+younghee);
			result = 1; //ö�� ��
		}else if(chulsoo < younghee) {
			System.out.println("������ �ֻ��� ���� �� �����ϴ�. ö�� : "+chulsoo+", ���� : "+younghee);
			result = 2; //���� ��
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
//			System.out.println("ö���� �����ϱ⿡ �ֻ��� ���� �����ϴ�.");
//		}else if(chulsoo > younghee) {
//			System.out.println("ö���� �����ϱ⿡ ö���� ���� �����ϴ�");
//		}else {
//			System.out.println("ö���� �����ϱ⿡ ������ ���� �����ϴ�.");
//		}
		switch(result) {
		case 0 : System.out.println("ö���� �����ϱ⿡ �ֻ��� ���� �����ϴ�."); break;
		case 1 : System.out.println("ö���� �����ϱ⿡ ö���� ���� �����ϴ�.");  break;
		case 2 : System.out.println("ö���� �����ϱ⿡ ������ ���� �����ϴ�."); break;
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
//			System.out.println("���� �����ϱ⿡ �ֻ��� ���� �����ϴ�.");
//		}else if(chulsoo > younghee) {
//			System.out.println("���� �����ϱ⿡ ö���� ���� �����ϴ�");
//		}else {
//			System.out.println("���� �����ϱ⿡ ������ ���� �����ϴ�.");
//		}
		switch(result) {
		case 0 : System.out.println("���� �����ϱ⿡ �ֻ��� ���� �����ϴ�."); break;
		case 1 : System.out.println("���� �����ϱ⿡ ö���� ���� �����ϴ�.");  break;
		case 2 : System.out.println("���� �����ϱ⿡ ������ ���� �����ϴ�."); break;
		}
	}
}