package transportation;

public class SubwayNewBundang extends TransportationBasis {
	
	public SubwayNewBundang(String type, String departure, String arrival,
			int numOfStations) {
		super(type, departure, arrival, numOfStations);
	}
	
	@Override
	public void getInfo() {
		super.getInfo();
		System.out.println(super.getDeparture() +"������ " + super.getArrival()+ "���� �ҿ�ð��� �� "+ this.getDuration() + "�� �Դϴ�.");
	}

	@Override
	public int getDuration() {
		return super.getNumOfStations() * 3;
	}

	@Override
	public int getFare() {
		return 2250;
	}

}
