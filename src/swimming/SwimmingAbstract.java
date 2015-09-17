package swimming;

public abstract class SwimmingAbstract {
	
	
	public abstract void swim();
	public abstract int getDistance();
	
	private static int total;

	public static void stopSwimming(SwimmingAbstract a) {
		
		System.out.println();
		total = a.getDistance();
		System.out.println("���� ������ �Ÿ��� �� " + total + "m-! ¦¦ ");
		wrapUp();
	}
	
	
	public static void stopSwimming(SwimmingAbstract a, SwimmingAbstract b) {
		
		System.out.println();
		total = a.getDistance() + b.getDistance();
		System.out.println("���� ������ �Ÿ��� �� " + total + "m-! ¦¦ ");
		wrapUp();
	}
	
	public static void stopSwimming(SwimmingAbstract a, SwimmingAbstract b, SwimmingAbstract c) {
		
		System.out.println();
		total = a.getDistance() + b.getDistance() + c.getDistance();
		System.out.println("���� ������ �Ÿ��� �� " + total + "m-! ¦¦ ");
		wrapUp();
	}
	
	public static void stopSwimming(SwimmingAbstract a, SwimmingAbstract b, SwimmingAbstract c, SwimmingAbstract d) {
		
		System.out.println();
		total = a.getDistance() + b.getDistance() + c.getDistance() + d.getDistance();
		System.out.println("���� ������ �Ÿ��� �� " + total + "m-! ¦¦ ");
		wrapUp();
	}
	
	private static void wrapUp(){
		wash();
		dehydrate();
		dryHair();
		dressUp();
	}
	
	private static void dressUp() {
		System.out.println("���� �Դ´�.");
		
	}
	
	private static void dryHair() {
		System.out.print("����� �ž� �Ӹ��� ������~ ");
		
	}
	
	private static void dehydrate() {
		System.out.print("������ Ż��~ ŻŻ " );
		
	}
	
	private static void wash() {
		System.out.print("�����ϰ�~ ");
	}
	
}
