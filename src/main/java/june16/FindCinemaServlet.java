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
		case "1" : name = "공포"; break;
		case "2" : name = "액션"; break;
		case "3" : name = "코미디"; break;
		case "4" : name = "스릴러"; break;
		case "5" : name = "드라마"; 
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
			cinemas[0] = "공포1"; cinemas[1] = "공포2"; cinemas[2] = "공포3"; cinemas[3] = "공포4";
		}else if(genre.equals("2")) {
			cinemas[0] = "액션1"; cinemas[1] = "액션2"; cinemas[2] = "액션3"; cinemas[3] = "액션4";
		}else if(genre.equals("3")) {
			cinemas[0] = "코미디1"; cinemas[1] = "코미디2"; cinemas[2] = "코미디3"; cinemas[3] = "코미디4";
		}else if(genre.equals("4")) {
			cinemas[0] = "스릴러1"; cinemas[1] = "스릴러2"; cinemas[2] = "스릴러3"; cinemas[3] = "스릴러4";
		}else if(genre.equals("5")) {
			cinemas[0] = "드라마1"; cinemas[1] = "드라마2"; cinemas[2] = "드라마3"; cinemas[3] = "드라마4";
		}
		return cinemas;
	}
}
