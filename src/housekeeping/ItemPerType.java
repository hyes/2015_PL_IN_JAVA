package housekeeping;

import java.util.ArrayList;
import java.util.Comparator;

public class ItemPerType implements Comparator<ItemPerType>{

	private String type;
	private int sum;
	private ArrayList<String> arrayList;
	private String listTemp = "";
	
	@Override
	public String toString() {
		if(sum != 0){
			for(int i =0; i<arrayList.size(); i++){
				String temp = arrayList.get(i);
				listTemp += temp + ", ";
			}
		}else if(sum == 0){
			return "";
		}
		return "\t** " + type  + "\n\t구분별 총계: " + sum  + "원\n\t내용: " +  listTemp + "\n\n" ;
	}
	public ItemPerType(){}
	public ItemPerType(String type, int sum, ArrayList<String> arrayList) {
		this.type = type;
		this.sum = sum;
		this.arrayList = arrayList;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public ArrayList<String> getArrayList() {
		return arrayList;
	}
	public void setArrayList(ArrayList<String> arrayList) {
		this.arrayList = arrayList;
	}
	@Override
	public int compare(ItemPerType o1, ItemPerType o2) {
		return ((String)o1.getType()).compareTo(((String)o2.getType()));
	}

}
