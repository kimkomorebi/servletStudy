package june23;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Jun23Quiz")
public class Jun23Quiz extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Jun23Quiz() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		JavaElementSchool jes = new JavaElementSchool();
		jes.r.makeScore(jes.r.rose);
		System.out.println("장미반 합계 점수:" + jes.r.totalScore);
		System.out.println("장비만 평균 점수:"+jes.r.aveScore);
		jes.k.makeScore(jes.k.kuk);
		System.out.println("국화반 합계 점수:"+jes.k.totalScore);
		System.out.println("국화반 평균 점수:"+jes.k.aveScore);
		jes.b.makeScore(jes.b.beak);
		System.out.println("백합반 합계 점수:"+jes.b.totalScore);
		System.out.println("백합반 평균 점수:"+jes.b.aveScore);
		
		jes.head.makeSum(jes);
		System.out.println("전체반 합계 점수:"+ jes.head.totalScore);
		System.out.println("전체반 평균 점수:"+ jes.head.aveScore);
		 
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}

class JavaElementSchool {
	JavaElementSchool (){}
	RoseTeacher r = new RoseTeacher();
	KukwhaTeacher k = new KukwhaTeacher();
	BeakhapTeacher b = new BeakhapTeacher();
	HeadTeacher head = new HeadTeacher();
}
class HeadTeacher {
	HeadTeacher(){}
	int totalScore = 0;
	int aveScore = 0;
	void makeSum(JavaElementSchool js) {
		totalScore = js.r.totalScore + js.k.totalScore + js.b.totalScore;
		aveScore = totalScore / 6;
	}
}
class RoseTeacher {
	RoseTeacher(){}
	RoseClass rose = new RoseClass();
	int totalScore = 0;
	int aveScore = 0;
	void makeScore(RoseClass rc) {
		totalScore = rc.young.score + rc.chul.score;
		aveScore = (rc.young.score + rc.chul.score) / 2;
	}
}
class RoseClass {
	RoseClass(){}
	Younghee young = new Younghee();
	Chulsu chul = new Chulsu();
}

class Younghee {
	Younghee(){}
	int score = (int)(Math.random()*101 + 0);
}

class Chulsu {
	Chulsu(){}
	int score = (int)(Math.random()*101 + 0);
}
class KukwhaTeacher {
	KukwhaTeacher(){}
	KukwhaClass kuk = new KukwhaClass();
	int totalScore = 0;
	int aveScore = 0;
	void makeScore(KukwhaClass kc) {
		totalScore = kc.min.score + kc.na.score;
		aveScore = (kc.min.score + kc.na.score) / 2;
	}
}

class KukwhaClass {
	KukwhaClass(){}
	Minsu min = new Minsu();
	Nana na = new Nana();
}

class Minsu {
	Minsu(){}
	int score = (int)(Math.random()*101 + 0);
}
class Nana {
	Nana(){}
	int score = (int)(Math.random()*101 + 0);
}
class BeakhapTeacher {
	BeakhapTeacher(){}
	BeakhapClass beak = new BeakhapClass();
	int totalScore = 0;
	int aveScore = 0;
	void makeScore( BeakhapClass bc) {
		totalScore = bc.doil.score + bc.kyung.score;
		aveScore = (bc.doil.score + bc.kyung.score) / 2;
	}
}

class BeakhapClass {
	BeakhapClass(){}
	Doil doil = new Doil();
	Kyungmin kyung = new Kyungmin();
}

class Doil {
	Doil(){}
	int score = (int)(Math.random()*101 + 0);
}

class Kyungmin {
	Kyungmin(){}
	int score = (int)(Math.random()*101 + 0);
}