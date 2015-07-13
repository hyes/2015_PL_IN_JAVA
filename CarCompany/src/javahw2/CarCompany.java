package javahw2;

import java.util.ArrayList;

public class CarCompany {
	private static CarCompany company = new CarCompany();

	private ArrayList<Car> carList = new ArrayList<Car>(); 
	
	public static CarCompany getInstance() {
		
		if(company == null){
			company = new CarCompany();
		}
		
		return company;
	}
	
	public void createCar(Car car){
		carList.add(car);
	}
	
	public ArrayList<Car> getCarList(){
		return carList;
	}

}
