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
				{"13���� �ݿ���","���� ����"}, 
				{"�͹̳�����","�͹̳�����2","�̼� ���ļ���"},
				{"���� �ܼ�Ʈ"},
				{"������1", "������2", "������3", "������4"},
				{"���1", "���2", "���3", "���4", "���5"}
		};
		String[] recommend = null;
		for(int idx=0; idx < genres.length; idx++) {
			if(name.equals(genres[idx])) {
				int gili = movies[idx].length;
				recommend = new String[gili];
				for(int i=0; i<movies[idx].length; i++) {
					recommend[i] = movies[idx][i];
				}//for�� ��
				break; //�ݺ��� �ߴ��Ѵ�.
			}//if�� ��
		}//for�� ��
		return recommend;
	}//�޼����� ��
	String[] findMovies(String name){
		String[] names = new String[3];
		switch(name) {
			case "1" : names[0] = "13�� �ݿ���"; names[1] = "���ҽý�Ʈ"; names[2] = "������"; break;
			case "2" : names[0] = "�����ϵ�"; names[1] = "�͹̳�����"; names[2] = "�̼� ���ļ���"; break;
			case "3" : names[0] = "�����ܼ�Ʈ"; names[1] = "������ ���̿Ϳ�"; names[2] = "�������� �׳�"; break;
			case "4" : names[0] = "������1"; names[1] = "������2"; names[2] = "������3"; break;
			case "5" : names[0] = "���1"; names[1] = "���2"; names[2] = "���3"; break;
		}
		return names;
	}
}
