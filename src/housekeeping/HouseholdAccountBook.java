package housekeeping;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;

import mart.Item;

public class HouseholdAccountBook {

	private static HouseholdAccountBook book = new HouseholdAccountBook();
	
	private StringBuffer sb = new StringBuffer();
	private BufferedWriter bwr;
	private BufferedReader bre;
	
	public static HouseholdAccountBook getInstance(){
		if(book == null){
			book = new HouseholdAccountBook();
		}
		return book;
	}


	public void write(String contents) {
		sb.append(contents + "\n");
	}
	
	public void write(File file) throws IOException {
	
		File tempFile = file;
		//sb.append(totalFee + "\n");
		try {
			//bre = new BufferedReader(new FileReader(tempFile));
			
			FileInputStream fis = new FileInputStream(tempFile);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			
//			while( != null){
//				
//				if(bre.readLine().contains(Define.DAIRY)){
//					System.out.println("we312e");
//					
//					try {
						Item item = null;
						try {
							item = (Item) ois.readObject();
						} catch (ClassNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.println("SERIALIZATION" + ((Item)item).getType());
						Item item1 = null;
						try {
							item1 = (Item) ois.readObject();
						} catch (ClassNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.println("SERIALIZATION" + ((Item)item1).getType());
						
//					} catch (ClassNotFoundException e) {
//						e.printStackTrace();
//					}
//				}
//				
//				System.out.println("!!" + bre.readLine());
//				

			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//bre.close();
			
		}
	}
	
	

	public void report(){
		 try {
			bwr = new BufferedWriter(new FileWriter(new File("daily.txt")));
			bwr.append(sb.toString());
			System.out.println("\ndaily.txt에 오늘 지출 금액 정리끝!");
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bwr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

