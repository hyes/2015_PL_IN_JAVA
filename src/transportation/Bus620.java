package transportation;

public class Bus620 extends TransportationBasis {
	
	public Bus620(String type, String departure, String arrival,
			int numOfStations) {
		super(type, departure, arrival, numOfStations);
	}
	
	@Override
	public void getInfo() {
		super.getInfo();
		System.out.println(super.getDeparture() +"역에서 " + super.getArrival()+ "까지 버스타고 약 "+ this.getDuration() + "분 입니다.");
	}

	@Override
	public int getDuration() {
		return super.getNumOfStations() * 1;
	}

	@Override
	public int getFare() {
		return 1000;
	}

}
