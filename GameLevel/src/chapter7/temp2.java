package chapter7;

class Parent{
	
	int x =100;
	
	Parent(){
		this(200);
		System.out.println("1");
	}
	
	Parent(int x){
		this.x=x;
		System.out.println("2");
	}
	
	int getX(){
		return x;
	}
}

class Child extends Parent{
int x =3000;
	
	Child(){
		this(1000);
		System.out.println("3");
	}
	
	Child(int x){
		this.x=x;
		System.out.println("4");
	}
	
}
public class temp2 {

	public static void main(String[] args) {
		
		Child d = new Child();
		System.out.println(d.getX()+ "," + d.x);
	}

}