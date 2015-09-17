import java.io.File;
import java.io.IOException;

import housekeeping.AnalyzeReceipt;
import housekeeping.HouseholdAccountBook;
import mart.Cart;
import mart.SmallMart;
import morning.MorningRoutine;
import swimming.BackStroke;
import swimming.BreastStroke;
import swimming.ButterflyStroke;
import swimming.FreeStyle;
import swimming.SwimmingAbstract;
import transportation.Bus620;
import transportation.SubwayLine2;
import transportation.SubwayNewBundang;
import transportation.Transfer;
import transportation.Transportation;
import transportation.Walking;
import util.Define;
import cosmetic.makeup_base.Concealer;
import cosmetic.makeup_base.MakeUp;
import cosmetic.makeup_base.MakeUpBase;
import cosmetic.makeup_option.EyeLiner;
import cosmetic.makeup_option.EyeShadow;
import cosmetic.makeup_option.EyelashCurler;
import cosmetic.makeup_option.Highlighter;
import cosmetic.makeup_option.LipColor;
import cosmetic.makeup_option.LipLiner;
import cosmetic.makeup_option.Mascara;
import cosmetic.skincare.HeavySkinCare;
import cosmetic.skincare.LightSkinCare;
import cosmetic.skincare.MediumSkinCare;
import cosmetic.skincare.SkinCare;
import exception.CartListException;

/*
 * �ó������� �뷫 �Ʒ��� �����ϴ�.
 
	 -��ħ�� �Ͼ ü�� Ȯ�� �� �����ϱ�
	 -������ ������ ������ �Ÿ� �� �� �Ÿ� ����
	 -�İ��� ����ũ�� ����: ����ȭ�� 3���� ����(light/medium/heavy)�� �������� ��������ũ�� ����
	   (��Ų, ������, ũ��, ����, ��ũ��, �޺�, ���̼���, ���̶��̳�, �䷯, ����ī��, ����, ����, ���̶�����, �����̳�, ����ƽ)
	 -����ö�̳� ������ Ÿ�� �б��� ���ٰ� �ٽ� ����ö�̳� ������ Ÿ�� ������ �̵�
	 -���� ���±濡 ��Ʈ���� �庸��
	 -����ǰ ��ǰ �з��� ���� ����(���, ��ä��, ��Ž�ǰ, ���̽�ǰ, ��ȣ��ǰ, ���� �� ����ǰ, ����, ���� ��)
	 -�Ϸ絿�� ����� ������ �庻 �������� �м��ؼ� ����� ����. ��. 
 *
 */

public class Test {

