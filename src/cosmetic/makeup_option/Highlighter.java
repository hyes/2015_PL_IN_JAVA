package cosmetic.makeup_option;

import cosmetic.makeup_base.MakeUp;
import cosmetic.skincare.SkinCare;


public class Highlighter extends MakeUp{

	String color; 
	public Highlighter(SkinCare face) {
		super(face);
}
	
	
	public void applying(){
		super.applying();
		System.out.print("���̶����ͷ� ������! ");
	}
}
