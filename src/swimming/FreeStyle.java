package swimming;

import util.Define;

public class FreeStyle extends SwimmingAbstract {
	int total;
	
	@Override
	public void swim() {
		total += Define.LAP;
		System.out.print("자유형\t");
	}

	@Override
	public int getDistance() {
		System.out.println("자유형 거리 총 : "+ total + "m");
		return total;
		
	}

}
