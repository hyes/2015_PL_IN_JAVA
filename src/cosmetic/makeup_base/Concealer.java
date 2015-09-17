package cosmetic.makeup_base;

import cosmetic.skincare.SkinCare;


public class Concealer extends MakeUp{
	
	int numOfSpot; 
	public Concealer(SkinCare face, int i) {
		super(face);
		this.numOfSpot =i;
	}
	
	
	public void applying(){
		super.applying();
		System.out.print("ƒ¡Ω«∑Ø∏¶ " + numOfSpot + "±∫µ• ≈Â≈Â ∞®√Á¡÷∞Ì, ");
	}
}
