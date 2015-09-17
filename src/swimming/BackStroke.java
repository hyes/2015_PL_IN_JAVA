package swimming;

import util.Define;

public class BackStroke extends SwimmingAbstract{
	
	int total;
	
	@Override
	public void swim() {
		total += Define.LAP;
		System.out.print("�迵\t");
	}

	@Override
	public int getDistance() {
		System.out.println("�迵 �Ÿ� �� : "+ total + "m");
		return total;
	}
	

}
