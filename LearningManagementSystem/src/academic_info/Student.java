package academic_info;

import java.util.ArrayList;

import sessions.Session;
import sessions.SessionEnglish;
import sessions.SessionMath;

public class Student {

	private String name;
	private String major;
	private int studentId;
	private ArrayList<Session> enrolledSessions = new ArrayList<Session>();
	private Score scoreMath, scoreEng;
	
	
	public Student(String name, int studentId, String major) {
		this.name = name;
		this.studentId = studentId;
		this.major = major;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	public ArrayList<Session> getEnrolledSessions() {
		
		return enrolledSessions;
	}
	
	public void enroll(Session session){
		this.enrolledSessions.add(session);
		
		if(session instanceof SessionMath){
			SessionMath math = (SessionMath) session;
			math.registerStudent(this);
			
		}else if(session instanceof SessionEnglish){
			SessionEnglish eng = (SessionEnglish) session;
			eng.registerStudent(this);
		}
	}

	
	public Score getScore(Session session) {
		Score score = new Score();
		if(session.getSessionId().equals("수학")){
			score = scoreMath;
		}else if(session.getSessionId().equals("영어")){
			score = scoreEng;
		}
		return score;
	}

	public void setScoreInfo(Session session, Score score) {
		
		if(session.getSessionId().equals("수학")){
			this.scoreMath = score;
		}else if(session.getSessionId().equals("영어")){
			this.scoreEng = score;
		}
		
	}
	
	
}
