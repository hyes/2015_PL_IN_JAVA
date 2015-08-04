package academic_info;

import java.util.ArrayList;

import IScoringCalc.IScoring;
import IScoringCalc.MajorCalc;
import IScoringCalc.NonMajorCalc;
import sessions.Session;

public class Report {

	private ArrayList<Student> studentList;
	private ArrayList<Session> sessionList;
	private IScoring scoring;
	
	public Report(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}

	public void report() {
		
		printFormat();
		Student student;
		for(int i=0; i< studentList.size(); i++){
			student = studentList.get(i);
			studentInfo(student);
			calcCredit(student);
		}
	}

	private void printFormat() {
		System.out.print("NAME" + "\t" + "ID" + "\t" + "MAJOR" + "\t" + "수학" + "\t" + "영어" + "\n") ;
	}

	private void studentInfo(Student student) {
		System.out.print(student.getName() + "\t" + student.getStudentId() + "\t" +  student.getMajor() + "\t") ;
	}

	private void calcCredit(Student student) {
			sessionList = student.getEnrolledSessions();
			for(int j=0; j< sessionList.size(); j++){
				Session session = sessionList.get(j);
				Score score = student.getScore(session);
				
				int tempScore = session.requestScore(score);
				String credit;	
					if(student.getMajor().equals(session.getSessionId())){
						scoring = new MajorCalc();
						credit = scoring.clacAverage(tempScore);
						System.out.print(credit + "\t");
				
					}else{
						scoring = new NonMajorCalc();
						credit = scoring.clacAverage(tempScore);
						System.out.print(credit + "\t");
					}
			}
			System.out.print("\n");
		}
}
	
	



