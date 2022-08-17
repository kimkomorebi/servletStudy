package june14;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BeerSelectServlet
 */
@WebServlet("/june14/beerSelect.do")
public class BeerSelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BeerSelectServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//고객이 선택한 색을 찾는다.
		String color = request.getParameter("COLOR");
		//위에서 찾은 색에 알맞는 맥주 이름을 찾는다.
		String brand = ""; //추천된 맥주 이름을 위한 변수 선언
		if(color.equals("DARK")) {
			brand = "GUINESS";
		}else if(color.equals("LIGHT")) {
			brand = "Budwiser";
		}else if(color.equals("YELLOW")) {
			brand = "Corona";
		}else if(color.equals("BROWN")) {
			brand = "Tsingtao";
		}
		//찾은 맥주 이름을 JSP(beerResult.jsp)로 전송한다.
		//Redirect, Foward, 둘 다 OK(정답)
		//response.sendRedirect("beerResult.jsp?BEER="+brand);
		request.setAttribute("BRAND", brand);
		RequestDispatcher rd = request.getRequestDispatcher("beerResult.jsp");
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
