package june20;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Study1Servlet
 */
@WebServlet("/Study1Servlet")
public class Study1Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Study1Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//��ü ���� �޼���
//		Marine m1 = new Marine();
//		Marine m2 = new Marine();
//		Hydra h1 = new Hydra();
//		System.out.print("ù ��° ������� ���� : " + h1.mana);
//		Hydra h2 = new Hydra();
//		m1.attackHydra(h1);
//		System.out.println("ù ��° ������� ���� : " + h1.mana);
//		h1.attackMarine(m1);
//		h1.attackMarine(m2);
//		System.out.println("ù ��° �Ӹ��� ����:" + m1.mana);
//		System.out.println("�� ��° �Ӹ��� ����:" + m2.mana);
		HunterMap hunter = new HunterMap();
		System.out.println(hunter.h1.mana);//���� �ޱ� �� ����
		hunter.m1.attack(hunter.h1);
		//������(hunter)�� �ִ� ù ��° �Ӹ��� ù ��° ����� ����
		System.out.println(hunter.h1.mana);//���� ���� �� ����
		System.out.println(hunter.h2.mana);//���� ���� �� ����
		hunter.h1.attackMarine(hunter.m1);
		hunter.h1.attackMarine(hunter.m2);
		System.out.println(hunter.m1.mana+","+hunter.m2.mana);
		hunter.m.recoveryMarine(hunter.m1);
		hunter.m.recoveryMarine(hunter.m2);
		System.out.println(hunter.m1.mana+","+hunter.m2.mana);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
class Medic {
	Medic(){}
	void recoveryMarine(Marine m) {
		m.mana = 100;
	}//�Ӹ��� ������ 100���� �ٲ۴�.
}
class HunterMap {
	HunterMap(){}
	Medic m = new Medic();
	Marine m1 = new Marine();
	Marine m2 = new Marine();
	Hydra h1 = new Hydra();
	Hydra h2 = new Hydra();
}
class Marine {
	Marine(){}
	int mana = 100;
	void sum(int a, int b) {
		//�� ���� ���� ���ϴ� �޼���
		int total = a+ b;
	}
	void attack(Hydra a){//����� �����ϴ� �޼���
		//���� ������� ������ 10 ���δ�.
		a.mana = a.mana - 10;
	}
	void attack(Zilet a){ //������ �����ϴ� �޼���
		//���� ������ ������ 10 ���δ�.
		a.mana = a.mana - 10;
	}
	void attack(Marine a){//�Ӹ��� �����ϴ� �޼���
		//���� �Ӹ��� ������ 10 ���δ�.
		a.mana = a.mana - 10;
	}
}
class Zilet {
	Zilet(){}
	int mana = 100;
}
class Hydra {
	Hydra(){}
	int mana = 100;
	void attackMarine(Marine m) {
		m.mana = m.mana -10;
	}//���� �Ӹ��� ������ 10 ���� ��Ų��.
}
