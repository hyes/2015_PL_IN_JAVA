package cosmetic.makeup_option;

import cosmetic.makeup_base.MakeUp;
import cosmetic.skincare.SkinCare;


public class LipLiner extends MakeUp{

	public LipLiner(SkinCare face) {
		super(face);
	}
	
	public void applying(){
		super.applying();
		System.out.print("립라이너를 그리고, ");
	}
}
