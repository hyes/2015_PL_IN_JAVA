package cahpter6;

public class Excercise6_24 {

	public static int abs(int value) {
		int result = value;
		if(value < 0){
			result = value*(-1);
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		int value = 5;
		System.out.println(value + "의 절대값 :"+ abs(value));
		value = -10;
		System.out.println(value + "의 절대값 :"+ abs(value));

	}

}
