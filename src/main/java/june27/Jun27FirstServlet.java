package june27;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Jun27FirstServlet")
public class Jun27FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Jun27FirstServlet() {
        super();
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		Tiger t1 = new Tiger(); t1.name ="ȣ����"; t1.age = 1;
//		Tiger t2 = new Tiger("ȣ����", 2);
		Gobayasi g = new Gobayasi("��پ߽�", 32);
		
	}
}
//class Tiger {
//	Tiger(){}
//	Tiger(int b){
//		String name = "����";
//		this.name = name;
//		}
//	String name; int age;
//	void doIt() {
//		String name; int age;
//	}
//}
class Gobayasi {
	Gobayasi(String name, int age){
		this.name = name; this.age = age;
	}//this ������ : ���� �ν��Ͻ�(��ü)�� ���Ѵ�
	String name; int age;

}