package chapter7;

class SutdaDeck{
	final int CARD_NUM =20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	public SutdaDeck(){
		int j =1;
		for(int i = 0; i < 20; i++){
			if(j <= 10){
				if(i == 0 || i == 2 || i == 7){
					cards[i] = new SutdaCard(j++, true);
				}else{
					cards[i] = new SutdaCard(j++, false);
				}
			}else{
				j = 1;
				cards[i] = new SutdaCard(j++, false);
			}
		}
	}
	
	public void shuffle(){
		
		for(int i =0; i <  CARD_NUM; i++){
			int a = (int) (Math.random()*8)+1;
			SutdaCard temp = cards[i];
			cards[i] =cards[a];
			cards[a] = temp;	
		}
	
	}
	
	public SutdaCard pick(int index){
		
		
		return cards[index];
	}
	
	public SutdaCard pick(){
		int a = (int) (Math.random()*9)+1;
		
		return cards[a];
	}
}

class SutdaCard {

	int num;
	boolean isKwang;
	
	SutdaCard(){
		this(1, true);
	}
	
	SutdaCard(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	public String toString(){
		return num + (isKwang ? "K":"");
	}
}


public class Excercise_7_1and2 {

	public static void main(String args[]){
		SutdaDeck deck = new SutdaDeck();
		
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		
		for(int i=0; i<deck.cards.length; i++){
			System.out.print(deck.cards[i]+", ");
		}
		System.out.println();
		System.out.println(deck.pick(0));
	}
}
