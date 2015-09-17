package cosmetic.makeup_option;

import cosmetic.makeup_base.MakeUp;
import cosmetic.skincare.SkinCare;


public class LipColor extends MakeUp{

	String color; 
	public LipColor(SkinCare face, String color) {
		super(face);
		this.color = color;
	}
	
	
	public void applying(){
		super.applying();
		System.out.print("립 컬러는 " + color +  ", ");
	}
}
