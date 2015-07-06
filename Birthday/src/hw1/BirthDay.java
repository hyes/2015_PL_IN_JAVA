package hw1;

public class BirthDay {

	public BirthDay(){}
	
	public BirthDay(int year, int month, int day) {
		
		checkLeapYear(year, month, day);
	}

	public void register(int year, int month, int day) {
	
		checkLeapYear(year, month, day);
	
	}
	
	private void checkLeapYear(int year, int month, int day) {
		
		if(year % 100 == 0){
			if(year % 400 == 0){
				checkLeapMonth(year, month, day);
			}else{
				checkValidDate(year, month, day);
			}
		}else if(year % 4 == 0){
			checkLeapMonth(year, month, day);
		}else{
			checkValidDate(year, month, day);
		}
		
	}
	
	private void checkLeapMonth(int year, int month, int day) {
		
		if(month == 2){
			if(day >= 1 || day <= 29){
				printValid(year, month, day);
			}else{
				printInvalid(year, month, day);
			}
		}else{
			checkValidDate(year, month, day);
		}
		
	}
	
	private void checkValidDate(int year, int month, int day) {
		
		if(month >= 13 || month <= 0){
			printInvalid(year, month, day);
		}else if(month == 2){
			if(day >= 1 && day <=28){
				printValid(year, month, day);
			}else{
				printInvalid(year, month, day);
			}
		}else if(month == 4 || month == 6 || month == 9 || month == 11){
			if(day >= 1 && day <=30){
				printValid(year, month, day);
			}else{
				printInvalid(year, month, day);
			}	
		}else if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
			if(day >= 1 && day <=31){
				printValid(year, month, day);
			}else{
				printInvalid(year, month, day);
			}
		}else{
			printInvalid(year, month, day);
		}
		
	}
	
	private void printValid(int year, int month, int day) {
	
		System.out.println(year + "년 "+ month + "월 " + day +"일 유효함 ");
	}

	private void printInvalid(int year, int month, int day) {

		System.out.println(year + "년 "+ month + "월 " + day +"일 유효하지 않음 ");
	}

}
