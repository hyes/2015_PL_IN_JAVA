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
 * 시나리오는 대략 아래와 같습니다.
 
	 -아침에 일어나 체중 확인 후 수영하기
	 -수영이 끝나면 영법별 거리 및 총 거리 제시
	 -씻고나서 메이크업 진행: 기초화장 3가지 버전(light/medium/heavy)을 바탕으로 색조메이크업 진행
	   (스킨, 에센스, 크림, 수분, 선크림, 메베, 아이섀도, 아이라이너, 뷰러, 마스카라, 음영, 블러셔, 하이라이터, 립라이너, 립스틱)
	 -지하철이나 버스를 타고 학교에 갔다가 다시 지하철이나 버스를 타고 집으로 이동
	 -집에 오는길에 마트에서 장보기
	 -구매품 식품 분류에 따라 구분(곡류, 야채류, 향신식품, 감미식품, 기호식품, 우유 및 유제품, 난류, 육류 등)
	 -하루동안 사용한 교통비와 장본 영수증을 분석해서 가계부 정리. 끝. 
 *
 */

public class Test {

	public static void main(String[] args) throws IOException {
	
//아침일과
		MorningRoutine mr =  new MorningRoutine();
		System.out.println(Define.DIVISION);
//이동		
		Transportation homeToSwimming = new Transportation();
		homeToSwimming.addRoute(new Walking(Define.WALK, "집","수영장"));
		homeToSwimming.getInfo();
		System.out.println(Define.DIVISION);
//수영
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
		
//기초화장+메이크업	
		SkinCare basicCare = new LightSkinCare();
	//	basicCare.applying();
		SkinCare mediumCare = new MediumSkinCare();
	//	mediumCare.applying();
		SkinCare heavyCare = new HeavySkinCare();
	//	heavyCare.applying();

		MakeUp makeUp =  new Highlighter(new LipColor(new LipLiner(new Mascara(new EyelashCurler(new EyeShadow(new EyeShadow(
				new EyeLiner(new Concealer(new MakeUpBase(heavyCare, 1), 5), 2), "코럴"), "러블리핑크"), 5), 2)), "피빨강")); 
		makeUp.applying();
		System.out.println("\n"+Define.DIVISION);

//이동
		Transportation swimmingToNext = new Transportation();
		swimmingToNext.addRoute(new SubwayLine2(Define.SUBWAY, "잠실", "강남", 6), new Transfer(), new SubwayNewBundang(Define.SUBWAY, "강남", "판교", 4), new Bus620(Define.BUS, "판교역북편", "하이펙스", 3));
		swimmingToNext.getInfo();
		System.out.println("\n"+Define.DIVISION);
		
//다시 이동	
		Transportation nextToMart = new Transportation();
		nextToMart.addRoute(new Walking(Define.WALK, "학교","판교역"), new SubwayNewBundang(Define.SUBWAY, "판교", "강남", 4), new Transfer(), new SubwayLine2(Define.SUBWAY, "강남", "마트", 6));
		nextToMart.getInfo();	
		System.out.println("\n"+Define.DIVISION);
		
//마트 물건 세팅
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
		
//장보기
		Cart cart = new Cart();
		try {
			cart.put("sausage, cabbage, pumpkin, milk, banana, egg,oliveOil, apple, pear, icecream, salmon, honeyButterChip, bagel");
			//cart.put("");
		} catch (CartListException e) {
			((CartListException) e).getMessage();
		}
		cart.calculate();
		System.out.println(Define.DIVISION);
		
//이동		
		
		Transportation martToHome = new Transportation();
		martToHome.addRoute(new Walking(Define.WALK, "마트","집"));
		martToHome.getInfo();
		System.out.println(Define.DIVISION);
		
//오늘 가계부
		
		System.out.println(Define.DIVISION + "\n 교통비 확인~");
		homeToSwimming.getSum();
		swimmingToNext.getSum();
		nextToMart.getSum();
		martToHome.getSum();
		
		System.out.println("\n 마트 영수증 확인~");
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
