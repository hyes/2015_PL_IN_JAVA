package sessions;

import java.util.ArrayList;

import academic_info.Score;
import academic_info.Student;

public abstract class Session {
	
	public abstract String getSessionId();
	public abstract ArrayList<Student> getEnrolledStudentList();
	public abstract void registerStudent(Student student);
	public abstract int requestScore(Score score);
	
	public final static void evaluate(Score score, Session session, Student student, int point){
		score.save(session, student, point);
		student.setScoreInfo(session, score);
	}


}
