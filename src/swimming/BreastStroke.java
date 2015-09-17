package swimming;

import util.Define;

public class BreastStroke extends SwimmingAbstract{
	
	int total;
	
	@Override
	public void swim() {
		total += Define.LAP;
		System.out.print("평영\t");
	}

	@Override
	public int getDistance() {
		System.out.println("평영 거리 총 : "+ total + "m");
		return total;
	}
	

}
