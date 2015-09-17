package cosmetic.makeup_base;

import cosmetic.skincare.SkinCare;


public class MakeUp extends SkinCare{

	SkinCare baseFace;
	
	public MakeUp(SkinCare face){
		this.baseFace = face;
	}

	@Override
	public void applying() {
		baseFace.applying();
	}

	@Override
	public void description() {
		baseFace.description();
	}
}
