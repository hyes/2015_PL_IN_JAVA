package cosmetic.makeup_option;

import cosmetic.makeup_base.MakeUp;
import cosmetic.skincare.SkinCare;


public class Mascara extends MakeUp{

	int count; 
	public Mascara(SkinCare face, int i) {
		super(face);
		this.count =i;
	}
	
	
	public void applying(){
		super.applying();
		System.out.print("마스카라는 " + count  + "번 덧바르고, ");
	}
}
