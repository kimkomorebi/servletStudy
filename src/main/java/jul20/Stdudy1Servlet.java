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
			System.out.println("0���� ���� �� �����ϴ�");
		}
		System.out.println(data1+"��"+data2+"�� ������");
		System.out.println(result+"�Դϴ�.");
	}
	//�ڹٿ��� ������ ���α׷��� �� ��쿡
	//�ݵ�� "���� ó��"��� ������ ����ؾ� �Ѵ�.
	//1. DB ����
	//2. ��Ʈ��ũ 
	//3. ���� ó��
	//4. ������
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
