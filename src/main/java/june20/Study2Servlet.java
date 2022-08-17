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
		go.jump(); //��پ߽ð� ���� �ٱ⸦ ��
		Danaka da = new Danaka();
		da.jump();//�ٳ�� ���� �ٱ⸦ ��
		Simpan s = new Simpan();
		s.pandan(go.record, da.record);
	}
}
//��ü ���� ����1
//��پ߽ÿ� �ٳ�� �ֽ��ϴ�.
//��پ߽ð� ���� �ٱ⸦ ���� �� �߽��ϴ�. ����� 0�Դϴ�.
//��پ߽ð� ���� �ٱ⸦ �߽��ϴ�. ����� 1.15m�Դϴ�.
//�ٳ�� ���� �ٱ⸦ �߽��ϴ�. ����� 1.21m�Դϴ�.
//������ ��پ߽ÿ� �ٳ��� �� �� ���� �� ����� ������ �Ǵ��մϴ�.
//���� 2. ����� ������ �Ѵ�.
//��پ߽ð� ���� �ٱ⸦ �߽��ϴ�. ����� 1.15m ->�����Դϴ�.
//�ٳ�� ���� �ٱ⸦ �߽��ϴ�. ����� 1.21m ->�����Դϴ�.
//������ ���� : 100~200
//��پ߽ð� 115 / 100 -> 1.15
//�ٳ��� 121 / 100 - >1.21
class Simpan {
	Simpan(){}
	void pandan(double gobayasi, double danaka) {
		if(gobayasi == danaka) {
			System.out.println("���º�:��"+gobayasi+",��:"+danaka);
		}else if(gobayasi > danaka) {
			System.out.println("��پ߽� �� ��:"+gobayasi+",��:"+danaka);
		}else {
			System.out.println("�ٳ��� �� ��:"+gobayasi+",��:"+danaka);
		}
	}//��پ߽ÿ� �ٳ����� ����� ���ؼ� ���и� ����Ѵ�.
}
class Gobayasi {
	Gobayasi(){}
	double record = 0;
	void jump(){
		//record = 1.15;
		record = (int)(Math.random()*101 + 100); //100~200
	}
	//������ ��ġ
	//1. Ŭ���� �� ���� --> �ν��Ͻ�(instance) ����
	//								��ϵ� ��ü�� �޸𸮿��� ������ �� �Ҹ�ȴ�.
	//* ��ϵ� ��ü�� ���� �޸𸮿��� ��������?
	//-> �����ڰ� �� �� ����. �ڹ� �����Ϸ��� ��ϵ� ��ü��
	// ������ ���� ���·� �����ð� ����Ǹ� �ڵ����� �Ҹ��Ų��.
	//2. �޼��� �� ���� --> ����(local) ����
	//								�޼��尡 ������ �Ҹ�ǹǷ� �����Ͱ� �޼��� �ȿ����� ����
}
class Danaka {
	Danaka(){}
	double record = 0;
	void jump() {
		//record = 1.21;
		record = (int)(Math.random()*101 + 100); //100~200
	}
}
