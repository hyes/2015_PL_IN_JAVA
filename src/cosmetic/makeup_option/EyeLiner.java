package cosmetic.makeup_option;

import cosmetic.makeup_base.MakeUp;
import cosmetic.skincare.SkinCare;


public class EyeLiner extends MakeUp{

	int depth; 
	public EyeLiner(SkinCare face, int i) {
		super(face);
		this.depth =i;
	}
	
	
	public void applying(){
		super.applying();
		System.out.print("���̶��̳ʸ� " + depth  + "mm �β��� �׸���, ");
	}
}
