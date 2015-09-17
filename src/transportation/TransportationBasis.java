package transportation;

public class TransportationBasis {

	private String type;
	private String departure, arrival;
	private int duration, numOfStations;
	private int fare;
	
	
	public TransportationBasis(){
		
	}
	public TransportationBasis(String type, String departure, String arrival,
			int numOfStations) {
		this.type = type;
		this.departure = departure;
		this.arrival = arrival;
		this.numOfStations = numOfStations;
	}

	
	public TransportationBasis(String type){
		this.type = type;
	}
	
	public int getNumOfStations() {
		return numOfStations;
	}

	public String getType() {
		return type;
	}
	public String getDeparture() {
		return departure;
	}
	public void setDeparture(String departure) {
		this.departure = departure;
	}
	public String getArrival() {
		return arrival;
	}
	public void setArrival(String arrival) {
		this.arrival = arrival;
	}
	public int getDuration() {
		return duration; 
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public int getFare() {
		return fare;
	}
	public void setFare(int fare) {
		this.fare = fare;
	}

	public void getInfo() {
				
	}
	
}
