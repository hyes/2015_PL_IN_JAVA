package cahpter6;

public class Excercise6_7 {
	
	public static void main(String args[]){
		MyPoint p = new MyPoint(1,1);
		System.out.println(p.getDistance(2,2));
	}
	
}

class MyPoint{
	int x;
	int y;
	
	MyPoint(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public double getDistance(int x1, int y1){
		return Math.sqrt(Math.pow(Math.abs(x1-x), 2) + Math.pow(Math.abs(y1-y), 2));
	}
}