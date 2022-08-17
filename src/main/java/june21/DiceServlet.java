package june21;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DiceServlet")
public class DiceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public DiceServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Chulsu c = new Chulsu();
		Youngheee y = new Youngheee();
		c.rollDice(); y.rollDice();
		//1. ���� ���и� �Ǵ��Ѵ�.
		y.pandan(c.result);
		c.pandan(y.result);
		//3. �μ��� ���и� �Ǵ��Ѵ�.
		Minsu m = new Minsu();
		m.winner(c.result, y.result);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
}

class Chulsu {
	Chulsu(){}
	int result = 0; // �ֻ��� ����� ����Ǵ� ����(�ν��Ͻ�)
	void rollDice() {
		result = (int)(Math.random()*6 + 1);
	}//�ֻ��� ���� (����-->�޼���� ����)
	void pandan(int youngheee) {
		//ö���� ���, ������ ���
		if(result == youngheee) {//���º�
			System.out.println("���º�,"+result+","+youngheee);
		}else if(result > youngheee) {//ö�� ��
			System.out.println("ö�� ��,"+result+","+youngheee);
		}else { //���� ��
			System.out.println("���� ��,"+result+","+youngheee);
		}
	}
}
class Youngheee {
	Youngheee(){}
	int result = 0; // �ֻ��� ����� ����Ǵ� ����(�ν��Ͻ�)
	void rollDice() {
		result = (int)(Math.random()*6 + 1);
	}//�ֻ��� ���� (����-->�޼���� ����)
	void pandan(int chulsu) {
		if(result == chulsu) {
			System.out.println("���º�,"+result+"," +chulsu);
		}else if(result > chulsu) {
			System.out.println("���� ��,"+result+"," +chulsu);
		}else {
			System.out.println("ö�� ��,"+result+"," +chulsu);
		}
	}
}
class Minsu {
	Minsu(){}
	void winner(int chulsu, int youngheee) {
		//ö���� ���, ������ ���
		if(chulsu == youngheee) {
			System.out.println("���º�,"+chulsu+","+youngheee);
		}else if(chulsu > youngheee) {
			System.out.println("ö�� ��,"+chulsu+","+youngheee);
		}else {
			System.out.println("���� ��,"+chulsu+","+youngheee);
		}
	}
}