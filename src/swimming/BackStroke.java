package swimming;

import util.Define;

public class BackStroke extends SwimmingAbstract{
	
	int total;
	
	@Override
	public void swim() {
		total += Define.LAP;
		System.out.print("배영\t");
	}

	@Override
	public int getDistance() {
		System.out.println("배영 거리 총 : "+ total + "m");
		return total;
	}
	

}
