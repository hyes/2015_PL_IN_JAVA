package javahw2;

import java.util.ArrayList;

public class ReportPrice {
	private ArrayList<Car> tempCarList;
	private int totalPrice;
	
	
	public ReportPrice(CarCompany company) {
		tempCarList = company.getCarList();	
		calculate();
		
	}

	private void calculate() {
		
		for(int i = 0; i < tempCarList.size(); i++){
			totalPrice += tempCarList.get(i).getPrice();
		}
				
	}

	public void report() {
		System.out.println("회사가 가지고 있는 차의 총합: "+totalPrice + "만원");
	}
	
}