	public static void main(String[] args) throws IOException {
	
//��ħ�ϰ�
		MorningRoutine mr =  new MorningRoutine();
		System.out.println(Define.DIVISION);
//�̵�		
		Transportation homeToSwimming = new Transportation();
		homeToSwimming.addRoute(new Walking(Define.WALK, "��","������"));
		homeToSwimming.getInfo();
		System.out.println(Define.DIVISION);
//����
		SwimmingAbstract freeStyle = new FreeStyle();
		SwimmingAbstract backStroke = new BackStroke();
		SwimmingAbstract  breastStroke = new BreastStroke();
		SwimmingAbstract butterflyStroke = new ButterflyStroke();
		freeStyle.swim();
		freeStyle.swim();
		freeStyle.swim();
		freeStyle.swim();
		backStroke.swim();
		backStroke.swim();
		freeStyle.swim();
		breastStroke.swim();
		butterflyStroke.swim();
		butterflyStroke.swim();
		SwimmingAbstract.stopSwimming(freeStyle, backStroke, breastStroke, butterflyStroke);
		System.out.println(Define.DIVISION);
		
//����ȭ��+����ũ��	
		SkinCare basicCare = new LightSkinCare();
	//	basicCare.applying();
		SkinCare mediumCare = new MediumSkinCare();
	//	mediumCare.applying();
		SkinCare heavyCare = new HeavySkinCare();
	//	heavyCare.applying();

		MakeUp makeUp =  new Highlighter(new LipColor(new LipLiner(new Mascara(new EyelashCurler(new EyeShadow(new EyeShadow(
				new EyeLiner(new Concealer(new MakeUpBase(heavyCare, 1), 5), 2), "�ڷ�"), "������ũ"), 5), 2)), "�ǻ���")); 
		makeUp.applying();
		System.out.println("\n"+Define.DIVISION);

//�̵�
		Transportation swimmingToNext = new Transportation();
		swimmingToNext.addRoute(new SubwayLine2(Define.SUBWAY, "���", "����", 6), new Transfer(), new SubwayNewBundang(Define.SUBWAY, "����", "�Ǳ�", 4), new Bus620(Define.BUS, "�Ǳ�������", "�����彺", 3));
		swimmingToNext.getInfo();
		System.out.println("\n"+Define.DIVISION);
		
//�ٽ� �̵�	
		Transportation nextToMart = new Transportation();
		nextToMart.addRoute(new Walking(Define.WALK, "�б�","�Ǳ���"), new SubwayNewBundang(Define.SUBWAY, "�Ǳ�", "����", 4), new Transfer(), new SubwayLine2(Define.SUBWAY, "����", "��Ʈ", 6));
		nextToMart.getInfo();	
		System.out.println("\n"+Define.DIVISION);
		
//��Ʈ ���� ����
		SmallMart mart = SmallMart.getInstance();
		mart.insertItem("milk", Define.DAIRY, 2000);
		mart.insertItem("flour", Define.CEREAL, 3000);
		mart.insertItem("honeyButterChip", Define.CONFECTIONERY, 2000);
		mart.insertItem("oliveOil", Define.FAT_OIL, 8000);
		mart.insertItem("chocolate", Define.CONFECTIONERY, 2000);
		mart.insertItem("cheese", Define.DAIRY, 5000);
		mart.insertItem("sugar", Define.SWEETNER, 1000);
		mart.insertItem("salt", Define.SPICES, 2000);
		mart.insertItem("salmon", Define.FISH, 10000);
		mart.insertItem("chiken", Define.MEAT, 3000);
		mart.insertItem("egg", Define.EGG, 4000);
		mart.insertItem("bagel", Define.BAKERY, 5000);
		mart.insertItem("salmon", Define.FISH, 10000);
		mart.insertItem("apple", Define.FRUIT, 6000);
		mart.insertItem("pear", Define.FRUIT, 8000);
		mart.insertItem("banana", Define.FRUIT, 3000);
		mart.insertItem("cabbage", Define.VEGETABLE, 5000);
		mart.insertItem("pumpkin", Define.VEGETABLE, 5000);
		mart.insertItem("sprite", Define.BEVERAGE, 2000);
		mart.insertItem("pomegranateJuice", Define.BEVERAGE, 3000);
		mart.insertItem("sausage", Define.MEAT, 9000);
		mart.showStock();
		
//�庸��
		Cart cart = new Cart();
		try {
			cart.put("sausage, cabbage, pumpkin, milk, banana, egg,oliveOil, apple, pear, icecream, salmon, honeyButterChip, bagel");
			//cart.put("");
		} catch (CartListException e) {
			((CartListException) e).getMessage();
		}
		cart.calculate();
		System.out.println(Define.DIVISION);
		
//�̵�		
		
		Transportation martToHome = new Transportation();
		martToHome.addRoute(new Walking(Define.WALK, "��Ʈ","��"));
		martToHome.getInfo();
		System.out.println(Define.DIVISION);
		
//���� �����
		
		System.out.println(Define.DIVISION + "\n ����� Ȯ��~");
		homeToSwimming.getSum();
		swimmingToNext.getSum();
		nextToMart.getSum();
		martToHome.getSum();
		
		System.out.println("\n ��Ʈ ������ Ȯ��~");
		AnalyzeReceipt receipt = new AnalyzeReceipt();
		try {
			receipt.analyze(new File("serial.dat"));
			receipt.getInfo();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

		HouseholdAccountBook.getInstance().write(Transportation.getTodayTrafficFee());
		HouseholdAccountBook.getInstance().write(AnalyzeReceipt.getTotalCost());
		HouseholdAccountBook.getInstance().report();
		
		System.out.println(Define.DIVISION);	
	}

}
