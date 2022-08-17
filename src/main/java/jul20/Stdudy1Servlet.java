package jul20;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Stdudy1Servlet
 */
@WebServlet("/Stdudy1Servlet")
public class Stdudy1Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Stdudy1Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int data1 = 100;
		int data2 = 0;
		int result = 0;
		try {
			result = data1 / data2;
		}catch(Exception e) {
			System.out.println("0으로 나눌 수 없습니다");
		}
		System.out.println(data1+"을"+data2+"로 나누면");
		System.out.println(result+"입니다.");
	}
	//자바에서 다음의 프로그램을 할 경우에
	//반드시 "예외 처리"라는 문법을 사용해야 한다.
	//1. DB 연동
	//2. 네트워크 
	//3. 파일 처리
	//4. 스레드
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
