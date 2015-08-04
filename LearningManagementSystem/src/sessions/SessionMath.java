package sessions;

import java.util.ArrayList;

import academic_info.Score;
import academic_info.Student;


public class SessionMath extends Session{

	private static SessionMath mathClass = new SessionMath();
	
	private static ArrayList<Student> mathEnrolledStudents = new ArrayList<Student>();
//	private Score score;
	
	public static SessionMath getInstance(){
		
		if(mathClass == null){
			mathClass = new SessionMath();	
		}
		return mathClass;
		
	}

	@Override
	public String getSessionId() {
		
		return "수학";
	}
	

	@Override
	public ArrayList<Student> getEnrolledStudentList() {
//		
//		for(int i = 0; i < mathEnrolledStudents.size(); i++){
//			Student student = (Student)mathEnrolledStudents.get(i);
//			
//		}
		return mathEnrolledStudents;
	}

	@Override
	public void registerStudent(Student student) {
		SessionMath.mathEnrolledStudents.add(student);
	
	}


	@Override
	public int requestScore(Score score) {

		return score.getPoint();
	}
	
}
