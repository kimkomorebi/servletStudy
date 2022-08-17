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
		//������ ���, ������ ���
		if(boss == genzo) {
			System.out.println("����� ������ �Ǵ��� ��ġ�մϴ�.");
		}else {
			System.out.println("����� ������ �Ǵ��� �ٸ��ϴ�.");
		}
	}
}
class Genzo {
	Genzo(){}
	int result = 0;//0 : ���º�, 1 : ������ ��, 2 : ����Ű ��
	void pandan(double suzuki, double saito) {
		if(saito == suzuki) {
			System.out.println("���º�,"+saito+", "+suzuki);
			result = 0;
		}else if(saito > suzuki) {
			System.out.println("������ ��,"+saito+", "+suzuki);
			result = 1;
		}else {
			System.out.println("����Ű ��,"+saito+", "+suzuki);
			result = 2;
		}
	}
}
class Boss {
	Boss(){}
	int result = 0;//0 : ���º�, 1 : ������ ��, 2 : ����Ű ��
	void pandan(double saito, double suzuki) {
		//�������� ���, ����Ű�� ���
		if(saito == suzuki) { // ���º�
			System.out.println("���º�,"+saito+", "+suzuki);
			result = 0;
		}else if(saito > suzuki) { //������ ��
			System.out.println("������ ��,"+saito+", "+suzuki);
			result = 1;
		}else { //����Ű ��
			System.out.println("����Ű ��,"+saito+", "+suzuki);
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