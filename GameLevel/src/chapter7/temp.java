package chapter7;

class Product{
	int price;
	int bonus;
	
	Product(int price){
		this.price = price;
		bonus = (int)(price/10.0);
	}
	Product(){}
	
}

class Tv extends Product{
	Tv(){
	
	}
	
	public String toString(){
		return "tv";
	}
}
public class temp {

	public static void main(String[] args) {
		Tv t = new Tv();
		

	}

}