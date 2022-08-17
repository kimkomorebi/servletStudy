package june21;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FlowerShopServlet")
public class FlowerShopServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public FlowerShopServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		President p = new President();
		Employee e = new Employee();
		FlowerShop f = new FlowerShop();
		System.out.println(p.e.r.price+p.e.g.price+p.e.b.price);
		System.out.println(e.r.price+e.g.price+e.b.price);
		System.out.println(f.p.e.r.price+p.e.g.price+p.e.b.price);
		System.out.println(f.p.e.r.price+e.g.price+e.b.price);
		
		if(p.e.r.price+p.e.g.price+p.e.b.price == e.r.price+e.g.price+e.b.price) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
}
class FlowerShop {
	FlowerShop(){}
	President p = new President();
}
class President {
	President(){}
	Employee e = new Employee();
}
class Employee {
	Employee(){}
	Rose r = new Rose();
	Gukhwa g = new Gukhwa();
	Bakhab b = new Bakhab();
}
class Rose {
	Rose(){}
	int price = (int)(Math.random()*9001 + 1000);
}
class Gukhwa {
	Gukhwa(){}
	int price = (int)(Math.random()*9001 + 1000);
}
class Bakhab {
	Bakhab (){}
	int price = (int)(Math.random()*9001 + 1000);
}
