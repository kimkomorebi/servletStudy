package june20;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Study2Servlet")
public class Study2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public Study2Servlet() {
        super();

    }

	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Gobayasi go = new Gobayasi();
		go.jump(); //고바야시가 넓이 뛰기를 함
		Danaka da = new Danaka();
		da.jump();//다나까가 넓이 뛰기를 함
		Simpan s = new Simpan();
		s.pandan(go.record, da.record);
	}
}
//객체 설계 문제1
//고바야시와 다나까가 있습니다.
//고바야시가 넓이 뛰기를 아직 안 했습니다. 기록이 0입니다.
//고바야시가 넓이 뛰기를 했습니다. 기록이 1.15m입니다.
//다나까가 넓이 뛰기를 했습니다. 기록이 1.21m입니다.
//심판이 고바야시와 다나까 중 더 많이 뛴 사람이 누군지 판단합니다.
//문제 2. 기록을 난수로 한다.
//고바야시가 넓이 뛰기를 했습니다. 기록이 1.15m ->난수입니다.
//다나까가 넓이 뛰기를 했습니다. 기록이 1.21m ->난수입니다.
//난수의 범위 : 100~200
//고바야시가 115 / 100 -> 1.15
//다나까 121 / 100 - >1.21
class Simpan {
	Simpan(){}
	void pandan(double gobayasi, double danaka) {
		if(gobayasi == danaka) {
			System.out.println("무승부:고"+gobayasi+",다:"+danaka);
		}else if(gobayasi > danaka) {
			System.out.println("고바야시 승 고:"+gobayasi+",다:"+danaka);
		}else {
			System.out.println("다나까 승 고:"+gobayasi+",다:"+danaka);
		}
	}//고바야시와 다나까의 기록을 비교해서 승패를 출력한다.
}
class Gobayasi {
	Gobayasi(){}
	double record = 0;
	void jump(){
		//record = 1.15;
		record = (int)(Math.random()*101 + 100); //100~200
	}
	//변수의 위치
	//1. 클래스 안 변수 --> 인스턴스(instance) 변수
	//								등록된 객체가 메모리에서 없어질 때 소멸된다.
	//* 등록된 객체가 언제 메모리에서 없어지나?
	//-> 개발자가 알 수 없다. 자바 컴파일러가 등록된 객체가
	// 사용되지 않은 상태로 일정시간 경과되면 자동으로 소멸시킨다.
	//2. 메서드 안 변수 --> 지역(local) 변수
	//								메서드가 끝나면 소멸되므로 데이터가 메서드 안에서만 유지
}
class Danaka {
	Danaka(){}
	double record = 0;
	void jump() {
		//record = 1.21;
		record = (int)(Math.random()*101 + 100); //100~200
	}
}
