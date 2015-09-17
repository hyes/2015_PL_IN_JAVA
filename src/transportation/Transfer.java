package transportation;

public class Transfer extends TransportationBasis {
	
	public Transfer() {
		
	}
		
	@Override
	public void getInfo() {
		System.out.println("환승하는데 걸리는 시간은 약 "+ this.getDuration() + "분 입니다.");
	}

	@Override
	public int getDuration() {
		return 10;
	}

	@Override
	public int getFare() {
		return 0;
	}

}
