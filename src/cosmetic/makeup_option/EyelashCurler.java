package cosmetic.makeup_option;

import cosmetic.makeup_base.MakeUp;
import cosmetic.skincare.SkinCare;


public class EyelashCurler extends MakeUp{

	int count; 
	public EyelashCurler(SkinCare face, int i) {
		super(face);
//		if(i < 0){
//			!!
//		}
		this.count =i;
		
	}
	
	
	public void applying(){
		super.applying();
		
		if(count >=5 ){
			System.out.print("´«½çÀ» " + count  + "¹ø Âó¾î¼­ ¾ÆÂñÇÑ ÄÃ¸µÀ» ¸¸µé°í, ");
		} else if(count >= 3){
			System.out.print("´«½çÀ» " + count  + "¹ø Âó¾î ÄÃ¸µÀ» ÁÖ°í, ");
		} else if(count > 0){
			System.out.print("´«½çÀ» " + count  + "¹ø ´ë°­ Âó¾îÁÖ°í, ");
		} else {
			System.out.print("´«½ç ÄÃ¸µÀº ÄğÇÏ°Ô ½ºÅµ, ");
		}
	}
}
