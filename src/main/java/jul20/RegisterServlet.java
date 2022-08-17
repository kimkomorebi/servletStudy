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
		//method�� get�� ����� �ѱ� ó�� -> ������ server.xml���� Connector�ڿ� URIEncoding="EUC-KR" �Է�
		//method�� post�� ����� �ѱ� ó��
		request.setCharacterEncoding("EUC-KR");
		
		String name = request.getParameter("NAME");
		String id = request.getParameter("ID");
		String addr = request.getParameter("ADDR");
		String phone = request.getParameter("TEL");
		String pwd = request.getParameter("PWD");
		String gender = request.getParameter("GENDER");
		String email = request.getParameter("EMAIL");
		String job = request.getParameter("JOB");
		
		//�� ���� ���̺�(customer_info)
		//����(id:varchar2(20)), �̸�(name:varchar2(30)), �ּ�(address:varchar2(50)), ����ó(phone:varchar2(30)), ��ȣ(password:varchar2(20)),
		//����(gender:varchar2(2)), �̸���(email:varchar2(30)), ����(job:varchar2(20))
		String insert = "insert into cutomer_info values(";
		insert = insert + "'"+id+"','"+name+"','"+addr+"',";
		insert = insert + "'"+phone+"','"+pwd+"','"+gender+"',";
		insert = insert + "'"+email+"','"+job+"')";
		System.out.println(insert);
		//�ڹٿ��� ������ ���α׷��� �� ��쿡
		//�ݵ�� "���� ó��"��� ������ ����ؾ� �Ѵ�.
		//1. DB ����
		//2. ��Ʈ��ũ 
		//3. ���� ó��
		//4. ������
	}

}
