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
		System.out.println("������ �����̴� ����ȭ�� ����~ ");
		
	}

	

}
