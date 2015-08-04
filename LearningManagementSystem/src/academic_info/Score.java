package academic_info;

import sessions.Session;


public class Score {
	
	private int studentId;
	private String sessionId;
	private int point;

	public void save(Session session, Student student, int point) {
		this.sessionId = session.getSessionId();
		this.studentId = student.getStudentId();
		this.point = point;
	}

	public int getPoint() {
		return this.point;		
	}
	
	
}
