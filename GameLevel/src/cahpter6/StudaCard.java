package cahpter6;
	

public class StudaCard {
	int num;
	boolean isKwang;
	
	public StudaCard() {
		this.num = 1;
		this.isKwang = true;
	}

	public StudaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	public String info() {
		
		String info;
		if(isKwang == true){
			info = num + "K";
		}else{
			info = num + "";
		}
		return info;
	}
	
	
}

