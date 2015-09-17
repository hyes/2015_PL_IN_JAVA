package cosmetic.skincare;

public class HeavySkinCare extends SkinCare{

	@Override
	public void applying() {
		
		description();
		
		toner();
		essence();
		serum();
		emulsion();
		eyeCream();
		lotion();
		antiWrinkleCream();
		ageDefyingCream();
		moistureCream(); 
		facialOil();
		sunscreen();
		System.out.println();
	}

	@Override
	public void description() {
		System.out.println("완전완전 공들인 기초화장 시작~ ");
		
		
	}

	

}
