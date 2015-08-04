package test;

import java.util.ArrayList;

import academic_info.Report;
import academic_info.Score;
import academic_info.Student;
import sessions.Session;
import sessions.SessionEnglish;
import sessions.SessionMath;

public class ScoringTest {

	public static void main(String[] args){
		
	Student studentLee1 = new Student("이승기", 141213, "수학");
	Student studentKim1 = new Student("김수현", 141518, "영어");	
	Student studentJoo = new Student("주원", 141230, "수학");
	Student studentKim2 = new Student("김우빈", 141255, "수학");	
	Student studentLee2 = new Student("이민호", 141590, "영어");
	
	ArrayList<Student> studentList = new ArrayList<Student>();
	studentList.add(studentLee1);
	studentList.add(studentKim1);
	studentList.add(studentJoo);
	studentList.add(studentKim2);
	studentList.add(studentLee2);
	
	studentLee1.enroll(SessionMath.getInstance());
	studentLee1.enroll(SessionEnglish.getInstance());
	studentKim1.enroll(SessionMath.getInstance());
	studentKim1.enroll(SessionEnglish.getInstance());
	studentJoo.enroll(SessionMath.getInstance());
	studentJoo.enroll(SessionEnglish.getInstance());
	studentKim2.enroll(SessionMath.getInstance());
	studentKim2.enroll(SessionEnglish.getInstance());
	studentLee2.enroll(SessionMath.getInstance());
	studentLee2.enroll(SessionEnglish.getInstance());
	
	Session.evaluate(new Score(), SessionMath.getInstance(), studentLee1, 95);
	Session.evaluate(new Score(), SessionMath.getInstance(), studentKim1, 90);
	Session.evaluate(new Score(), SessionMath.getInstance(), studentJoo, 76);
	Session.evaluate(new Score(), SessionMath.getInstance(), studentKim2, 85);
	Session.evaluate(new Score(), SessionMath.getInstance(), studentLee2, 90);
	
	Session.evaluate(new Score(), SessionEnglish.getInstance(), studentLee1, 20);
	Session.evaluate(new Score(), SessionEnglish.getInstance(), studentKim1, 100);
	Session.evaluate(new Score(), SessionEnglish.getInstance(), studentJoo, 60);
	Session.evaluate(new Score(), SessionEnglish.getInstance(), studentKim2, 89);
	Session.evaluate(new Score(), SessionEnglish.getInstance(), studentLee2, 95);

	Report report = new Report(studentList);
	report.report();

	}
}
