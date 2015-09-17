package mart;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;


public class SmallMart {

	private static SmallMart smallMart = new SmallMart();
	
	public HashMap<String, Item> items;
	
	private  SmallMart(){
		this(10);
	}
	
	public SmallMart(int size){
		items = new HashMap<String, Item>(size);
	}
	
	public static SmallMart getInstance(){
		if(smallMart == null){
			smallMart = new SmallMart();
		}
		return smallMart;
	}
	
	public void insertItem(String name, String type, int price){
		Item item = new Item(name, type, price);
		items.put(name, item);
	}

	public void showStock() {
		
		System.out.println();
		System.out.println("--------------------- 재고 안내 ----------------------");
		Iterator<String> ir = items.keySet().iterator();
		while(ir.hasNext()){
			System.out.println(items.get(ir.next())+"\t");
		}
		System.out.println("----------------------------------------------------");
		
	}

	public int calculate(String[] list) {
		
		int total = 0;
		ArrayList<String> nostock = new ArrayList<String>();
		for(int i=0; i< list.length; i++){
				
			if(items.containsKey(list[i])){
				Item temp = items.get(list[i]);
				total += temp.getPrice();
				
			}else{
				nostock.add(list[i]);
			}
		}
		
		if(!(nostock.size() == 0)){
			noStockAlert(nostock);
		}
		
		if(total > 0){
			makingReceipt(list, total, nostock.size());
		}
				
		return total;	
	}

	private void makingReceipt(String[] list, int total, int nostockSize) {
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
	
		try {
			fos = new FileOutputStream("serial.dat");
			oos = new ObjectOutputStream(fos);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		FileWriter fw = null;
		try {
			fw = new FileWriter("receipt.txt", true);
			fw.write("품명  \t  가격  \t  구분 \n");
			fw.write("===============================================\n");
			for(int i=0; i< list.length; i++){
				
				if(items.containsKey(list[i])){
					Item temp = items.get(list[i]);
					oos.writeObject(temp);
					fw.write(temp.getName() + "\t " + temp.getPrice() +  "\t" + temp.getType() + "\n");
				}
			}
			fw.write("===============================================\n");
			fw.write("TOTAL(총 "+ (list.length - nostockSize) +"개 상품)\n");
			fw.write(" :  " +total+" 원 \n");
			fw.write("===============================================\n");
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				fw.close();
				oos.close();
				System.out.println();
				System.out.println("receipt.txt로 영수증이 발행되었습니다. ");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private void noStockAlert(ArrayList<String> nostock) {
		
		System.out.println("\n\n아래 재고 없는 상품 제외");
		for(int i=0; i< nostock.size(); i++){
			System.out.print(nostock.get(i) + " " );
		}
		System.out.println();
		
	}
	
}
	
	


