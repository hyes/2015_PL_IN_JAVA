package housekeeping;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class ItemTypeTreeSet {

	public TreeSet<ItemPerType> typeList;
	private static String sb = "";
	
	public ItemTypeTreeSet(){
		this(20);
	}
	
	public ItemTypeTreeSet(int size){
		typeList = new TreeSet<ItemPerType>(new ItemPerType());
	}	
	
	public void insertPerType(String type, int sum, ArrayList<String> list){
		ItemPerType itemType = new ItemPerType(type, sum, list);
		typeList.add(itemType);
	}
	
	public String displayAll(){
			
			Iterator ir = typeList.iterator();
			while(ir.hasNext()){
//				System.out.println(ir.next());
					sb += ir.next();
			}
			
			return sb;

	}
}
