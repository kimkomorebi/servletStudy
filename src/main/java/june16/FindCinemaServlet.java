package june16;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FindCinemaServlet
 */
@WebServlet("/june16/findCinema.do")
public class FindCinemaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FindCinemaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String genre = request.getParameter("GENRE");
		new CinemaExpert();
		CinemaExpert cinema = new CinemaExpert();
		String[] result = cinema.findCinema(genre);
		String name = "";
		switch(genre) {
		case "1" : name = "����"; break;
		case "2" : name = "�׼�"; break;
		case "3" : name = "�ڹ̵�"; break;
		case "4" : name = "������"; break;
		case "5" : name = "���"; 
		}
		request.setAttribute("CN", result );
		request.setAttribute("GENRE", name);
		RequestDispatcher rd = request.getRequestDispatcher("cinemaResult.jsp");
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
class CinemaExpert{
	CinemaExpert(){}
	String[] findCinema(String genre) {
		String[] cinemas = new String[4];
		if(genre.equals("1")) {
			cinemas[0] = "����1"; cinemas[1] = "����2"; cinemas[2] = "����3"; cinemas[3] = "����4";
		}else if(genre.equals("2")) {
			cinemas[0] = "�׼�1"; cinemas[1] = "�׼�2"; cinemas[2] = "�׼�3"; cinemas[3] = "�׼�4";
		}else if(genre.equals("3")) {
			cinemas[0] = "�ڹ̵�1"; cinemas[1] = "�ڹ̵�2"; cinemas[2] = "�ڹ̵�3"; cinemas[3] = "�ڹ̵�4";
		}else if(genre.equals("4")) {
			cinemas[0] = "������1"; cinemas[1] = "������2"; cinemas[2] = "������3"; cinemas[3] = "������4";
		}else if(genre.equals("5")) {
			cinemas[0] = "���1"; cinemas[1] = "���2"; cinemas[2] = "���3"; cinemas[3] = "���4";
		}
		return cinemas;
	}
}
