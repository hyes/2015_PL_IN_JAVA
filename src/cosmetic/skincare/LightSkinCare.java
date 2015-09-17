package cosmetic.skincare;

public class LightSkinCare extends SkinCare{

	@Override
	public void applying() {
		description();
		toner();
		lotion();
		System.out.println();
	}

	@Override
	public void description() {
		System.out.println("아주 가볍게 기초화장 ~ ");
		
	}

	

}
