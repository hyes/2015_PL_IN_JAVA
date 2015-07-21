package javahw3;

public class GameLevel3 extends GameLevel{
	public static final String LEVEL = "level3";
	private static GameLevel3 gameLevel3 = new GameLevel3();
	
	public static GameLevel3 getInstance(){
		
		if(gameLevel3 == null){
			gameLevel3 = new GameLevel3();
		}
		return gameLevel3;
	}

	@Override
	public void simpleAttack() {
		System.out.println("level3 simple attack 메롱메롱메롱  ");
		
	}

	@Override
	public void turnAttack() {
		System.out.println("level3 turn attack  뒤돌려차기 앞돌려차기");
		
	}

	@Override
	public void flyingAttack() {
		System.out.println("level3 flying attack 날라차기~휙~  ");
		
	}

	
}
