package jul20;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/jul20/register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("NAME");
		String id = request.getParameter("ID");
		String addr = request.getParameter("ADDR");
		String phone = request.getParameter("TEL");
		String pwd = request.getParameter("PWD");
		String gender = request.getParameter("GENDER");
		String email = request.getParameter("EMAIL");
		String job = request.getParameter("JOB");
		System.out.println(name+","+id+","+addr+","+phone+","+pwd+","+gender+","+email+","+job);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//method가 get인 경우의 한글 처리 -> 웹서버 server.xml에서 Connector뒤에 URIEncoding="EUC-KR" 입력
		//method가 post인 경우의 한글 처리
		request.setCharacterEncoding("EUC-KR");
		
		String name = request.getParameter("NAME");
		String id = request.getParameter("ID");
		String addr = request.getParameter("ADDR");
		String phone = request.getParameter("TEL");
		String pwd = request.getParameter("PWD");
		String gender = request.getParameter("GENDER");
		String email = request.getParameter("EMAIL");
		String job = request.getParameter("JOB");
		
		//고객 정보 테이블(customer_info)
		//계정(id:varchar2(20)), 이름(name:varchar2(30)), 주소(address:varchar2(50)), 연락처(phone:varchar2(30)), 암호(password:varchar2(20)),
		//성별(gender:varchar2(2)), 이메일(email:varchar2(30)), 직업(job:varchar2(20))
		String insert = "insert into cutomer_info values(";
		insert = insert + "'"+id+"','"+name+"','"+addr+"',";
		insert = insert + "'"+phone+"','"+pwd+"','"+gender+"',";
		insert = insert + "'"+email+"','"+job+"')";
		System.out.println(insert);
		//자바에서 다음의 프로그램을 할 경우에
		//반드시 "예외 처리"라는 문법을 사용해야 한다.
		//1. DB 연동
		//2. 네트워크 
		//3. 파일 처리
		//4. 스레드
	}

}
