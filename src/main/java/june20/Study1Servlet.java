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
		//객체 리턴 메서드
//		Marine m1 = new Marine();
//		Marine m2 = new Marine();
//		Hydra h1 = new Hydra();
//		System.out.print("첫 번째 히드라의 마나 : " + h1.mana);
//		Hydra h2 = new Hydra();
//		m1.attackHydra(h1);
//		System.out.println("첫 번째 히드라의 마나 : " + h1.mana);
//		h1.attackMarine(m1);
//		h1.attackMarine(m2);
//		System.out.println("첫 번째 머린의 마나:" + m1.mana);
//		System.out.println("두 번째 머린의 마나:" + m2.mana);
		HunterMap hunter = new HunterMap();
		System.out.println(hunter.h1.mana);//공격 받기 전 마나
		hunter.m1.attack(hunter.h1);
		//전쟁터(hunter)에 있는 첫 번째 머린이 첫 번째 히드라 공격
		System.out.println(hunter.h1.mana);//공격 받은 후 마나
		System.out.println(hunter.h2.mana);//공격 받은 후 마나
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
	}//머린의 마나를 100으로 바꾼다.
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
		//두 수의 합을 구하는 메서드
		int total = a+ b;
	}
	void attack(Hydra a){//히드라를 공격하는 메서드
		//상대방 히드라의 마나를 10 줄인다.
		a.mana = a.mana - 10;
	}
	void attack(Zilet a){ //질럿을 공격하는 메서드
		//상대방 질럿의 마나를 10 줄인다.
		a.mana = a.mana - 10;
	}
	void attack(Marine a){//머린을 공격하는 메서드
		//상대방 머린의 마나를 10 줄인다.
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
	}//상대방 머린의 마나를 10 감소 시킨다.
}
