package cosmetic.makeup_option;

import cosmetic.makeup_base.MakeUp;
import cosmetic.skincare.SkinCare;


public class EyeShadow extends MakeUp{

	String color; 
	public EyeShadow(SkinCare face, String color) {
		super(face);
		this.color = color;
	}
	
	
	public void applying(){
		super.applying();
		System.out.print(color  + "»ö ¼¨µµ, ");
	}
}
