package javahw2;

public class Sonata extends Car{
	
	private static int numberOfSonata = 1;
	private int carId = 1;
	private static int price = 3000;
	
	public Sonata() {
		super();
		setupInfo();	
	}

	private void setupInfo() {
		this.carId = numberOfSonata;
		numberOfSonata++;
	}

	public int getNumberOfGranduer() {
		return numberOfSonata;
	}

	public int getPrice() {
		return price;
	}

	public int getCarId() {
		return carId;
	}
	
}
