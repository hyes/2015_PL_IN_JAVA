package chapter7;

class MyTv2{
	private boolean isPowerOn;
	private int channel;
	private int volume;
	public int prev;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	

	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.prev = this.channel;
		this.channel = channel;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	public void gotoPrevChannel(){
		this.setChannel(prev);
	}
	
}

public class Excercise7_10and11 {

	public static void main(String[] args) {
		MyTv2 t = new MyTv2();
		
		t.setChannel(10);
		System.out.println("CH: "+t.getChannel());
		t.setVolume(20);
		System.out.println("VOL: "+t.getVolume());
		
		t.setChannel(20);
		System.out.println("CH: "+t.getChannel());
		
		t.gotoPrevChannel();
		System.out.println("CH: "+t.getChannel());
		
		t.gotoPrevChannel();
		System.out.println("CH: "+t.getChannel());
		
	}

}