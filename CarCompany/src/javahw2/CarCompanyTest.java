package javahw2;

public class CarCompanyTest {

	public static void main(String[] args) {
		
		CarCompany company = CarCompany.getInstance();

		company.createCar(new Sonata());
		company.createCar(new Sonata());
		company.createCar(new Sonata());
		company.createCar(new Granduer());
		company.createCar(new Granduer());
		company.createCar(new Genesis());
		
		ReportPrice reportPrice = new ReportPrice(company);
		reportPrice.report();

	}

}
