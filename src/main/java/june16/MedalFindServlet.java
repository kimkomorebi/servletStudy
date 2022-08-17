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
		//메달 전문가를 등록한다.
		new MedalExpert();
		MedalExpert me = new MedalExpert();
		//메달 전문가의 메소드를 사용해서 갯수를 받는다.
		int[] result =  me.findMedal(nation);
		//페이지를 medalResult.jsp로 바꾼다.
		request.setAttribute("MEDALS", result);
		String name = ""; // 나라 이름을 위한 변수 선언
		switch(nation) {
		case "K" : name = "대한민국"; break;
		case "J" : name = "일본"; break;
		case "C" : name = "중국"; break;
		case "T" : name = "태국"; //break;
		}
		request.setAttribute("NATION", name);
		RequestDispatcher rd = request.getRequestDispatcher("medalResult.jsp");
		rd.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
}//서블릿의 끝
class Korea{
	Korea(){}
	String name = "대한민국";
	int gold = 10; int silver = 9; int bronze = 8;
}
class Japan{
	Japan(){}
	String name = "일본";
	int gold = 9; int silver = 8; int bronze = 7;
}
class China{
	China(){}
	String name = "중국";
	int gold = 8; int silver = 7; int bronze = 6;
}
class Thailand{
	Thailand(){}
	String name = "태국";
	int gold = 7; int silver = 6; int bronze = 5;
}
class MedalExpert {
	MedalExpert(){} // 생성자
	int[] findMedal(String name) {
		int[] num = new int[3]; //메달 갯수 (금메달, 은메달, 동메달)
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
		 nation.name = "대한민국";
		 nation.gold = 10; nation.silver = 9; nation.bronze = 8;
		 
		Nation nation2  = Nation();
		nation2.name = "일본";
		nation2.gold = 9; nation2.silver = 8; nation2.bronze = 7;
		 */
		
		return num;
	}
}// Medal Expert의 끝