package housekeeping;

import java.util.Iterator;
import java.util.TreeSet;

import mart.Item;

public class ItemTreeSet {

	public TreeSet<Item> lists;
	
	public ItemTreeSet(){
		this(10);
	}
	
	public ItemTreeSet(int size){
		lists = new TreeSet<Item>(new Item());
	}	
	
	public void insertItem(Item item){
		lists.add(item);
	}
	
	public void displayAll(){
			
			Iterator ir = lists.iterator();
			while(ir.hasNext()){
				System.out.println(ir.next());
			}
//			System.out.println("!!!!!iterator");
//			System.out.println(lists);
	}
}
