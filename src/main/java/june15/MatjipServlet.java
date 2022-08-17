package june15;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MatjipServlet
 */
@WebServlet("/june15/matjipFind.do")
public class MatjipServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MatjipServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("TOWN");
		//name에 있는 지역 이름으로 맛집을 찾는다.
		new MatjipExpert(); // 객체를 등록하는 방법 : new + 생성자;
		MatjipExpert me = new MatjipExpert();
		String[] result = me.findMatjip(name);
		//탐색된 맛집을 matjipResult.jsp로 전달한다.
		request.setAttribute("MATJIP", result);
		RequestDispatcher rd = request.getRequestDispatcher("matjipResult.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}//서블릿의 끝
class MatjipExpert {
	MatjipExpert(){} // 생성자 선언
		//맛집을 찾아주는 메서드(리턴, 데이터타입 문자열 배열)
	String[] findMatjip(String town) {
		String[] names = new String[3];
		if(town.equals("1")) {//종로구를 선택한 경우
			names[0] = "종로 면옥"; names[1] = "종로 김밥"; names[2]="종로 일식";
			}else if(town.equals("2")) {
				names[0] = "강서 면옥"; names[1] = "강서 김밥"; names[2]="강서 일식";
			}else if(town.equals("3")) {
				names[0] = "강남 면옥"; names[1] = "강남 김밥"; names[2]="강남 일식";
			}else if(town.equals("4")) {
				names[0] = "마포 면옥"; names[1] = "마포 김밥"; names[2]="마포 일식";
			}
		return names;
	}
}//맛집 전문가 객체 선언
