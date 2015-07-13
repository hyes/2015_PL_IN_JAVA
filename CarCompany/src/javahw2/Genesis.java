package javahw2;

public class Genesis extends Car{
	
	private static int numberOfGenesis = 1;
	private int carId = 1;
	private static int price = 5000;
	
	public Genesis() {
		super();
		setupInfo();	
	}

	private void setupInfo() {
		this.carId = numberOfGenesis;
		numberOfGenesis++;
	}

	public int getNumberOfGenesis() {
		return numberOfGenesis;
	}

	public int getPrice() {
		return price;
	}

	public int getCarId() {
		return carId;
	}


	



	
}
