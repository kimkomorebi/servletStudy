package june16;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MedalFindServlet
 */
@WebServlet("/june16/medalFind.do")
public class MedalFindServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public MedalFindServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nation = request.getParameter("NATION");
		//�޴� �������� ����Ѵ�.
		new MedalExpert();
		MedalExpert me = new MedalExpert();
		//�޴� �������� �޼ҵ带 ����ؼ� ������ �޴´�.
		int[] result =  me.findMedal(nation);
		//�������� medalResult.jsp�� �ٲ۴�.
		request.setAttribute("MEDALS", result);
		String name = ""; // ���� �̸��� ���� ���� ����
		switch(nation) {
		case "K" : name = "���ѹα�"; break;
		case "J" : name = "�Ϻ�"; break;
		case "C" : name = "�߱�"; break;
		case "T" : name = "�±�"; //break;
		}
		request.setAttribute("NATION", name);
		RequestDispatcher rd = request.getRequestDispatcher("medalResult.jsp");
		rd.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
}//������ ��
class Korea{
	Korea(){}
	String name = "���ѹα�";
	int gold = 10; int silver = 9; int bronze = 8;
}
class Japan{
	Japan(){}
	String name = "�Ϻ�";
	int gold = 9; int silver = 8; int bronze = 7;
}
class China{
	China(){}
	String name = "�߱�";
	int gold = 8; int silver = 7; int bronze = 6;
}
class Thailand{
	Thailand(){}
	String name = "�±�";
	int gold = 7; int silver = 6; int bronze = 5;
}
class MedalExpert {
	MedalExpert(){} // ������
	int[] findMedal(String name) {
		int[] num = new int[3]; //�޴� ���� (�ݸ޴�, ���޴�, ���޴�)
		if(name.equals("K")) {
			num[0] = 5; num[1] = 4; num[2] = 3;
		}else if(name.equals("J")) {
			num[0] = 4; num[1] = 3; num[2] = 2;
		}else if(name.equals("C")) {
			num[0] = 3; num[1] = 2; num[2] = 1;
		}else if(name.equals("T")) {
			num[0] = 2; num[1] = 1; num[2] = 0;
		}
		/* 
		 class Nation {
		 	Nation(){}
		 	String name = null;
		 	int gold = 0; int silver = 0; int bronze = 0;
		 }
		 Nation nation = new Nation();
		 nation.name = "���ѹα�";
		 nation.gold = 10; nation.silver = 9; nation.bronze = 8;
		 
		Nation nation2  = Nation();
		nation2.name = "�Ϻ�";
		nation2.gold = 9; nation2.silver = 8; nation2.bronze = 7;
		 */
		
		return num;
	}
}// Medal Expert�� ��