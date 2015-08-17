package findingpath;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class DirectionSetting {
	
	private static DirectionSetting instance = new DirectionSetting();
	
	public static DirectionSetting getInstance(){
			
		if(instance == null){
			instance = new DirectionSetting();
		}	
		return instance;
	}
	
	public String setting(String fileName, String attr) throws IOException{
		Properties prop = new Properties();
		FileInputStream  file = new FileInputStream(fileName);
		prop.load(file);
		String directions = prop.getProperty(attr);
		System.out.println("==================== DIRECTION 설정 : "+ directions + " ===================\n");
		return directions;
	}
	
	
}
