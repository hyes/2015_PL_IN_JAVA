package cosmetic.skincare;

public abstract class SkinCare {

	public abstract void applying();
	
	public abstract void description();
	
	public void toner(){
		System.out.print(" 토너 ");
	}
	public void essence(){
		System.out.print(" 에센스 ");
	}
	public void serum(){
		System.out.print(" 세럼 ");
	}
	public void emulsion(){
		System.out.print(" 에멀젼 ");
	}
	public void eyeCream(){
		System.out.print(" 아이크림 ");
	}
	public void lotion(){
		System.out.print(" 로션 ");
	}
	public void cream(){
		System.out.print(" 크림 ");
	}
	public void antiWrinkleCream(){
		System.out.print(" 주름개선크림 ");
	}
	public void ageDefyingCream(){
		System.out.print(" 노화방지크림 ");
	}
	public void moistureCream(){
		System.out.print(" 수분크림 ");
	}
	public void facialOil(){
		System.out.print(" 훼이셜오일 ");
	}
	public void sunscreen(){
		System.out.print(" 선크림 ");
	}

}
