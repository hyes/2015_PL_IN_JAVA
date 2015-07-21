package chapter7;


public class Excercise7_18 {

	public static void action(Robot temp){
		if(temp instanceof DanceRobot){
			DanceRobot d = (DanceRobot)temp;
			d.dance();
		}else if(temp instanceof SingRobot){
			SingRobot s = (SingRobot)temp;
			s.sing();
		}else if(temp instanceof DrawRobot){
			DrawRobot d = (DrawRobot)temp;
			d.draw();
		}
		
	}
	public static void main(String[] args) {
		Robot[] arr = {new DanceRobot(), new SingRobot(), new DrawRobot()};
		
		for(int i =0; i <arr.length; i++){
			action(arr[i]);
		}

	}

}

class Robot{}

class DanceRobot extends Robot{
	void dance(){
		System.out.println("춤을 춥니다 ");
	}
}
class SingRobot extends Robot{
	void sing(){
		System.out.println("노래를 불러요  ");
	}
}
class DrawRobot extends Robot{
	void draw(){
		System.out.println("그림을 그립니다 ");
	}
}