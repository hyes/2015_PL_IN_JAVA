package morning;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class MorningRoutine {
	
	private float weight = 80.0f;
	private float diff;
	
	public MorningRoutine(){
		getUp();
		weighIn();
	}
	
	public void getUp(){
		  Date now = new Date( );
	      SimpleDateFormat sdf1 = new SimpleDateFormat ("yyyy.MM.dd E");
	      SimpleDateFormat sdf2 = new SimpleDateFormat ("a hh'��' mm'��'");
	      System.out.print("������ " + sdf1.format(now)+ "�����̰�, " );
	      System.out.println("���� �Ͼ �ð��� " + sdf2.format(now) +" �Դϴ�. " );
	}
	
	public void weighIn(){
		 Random random = new Random();
		 diff = (float) Math.round(random.nextFloat()*100  - 50) / 100;
		 weight += diff;
		 System.out.print("���� ü���� "+ weight + "kg!!");

		 if(diff > 0){
			 System.out.println("�������� "+ diff + "kg �ȴ� �Ⱦ� ");
		 }else if(diff < 0 ){
			 System.out.println("�������� "+ diff + "kg ������~~~!! ����~");
		 }else if(diff == 0){
			 System.out.println("��- ü�� ����!! ����!");
		 }
	}
	
	
}
