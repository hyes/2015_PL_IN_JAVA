package mart;

import java.io.Serializable;
import java.util.Comparator;

public class Item implements Serializable, Comparator<Item>{

	private String name;
	private String type;
	private int price;
	
	public Item(){}
	public Item(String name, String type, int price) {
		this.name = name;
		this.type = type;
		this.price = price;
	}
	
	@Override
	public String toString() {
	//	return "\t구분: " + type +  "\t가격: " + price  + "\t상품명: " + name  ;
		return "\t상품명: " + name  + "\t가격: " + price  + "\t구분: " + type    ;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public int compare(Item o1, Item o2) {
	
		return ((String)o1.getName()).compareTo((String)(o2.getName()));
		//return ((Integer)o1.getPrice()).compareTo((Integer)(o2.getPrice()));
	}
	
	
	
}
