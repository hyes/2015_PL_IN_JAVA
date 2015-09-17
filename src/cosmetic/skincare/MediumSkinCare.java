package cosmetic.skincare;

public class MediumSkinCare extends SkinCare{

	@Override
	public void applying() {
		description();
		toner();
		serum();
		moistureCream();
		facialOil();
		sunscreen();
		System.out.println();
	}

	@Override
	public void description() {
		System.out.println("적당히 공들이는 기초화장 시작~ ");
		
	}

	

}
