package cosmetic.makeup_base;

import cosmetic.skincare.SkinCare;


public class MakeUpBase extends MakeUp{

	int no; 
	public MakeUpBase(SkinCare face, int i) {
		super(face);
		this.no =i;
	}
	
	
	public void applying(){
		super.applying();
		System.out.print(no + "ȣ ����ũ�����̽��� ��ٸ���, ");
	}
	
}
