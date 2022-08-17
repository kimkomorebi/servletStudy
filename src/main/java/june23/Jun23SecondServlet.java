package june23;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Jun23SecondServlet")
public class Jun23SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Jun23SecondServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		JavaSchool js = new JavaSchool();
		//��̹��� ������ �հ� ��� ���
		js.jc.jt.makeSumNAvg(js.jc);
		//��ȭ�� ������ �հ� ��� ���
		js.kc.kt.makeSumNAvg(js.kc);
		//���չ� ������ �հ� ��� ���
		js.bc.bt.makeSumNAvg(js.bc);
		PrimeTeacher pt = new PrimeTeacher();
		pt.makeSumNAvg(js);
		pt.makeSumNAvg2(js);
	}
}
class JavaSchool {
	JavaSchool(){}
	JangmiClass jc = new JangmiClass();
	KookwhaClass kc = new KookwhaClass();
	BaekhapClass bc = new BaekhapClass();
	//PrimeTeacher pt = new PrimeTeacher();
}//�ڹ� �б�
class PrimeTeacher {
	PrimeTeacher(){}
	void makeSumNAvg2(JavaSchool js) {
		int sum = js.jc.jt.sum + js.kc.kt.sum + js.bc.bt.sum;
		int avg = sum / 6;
		System.out.println("���л��� ������ ��� : "+sum+","+avg);
	}
	void makeSumNAvg(JavaSchool js) {
		int sum = js.jc.cs.getScore() + js.jc.yh.getScore() + js.kc.ms.score + js.kc.nn.score + js.bc.d.score + js.bc.km.score;
		int avg = sum / 6;
		System.out.println("���л��� ������ ��� : "+sum+","+avg);
	}
}
class Youngheee {
	Youngheee (){}
	int score = (int)(Math.random()*101);
	int getScore(){
		return score;
	}
}
class Chulsoo {
	Chulsoo(){}
	public int getScore() {
		return score;
	}
	int score = (int)(Math.random()*101);
}
class Minsoo {
	Minsoo(){}
	int score = (int)(Math.random()*101);
}
class Nanana {
	Nanana(){}
	int score = (int)(Math.random()*101);
}
class Doill {
	Doill(){}
	int score = (int)(Math.random()*101);
}
class Kyungminn {
	Kyungminn(){}
	int score = (int)(Math.random()*101);
}

class JangmiClass {
	JangmiClass(){}
	Youngheee yh = new Youngheee();
	Chulsoo cs = new Chulsoo();
	JangmiTeacher jt = new JangmiTeacher();
}//��̹�
class JangmiTeacher {
	JangmiTeacher(){}
	//������ ����� ���
	int sum = 0;
	void makeSumNAvg(JangmiClass jc) {
		sum = jc.yh.score + jc.cs.score;
		int avg = sum / 2;
		System.out.println("��̹� ������ ��� : "+sum+","+avg);
	}//��̹��� ������ ����� ���
}//��̹� ���� ������

class KookwhaClass {
	KookwhaClass(){}
	Minsoo ms = new Minsoo();
	Nanana nn = new Nanana();
	KookwhaTeacher kt = new KookwhaTeacher();
}//��ȭ��
class KookwhaTeacher {
	KookwhaTeacher(){}
	int sum = 0;
	void makeSumNAvg(KookwhaClass kc) {
		sum = kc.ms.score + kc.nn.score;
		int avg = sum / 2;
		System.out.println("��ȭ�� ������ ��� : "+sum+","+avg);
	}//��ȭ���� ������ ����� ���
}
class BaekhapClass {
	BaekhapClass(){}
	Doill d = new Doill();
	Kyungminn km = new Kyungminn();
	 BaekhapTeacher bt = new  BaekhapTeacher();
}//���չ�
class BaekhapTeacher {
	BaekhapTeacher(){}
	int sum = 0;
	void makeSumNAvg(BaekhapClass bc) {
		sum = bc.d.score + bc.km.score;
		int avg = sum / 2;
		System.out.println("���չ� ������ ��� : "+sum+","+avg);
	}//���չ��� ������ ����� ���
}