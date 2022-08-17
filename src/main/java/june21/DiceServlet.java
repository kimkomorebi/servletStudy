package june21;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DiceServlet")
public class DiceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public DiceServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Chulsu c = new Chulsu();
		Youngheee y = new Youngheee();
		c.rollDice(); y.rollDice();
		//1. ¿µÈñ°¡ ½ÂÆÐ¸¦ ÆÇ´ÜÇÑ´Ù.
		y.pandan(c.result);
		c.pandan(y.result);
		//3. ¹Î¼ö°¡ ½ÂÆÐ¸¦ ÆÇ´ÜÇÑ´Ù.
		Minsu m = new Minsu();
		m.winner(c.result, y.result);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
}

class Chulsu {
	Chulsu(){}
	int result = 0; // ÁÖ»çÀ§ °á°ú°¡ ÀúÀåµÇ´Â º¯¼ö(ÀÎ½ºÅÏ½º)
	void rollDice() {
		result = (int)(Math.random()*6 + 1);
	}//ÁÖ»çÀ§ ±¼¸² (ÇàÀ§-->¸Þ¼­µå·Î ¼³°è)
	void pandan(int youngheee) {
		//Ã¶¼öÀÇ °á°ú, ¿µÈñÀÇ °á°ú
		if(result == youngheee) {//¹«½ÂºÎ
			System.out.println("¹«½ÂºÎ,"+result+","+youngheee);
		}else if(result > youngheee) {//Ã¶¼ö ½Â
			System.out.println("Ã¶¼ö ½Â,"+result+","+youngheee);
		}else { //¿µÈñ ½Â
			System.out.println("¿µÈñ ½Â,"+result+","+youngheee);
		}
	}
}
class Youngheee {
	Youngheee(){}
	int result = 0; // ÁÖ»çÀ§ °á°ú°¡ ÀúÀåµÇ´Â º¯¼ö(ÀÎ½ºÅÏ½º)
	void rollDice() {
		result = (int)(Math.random()*6 + 1);
	}//ÁÖ»çÀ§ ±¼¸² (ÇàÀ§-->¸Þ¼­µå·Î ¼³°è)
	void pandan(int chulsu) {
		if(result == chulsu) {
			System.out.println("¹«½ÂºÎ,"+result+"," +chulsu);
		}else if(result > chulsu) {
			System.out.println("¿µÈñ ½Â,"+result+"," +chulsu);
		}else {
			System.out.println("Ã¶¼ö ½Â,"+result+"," +chulsu);
		}
	}
}
class Minsu {
	Minsu(){}
	void winner(int chulsu, int youngheee) {
		//Ã¶¼öÀÇ °á°ú, ¿µÈñÀÇ °á°ú
		if(chulsu == youngheee) {
			System.out.println("¹«½ÂºÎ,"+chulsu+","+youngheee);
		}else if(chulsu > youngheee) {
			System.out.println("Ã¶¼ö ½Â,"+chulsu+","+youngheee);
		}else {
			System.out.println("¿µÈñ ½Â,"+chulsu+","+youngheee);
		}
	}
}