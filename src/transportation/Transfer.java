package transportation;

public class Transfer extends TransportationBasis {
	
	public Transfer() {
		
	}
		
	@Override
	public void getInfo() {
		System.out.println("ȯ���ϴµ� �ɸ��� �ð��� �� "+ this.getDuration() + "�� �Դϴ�.");
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
