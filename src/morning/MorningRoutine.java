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
	      SimpleDateFormat sdf2 = new SimpleDateFormat ("a hh'시' mm'분'");
	      System.out.print("오늘은 " + sdf1.format(now)+ "요일이고, " );
	      System.out.println("오늘 일어난 시간은 " + sdf2.format(now) +" 입니다. " );
	}
	
	public void weighIn(){
		 Random random = new Random();
		 diff = (float) Math.round(random.nextFloat()*100  - 50) / 100;
		 weight += diff;
		 System.out.print("오늘 체중은 "+ weight + "kg!!");

		 if(diff > 0){
			 System.out.println("어제보다 "+ diff + "kg 쪘다 쪘어 ");
		 }else if(diff < 0 ){
			 System.out.println("어제보다 "+ diff + "kg 빠졌다~~~!! 유후~");
		 }else if(diff == 0){
			 System.out.println("오- 체중 유지!! 성공!");
		 }
	}
	
	
}
