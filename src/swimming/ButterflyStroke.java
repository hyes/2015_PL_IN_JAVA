package swimming;

import util.Define;

public class ButterflyStroke extends SwimmingAbstract {
	int total;
	
	@Override
	public void swim() {
		total += Define.LAP;
		System.out.print("����\t");
	}

	@Override
	public int getDistance() {
		System.out.println("���� �Ÿ� �� : "+ total + "m");
		return total;
		
	}

}
