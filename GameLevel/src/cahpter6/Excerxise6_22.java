package cahpter6;

public class Excerxise6_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "123";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
		
		str = "1234o";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
	}

	private static boolean isNumber(String str) {

		    try{
		       Integer.parseInt(str);
		    }catch(NumberFormatException e){
		      return false;
		    }
		    return true;

	}

}
