package housekeeping;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import mart.Item;
import util.Define;

public class AnalyzeReceipt {

	private int dairyTotal, fatTotal, fruitTotal, vegetableTotal, confectioneryTotal, cerealTotal, bakeryTotal, meatTotal, fishTotal, eggTotal, sweetnerTotal, spicesTotal, beverageTotal, etcTotal;
	private ArrayList<String> dairyList = new ArrayList<String>();
	private ArrayList<String> fatList = new ArrayList<String>();
	private ArrayList<String> fruitList = new ArrayList<String>();
	private ArrayList<String> vegetableList = new ArrayList<String>();
	private ArrayList<String> confectioneryList = new ArrayList<String>();
	private ArrayList<String> cerealList = new ArrayList<String>();
	private ArrayList<String> bakeryList = new ArrayList<String>();
	private ArrayList<String> meatList = new ArrayList<String>();
	private ArrayList<String> fishList = new ArrayList<String>();
	private ArrayList<String> eggList = new ArrayList<String>();
	private ArrayList<String> sweetnerList = new ArrayList<String>();
	private ArrayList<String> spicesList = new ArrayList<String>();
	private ArrayList<String> beverageList = new ArrayList<String>();
	private ArrayList<String> etcList = new ArrayList<String>();
	
	ItemTreeSet its = new ItemTreeSet();
	static ItemTypeTreeSet type = new ItemTypeTreeSet();
	
	public void analyze(File file) throws IOException {
			
			File tempFile = file;
			FileInputStream fis = new FileInputStream(tempFile);
			ObjectInputStream ois = new ObjectInputStream(fis);
			try {
								
				Item item1 = null;
				Item item2 = null;
				Item item3 = null;
				Item item4 = null;
				Item item5 = null;
				Item item6 = null;
				Item item7 = null;
				Item item8 = null;
				Item item9 = null;
				Item item10 = null;
				Item item11 = null;
				Item item12 = null;
//				Item item13 = null;
//				Item item14 = null;
				try {
						item1 = (Item) ois.readObject();
						item2 = (Item) ois.readObject();
						item3 = (Item) ois.readObject();
						item4 = (Item) ois.readObject();
						item5 = (Item) ois.readObject();
						item6 = (Item) ois.readObject();
						item7 = (Item) ois.readObject();
						item8 = (Item) ois.readObject();
						item9 = (Item) ois.readObject();
						item10 = (Item) ois.readObject();
						item11 = (Item) ois.readObject();
						item12 = (Item) ois.readObject();
//						item13 = (Item) ois.readObject();
//						item14 = (Item) ois.readObject();
						checkType(item1);
						checkType(item2);
						checkType(item3);
						checkType(item4);
						checkType(item5);
						checkType(item6);
						checkType(item7);
						checkType(item8);
						checkType(item9);
						checkType(item10);
						checkType(item11);
						checkType(item12);
//						checkType(item13);
//						checkType(item14);
						sumUp();
					
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}		
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					ois.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}	
		
		
		private void sumUp() {
			
			type.insertPerType(Define.DAIRY, dairyTotal, dairyList);
			type.insertPerType(Define.FAT_OIL, fatTotal, fatList);
			type.insertPerType(Define.FRUIT, fruitTotal, fruitList);
			type.insertPerType(Define.VEGETABLE, vegetableTotal, vegetableList);
			type.insertPerType(Define.CONFECTIONERY, confectioneryTotal, confectioneryList);
			type.insertPerType(Define.CEREAL, cerealTotal, cerealList);
			type.insertPerType(Define.BAKERY, bakeryTotal, bakeryList);
			type.insertPerType(Define.SWEETNER, sweetnerTotal, sweetnerList);
			type.insertPerType(Define.SPICES, spicesTotal, spicesList);
			type.insertPerType(Define.MEAT, meatTotal, meatList);
			type.insertPerType(Define.FISH, fishTotal, fishList);
			type.insertPerType(Define.BEVERAGE, beverageTotal, beverageList);
			type.insertPerType(Define.EGG, eggTotal, eggList);
			type.insertPerType(Define.ETC, etcTotal, etcList);
			
		}
	
	
		private void checkType(Item item) {
		
			switch (((Item)item).getType()) {
				case Define.DAIRY :
					dairyTotal += item.getPrice();
					dairyList.add(item.getName());
					its.insertItem(item);
					break;
				case Define.FAT_OIL :
					fatTotal += item.getPrice();
					fatList.add(item.getName());
					its.insertItem(item);
					break;
				case Define.FRUIT :
					fruitTotal += ((Item)item).getPrice();
					fruitList.add(((Item)item).getName());
					its.insertItem(item);
					break;
				case Define.VEGETABLE :
					vegetableTotal += ((Item)item).getPrice();
					vegetableList.add(((Item)item).getName());
					its.insertItem(item);
					break;
				case Define.CONFECTIONERY :
					confectioneryTotal += ((Item)item).getPrice();
					confectioneryList.add(((Item)item).getName());
					its.insertItem(item);
					break;
				case Define.CEREAL :
					cerealTotal += ((Item)item).getPrice();
					cerealList.add(((Item)item).getName());
					its.insertItem(item);
					break;
				case Define.BAKERY :
					bakeryTotal += ((Item)item).getPrice();
					bakeryList.add(((Item)item).getName());
					its.insertItem(item);
					break;
				case Define.MEAT :
					meatTotal += ((Item)item).getPrice();
					meatList.add(((Item)item).getName());
					its.insertItem(item);
					break;
				case Define.FISH :
					fishTotal += ((Item)item).getPrice();
					fishList.add(((Item)item).getName());
					its.insertItem(item);
					break;
				case Define.EGG :
					eggTotal += ((Item)item).getPrice();
					eggList.add(((Item)item).getName());
					its.insertItem(item);
					break;
				case Define.SWEETNER :
					sweetnerTotal += ((Item)item).getPrice();
					sweetnerList.add(((Item)item).getName());
					its.insertItem(item);
					break;
				case Define.SPICES :
					spicesTotal += ((Item)item).getPrice();
					spicesList.add(((Item)item).getName());
					break;
				case Define.BEVERAGE :
					beverageTotal += ((Item)item).getPrice();
					beverageList.add(((Item)item).getName());
					break;
				case Define.ETC :
					etcTotal += ((Item)item).getPrice();
					etcList.add(((Item)item).getName());
					its.insertItem(item);
					break;
				default:
					break;
			}
			
		}
		
		public void getInfo(){
			its.displayAll();
		}

		public static String getTotalCost() {
			return type.displayAll();
		}

	
}
