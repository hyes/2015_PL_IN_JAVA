package transportation;

public class Walking extends TransportationBasis {
	
	public Walking(String walk, String departure, String arrival){
		super(walk, departure, arrival, 0);
	}
	
	@Override
	public void getInfo() {
		super.getInfo();
		System.out.println(super.getDeparture() +"역에서 " + super.getArrival()+ "까지 걸어가는데 약 "+ this.getDuration() + "분 입니다.");
	}

	@Override
	public int getDuration() {
		return 15;
	}

	@Override
	public int getFare() {
		return 0;
	}

}
