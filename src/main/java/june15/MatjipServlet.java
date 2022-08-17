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
		//name�� �ִ� ���� �̸����� ������ ã�´�.
		new MatjipExpert(); // ��ü�� ����ϴ� ��� : new + ������;
		MatjipExpert me = new MatjipExpert();
		String[] result = me.findMatjip(name);
		//Ž���� ������ matjipResult.jsp�� �����Ѵ�.
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

}//������ ��
class MatjipExpert {
	MatjipExpert(){} // ������ ����
		//������ ã���ִ� �޼���(����, ������Ÿ�� ���ڿ� �迭)
	String[] findMatjip(String town) {
		String[] names = new String[3];
		if(town.equals("1")) {//���α��� ������ ���
			names[0] = "���� ���"; names[1] = "���� ���"; names[2]="���� �Ͻ�";
			}else if(town.equals("2")) {
				names[0] = "���� ���"; names[1] = "���� ���"; names[2]="���� �Ͻ�";
			}else if(town.equals("3")) {
				names[0] = "���� ���"; names[1] = "���� ���"; names[2]="���� �Ͻ�";
			}else if(town.equals("4")) {
				names[0] = "���� ���"; names[1] = "���� ���"; names[2]="���� �Ͻ�";
			}
		return names;
	}
}//���� ������ ��ü ����
