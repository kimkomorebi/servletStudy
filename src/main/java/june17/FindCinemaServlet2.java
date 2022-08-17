package june17;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/june17/findCinema.do")
public class FindCinemaServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public FindCinemaServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String genre = request.getParameter("GENRE");
		CinemaExpert ce = new CinemaExpert();
		String[] movies = ce.findMovies(genre);
		String[] cinemas = ce.selectMovies(genre);
		request.setAttribute("RESULT", cinemas);
		RequestDispatcher rd = request.getRequestDispatcher("cinemaResult.jsp");
		rd.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
}
class CinemaExpert {
	CinemaExpert(){}
	String[] selectMovies(String name) {
		String[] genres = {"1", "2", "3", "4","5"};
		String[][] movies = {
				{"13일의 금요일","여고 괴담"}, 
				{"터미네이터","터미네이터2","미션 임파서블"},
				{"개그 콘서트"},
				{"스릴러1", "스릴러2", "스릴러3", "스릴러4"},
				{"드라마1", "드라마2", "드라마3", "드라마4", "드라마5"}
		};
		String[] recommend = null;
		for(int idx=0; idx < genres.length; idx++) {
			if(name.equals(genres[idx])) {
				int gili = movies[idx].length;
				recommend = new String[gili];
				for(int i=0; i<movies[idx].length; i++) {
					recommend[i] = movies[idx][i];
				}//for의 끝
				break; //반복을 중단한다.
			}//if의 끝
		}//for의 끝
		return recommend;
	}//메서드의 끝
	String[] findMovies(String name){
		String[] names = new String[3];
		switch(name) {
			case "1" : names[0] = "13일 금요일"; names[1] = "엑소시스트"; names[2] = "여고괴담"; break;
			case "2" : names[0] = "다이하드"; names[1] = "터미네이터"; names[2] = "미션 임파서블"; break;
			case "3" : names[0] = "개그콘서트"; names[1] = "웃으면 복이와요"; names[2] = "엽기적인 그녀"; break;
			case "4" : names[0] = "스릴러1"; names[1] = "스릴러2"; names[2] = "스릴러3"; break;
			case "5" : names[0] = "드라마1"; names[1] = "드라마2"; names[2] = "드라마3"; break;
		}
		return names;
	}
}
