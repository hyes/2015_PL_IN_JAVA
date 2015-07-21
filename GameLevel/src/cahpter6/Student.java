package cahpter6;

public class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	public Student(){
		
	}
	public Student(String name, int ban, int no, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
	}
	public int getTotal(){
		int temp = kor + eng + math;
		return temp;
	}
	
	public float getAverage(){
		float temp = (float)this.getTotal()/(float)3;
		String average = String.format("%.1f", temp);
		return Float.parseFloat(average);
	}
	
	public String info(){
		
		return name + ", " + ban + ", " + no + ", "+ kor + ", "+  eng + "," + math + ", " + this.getTotal() + ", " + this.getAverage();
		
	}
	
}
