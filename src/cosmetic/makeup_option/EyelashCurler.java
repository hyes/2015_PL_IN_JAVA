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
			System.out.print("������ " + count  + "�� �� ������ �ø��� �����, ");
		} else if(count >= 3){
			System.out.print("������ " + count  + "�� ��� �ø��� �ְ�, ");
		} else if(count > 0){
			System.out.print("������ " + count  + "�� �밭 ����ְ�, ");
		} else {
			System.out.print("���� �ø��� ���ϰ� ��ŵ, ");
		}
	}
}
