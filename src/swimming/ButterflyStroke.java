package swimming;

import util.Define;

public class ButterflyStroke extends SwimmingAbstract {
	int total;
	
	@Override
	public void swim() {
		total += Define.LAP;
		System.out.print("접영\t");
	}

	@Override
	public int getDistance() {
		System.out.println("접영 거리 총 : "+ total + "m");
		return total;
		
	}

}
