package sessions;

import java.util.ArrayList;

import academic_info.Score;
import academic_info.Student;


public class SessionEnglish extends Session{
	
	private ArrayList<Student> engEnrolledStudents= new ArrayList<Student>();

	private static SessionEnglish englishClass = new SessionEnglish();
	
	public static SessionEnglish getInstance(){
		
		if(englishClass == null){
			englishClass = new SessionEnglish();
		}
		return englishClass;
	}

	@Override
	public String getSessionId() {
		return "영어";
	}

	@Override
	public ArrayList<Student> getEnrolledStudentList() {

		return engEnrolledStudents;
	}

	@Override
	public void registerStudent(Student student) {
		this.engEnrolledStudents.add(student);
	}


	@Override
	public int requestScore(Score score) {
		return score.getPoint();
	}

}
