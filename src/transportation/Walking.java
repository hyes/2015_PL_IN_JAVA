package transportation;

public class Walking extends TransportationBasis {
	
	public Walking(String walk, String departure, String arrival){
		super(walk, departure, arrival, 0);
	}
	
	@Override
	public void getInfo() {
		super.getInfo();
		System.out.println(super.getDeparture() +"������ " + super.getArrival()+ "���� �ɾ�µ� �� "+ this.getDuration() + "�� �Դϴ�.");
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
