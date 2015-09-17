package swimming;

public abstract class SwimmingAbstract {
	
	
	public abstract void swim();
	public abstract int getDistance();
	
	private static int total;

	public static void stopSwimming(SwimmingAbstract a) {
		
		System.out.println();
		total = a.getDistance();
		System.out.println("¿À´Ã ¼ö¿µÇÑ °Å¸®´Â ÃÑ " + total + "m-! Â¦Â¦ ");
		wrapUp();
	}
	
	
	public static void stopSwimming(SwimmingAbstract a, SwimmingAbstract b) {
		
		System.out.println();
		total = a.getDistance() + b.getDistance();
		System.out.println("¿À´Ã ¼ö¿µÇÑ °Å¸®´Â ÃÑ " + total + "m-! Â¦Â¦ ");
		wrapUp();
	}
	
	public static void stopSwimming(SwimmingAbstract a, SwimmingAbstract b, SwimmingAbstract c) {
		
		System.out.println();
		total = a.getDistance() + b.getDistance() + c.getDistance();
		System.out.println("¿À´Ã ¼ö¿µÇÑ °Å¸®´Â ÃÑ " + total + "m-! Â¦Â¦ ");
		wrapUp();
	}
	
	public static void stopSwimming(SwimmingAbstract a, SwimmingAbstract b, SwimmingAbstract c, SwimmingAbstract d) {
		
		System.out.println();
		total = a.getDistance() + b.getDistance() + c.getDistance() + d.getDistance();
		System.out.println("¿À´Ã ¼ö¿µÇÑ °Å¸®´Â ÃÑ " + total + "m-! Â¦Â¦ ");
		wrapUp();
	}
	
	private static void wrapUp(){
		wash();
		dehydrate();
		dryHair();
		dressUp();
	}
	
	private static void dressUp() {
		System.out.println("¿ÊÀ» ÀÔ´Â´Ù.");
		
	}
	
	private static void dryHair() {
		System.out.print("µå¶óÀÌ ¾Å¾Å ¸Ó¸®¸¦ ¸»¸®°í~ ");
		
	}
	
	private static void dehydrate() {
		System.out.print("¼ö¿µº¹ Å»¼ö~ Å»Å» " );
		
	}
	
	private static void wash() {
		System.out.print("»þ¿öÇÏ°í~ ");
	}
	
}
