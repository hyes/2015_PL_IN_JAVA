package chapter7;

class SutdaCard2 {
	private int num;
	private boolean isKwang;
	
	public SutdaCard2() {
		this(1, true);
	}

	public SutdaCard2(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	public String info() {
		
		return num + (isKwang ? "K" : "");
	}

}

public class Excercise7_14 {

	public static void main(String[] args) {
	 SutdaCard2 card = new SutdaCard2(1, true);
	

	}

}
