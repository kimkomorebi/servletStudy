package june23;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Jun23FirstServlet")
public class Jun23FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public Jun23FirstServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		JavaDepartmentStore jds = new JavaDepartmentStore();
		//1. ��ȭ���� ���������� TV����
		System.out.println("TV ����:"+jds.gm.tv.price);
		System.out.println("û���� ����"+jds.um.j.price);
		Gobayasi go = new Gobayasi();
		go.buy(jds.gm.tv); // TV ����
		go.buy(jds.um.j); //û���� ����
		System.out.println("���� �뵷:"+go.poketMoney);
	}
}
class Gobayasi {
	Gobayasi(){}
	int poketMoney = 50000; //�뵷
	//��ȭ���� ���� ������ TV�� ����
	void buy(TV tv) {
		poketMoney = poketMoney - tv.price;
	}
	//��ȭ���� �Ƿ� ������ û������ ����
	void buy(Jean j) {
		poketMoney = poketMoney - j.price;
	}
	//��ȭ���� ���� ������ ����� ����
	void buy(Apple a) {
		poketMoney = poketMoney - a.price;
	}
}//��پ߽� 

class JavaDepartmentStore {
	JavaDepartmentStore(){}
	GajeonMart gm = new GajeonMart();
	GualMart gam = new GualMart();
	UrueMart um = new UrueMart();
}//�ڹ� ��ȭ��

class GajeonMart {
	GajeonMart(){}
	TV tv = new TV();
	Radio r = new Radio();
}//���� ����

class TV {
	TV(){}
	int price = (int)(Math.random()*11 + 10);
}

class Radio {
	Radio(){}
	int price = (int)(Math.random()*11 + 10);
}

class GualMart {
	GualMart(){}
	Grape g = new Grape();
	Apple a = new Apple();
	
}//���� ����

class Grape {
	Grape(){}
	int price = (int)(Math.random()*11 + 10);
}

class Apple {
	Apple(){}
	int price = (int)(Math.random()*11 + 10);
}

class UrueMart{
	UrueMart(){}
	Tshirt t = new Tshirt();
	Jean j = new Jean();
}//�Ƿ� ����

class Tshirt {
	Tshirt(){}
	int price = (int)(Math.random()*11 + 10);
}

class Jean {
	Jean(){}
	int price = (int)(Math.random()*11 + 10);
}



