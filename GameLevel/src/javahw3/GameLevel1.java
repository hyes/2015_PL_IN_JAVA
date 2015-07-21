package javahw3;

public class GameLevel1 extends GameLevel{
	public static final String LEVEL = "level1";
	private static GameLevel1 gameLevel1 = new GameLevel1();
	
	public static GameLevel1 getInstance(){
		
		if(gameLevel1 == null){
			gameLevel1 = new GameLevel1();
		}
		return gameLevel1;
	}

	@Override
	public void simpleAttack() {
		System.out.println("level1 simple attack 메롱 ");
		
	}

	@Override
	public void turnAttack() {
		System.out.println("level1 turn attack  못하지롱");
		
	}

	@Override
	public void flyingAttack() {
		System.out.println("level1 flying attack 이것도 못하지롱  ");
		
	}

	
}
