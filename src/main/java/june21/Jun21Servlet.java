package june21;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Jun21Servlet")
public class Jun21Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Jun21Servlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Lemon l = new Lemon();
		Kiwi k = new Kiwi();
		System.out.println(l.price);
		System.out.println(k.price);
		FruitMart fm = new FruitMart();
		System.out.println(fm.l.price); // ���� ���� ���� ���� ����
		System.out.println(fm.k.price);// ���� ���� ���� Ű�� ����
		if(l == fm.l) {
			System.out.println("����.");
		}else {
			System.out.println("�ٸ���.");
		}
		Bag bag = new Bag();
		System.out.println(bag.w.p.listPrice);
		//���� ���� ���� ���� ���� ���� �׸鰡 ���
		Paper p = new Paper();
		System.out.println(p.listPrice); 
		//������ �׸鰡 ���
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
}
//������ ������ 200���Դϴ�.
//Ű���� ������ 500���Դϴ�.
//
//����� Ű���� ���� ���� �ȿ� �ֽ��ϴ�.
//���� ���� �ȿ� �ִ� ����� Ű���� ������ ����մϴ�.
class FruitMart {
	FruitMart (){}
	Lemon l = new Lemon();
	Kiwi k = new Kiwi();
}//���� ����
class Lemon {
	Lemon(){}
	int price = 200;
}
class Kiwi {
	Kiwi(){}
	int price =500;
}

//���� �ֽ��ϴ�. �׸鰡�� 1000���Դϴ�.
//����� ���� �� �� �ֽ��ϴ�.
//������ ���� �ȿ� �ֽ��ϴ�.
//��, ���� ���� ���� ���� ������ �׸鰡�� ����մϴ�
class Bag {
	Bag(){}
	Wallet w = new Wallet();
}
class Wallet {
	Wallet(){}
	Paper p = new Paper();
}
class Paper{
	Paper(){}
	int listPrice = 1000;
}//���� ����