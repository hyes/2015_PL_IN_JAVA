package javahw2;

public class Granduer extends Car{
	
	private static int numberOfGranduer = 1;
	private int carId = 1;
	private static int price = 4000;
	
	public Granduer() {
		super();
		setupInfo();	
	}

	private void setupInfo() {
		this.carId = numberOfGranduer;
		numberOfGranduer++;
	}

	public int getNumberOfGranduer() {
		return numberOfGranduer;
	}

	public int getPrice() {
		return price;
	}

	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

}
