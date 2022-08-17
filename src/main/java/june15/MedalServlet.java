package june15;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MedalServlet
 */
@WebServlet("/june15/medalFind.do")
public class MedalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MedalServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String country = request.getParameter("COUNTRY");
		new MedalScore();
		MedalScore ms = new MedalScore();
		String[] result = ms.findMedal(country);
		request.setAttribute("COUNTRY", country);
		request.setAttribute("MEDALSCORE", result);
		RequestDispatcher rd = request.getRequestDispatcher("medalResult.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
class MedalScore{
	MedalScore(){} // »ý¼ºÀÚ
	String[] findMedal(String country) {
		String[] medals = new String[3];
		if(country.equals("KOREA")) {
			medals[0] = "5"; medals[1] = "3"; medals[2] = "4";
		}else if(country.equals("JAPAN")) {
			medals[0] = "4"; medals[1] = "2"; medals[2] = "3";
		}else if(country.equals("CHINA")) {
			medals[0] = "3"; medals[1] = "1"; medals[2] = "2";
		}else if(country.equals("USA")) {
			medals[0] = "10"; medals[1] = "7"; medals[2] = "9";
		}
		return medals;
	}
}
