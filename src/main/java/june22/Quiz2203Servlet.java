package june22;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Quiz2203Servlet")
public class Quiz2203Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Quiz2203Servlet() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		JavaDepartmentStore store = new JavaDepartmentStore();
		store.k.makeSum(store);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
}
class JavaDepartmentStore {
	JavaDepartmentStore(){}
	ElectronicStore e = new ElectronicStore();
	FruitStore f = new FruitStore();
	ClothingStore c = new ClothingStore();
	Kobayashi k = new Kobayashi();
}
class ElectronicStore {
	ElectronicStore(){}
	TV tv = new TV();
	Radio radio = new Radio();
}
class TV {
	TV(){}
	//int price = 20000;
	int price = (int)(Math.random()*5001 + 5000);
}
class Radio {
	Radio(){}
	int price = 10000;
}
class FruitStore {
	FruitStore(){}
	Apple apple = new Apple();
	Grape grape = new Grape();
}
class Apple {
	Apple(){}
	int price = 3000;
}
class Grape {
	Grape(){}
	//int price = 5000;
	int price = (int)(Math.random()*5001 + 5000);
}
class ClothingStore {
	ClothingStore(){}
	Jean jean = new Jean();
	Tshirt tshirt = new Tshirt();
}
class Jean {
	Jean(){}
	//int price = 9000;
	int price = (int)(Math.random()*5001 + 5000);
}
class Tshirt {
	Tshirt(){}
	int price = 6000;
}
class Kobayashi {
	Kobayashi(){}
	int money = 50000;
	int sum = 0;
	void makeSum(JavaDepartmentStore store) {
		sum = money - store.c.jean.price - store.e.tv.price - store.f.grape.price;
		System.out.println("코바야시에게 남은 금액 : " + sum+"원");
	}
}