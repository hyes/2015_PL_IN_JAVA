package transportation;

import java.util.ArrayList;

public class Transportation {
	
	private static int subwayFee, busFee;
	
	private ArrayList<TransportationBasis> route = new ArrayList<TransportationBasis>();

	public void addRoute(TransportationBasis t1){
		route.add(t1);
	}
	
	public void addRoute(TransportationBasis t1, TransportationBasis t2){
		route.add(t1);
		route.add(t2);
	}
	
	public void addRoute(TransportationBasis t1, TransportationBasis t2, TransportationBasis t3){
		route.add(t1);
		route.add(t2);
		route.add(t3);
	}
	
	public void addRoute(TransportationBasis t1, TransportationBasis t2, TransportationBasis t3, TransportationBasis t4){
		route.add(t1);
		route.add(t2);
		route.add(t3);
		route.add(t4);
	}
	
	public void getInfo() {
		TransportationBasis temp;
		
		for(int i=0; i< route.size(); i++){
			temp = route.get(i);
			
			if(temp instanceof SubwayLine2){
				SubwayLine2 sub2 = (SubwayLine2) temp;
				sub2.getInfo();
			}else if(temp instanceof SubwayNewBundang){
				SubwayNewBundang newBundang = (SubwayNewBundang) temp;
				newBundang.getInfo();
			}else if(temp instanceof Transfer){
				Transfer transfer = (Transfer) temp;
				transfer.getInfo();
			}else if(temp instanceof Walking){
				Walking walking = (Walking) temp;
				walking.getInfo();
			}else if(temp instanceof Bus620){
				Bus620 bus620 = (Bus620) temp;
				bus620.getInfo();
			}
		}
	}
	
	
	public void getSum() {
		TransportationBasis temp;
		
		 for(int i=0; i<route.size();i++){
			 temp = route.get(i);
				
				if(temp instanceof SubwayLine2){
					SubwayLine2 sub2 = (SubwayLine2) temp;
					subwayFee += sub2.getFare();
					System.out.println("\t" + temp.getType()  + ": " + temp.getDeparture() + "에서 "+temp.getArrival() + "까지 " + sub2.getFare() + "원");
				}else if(temp instanceof SubwayNewBundang){
					SubwayNewBundang newBundang = (SubwayNewBundang) temp;
					subwayFee += newBundang.getFare();
					System.out.println("\t" + temp.getType()  + ": " + temp.getDeparture() + "에서 "+temp.getArrival() + "까지 " + newBundang.getFare() + "원");
				}else if(temp instanceof Bus620){
					Bus620 bus620 = (Bus620) temp;
					busFee += bus620.getFare();
					System.out.println("\t" + temp.getType()  + ": " + temp.getDeparture() + "에서 "+temp.getArrival() + "까지 " + bus620.getFare() + "원 ");
				}
		 }
		
	}
	
	public static String getTodayTrafficFee(){
		 return "\n\t** \t교통비 \n\t지하철: " + subwayFee + "원 \n\t버스: " + busFee + "원 \n\n";
	}

	
	

	
}
