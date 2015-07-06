package hw1;

import java.util.Scanner;

public class BirthdayTest {

	public static void main(String[] args) {
		
			BirthDay bd1 = new BirthDay(2000, 2, 29);
			BirthDay bd2 = new BirthDay(2014, 7, 10);
			BirthDay bd3 = new BirthDay(2100, 2, 29);
			
		int year, month, day;
				
		while(true){
			Scanner scanner = new Scanner(System.in);
			System.out.println("몇 년? ");
			year = Integer.parseInt(scanner.next());
			
			System.out.println("몇 월?  ");
			month = Integer.parseInt(scanner.next());
			
			System.out.println("날짜는? ");
			day = Integer.parseInt(scanner.next());
			
			
			BirthDay birthDay = new BirthDay();
			birthDay.register(year, month, day);
		
		}
	}

}
