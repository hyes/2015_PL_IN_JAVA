package javahw3;

public class GameLevel2 extends GameLevel{
	public static final String LEVEL = "level2";
	private static GameLevel2 gameLevel2 = new GameLevel2();
	
	public static GameLevel2 getInstance(){
		
		if(gameLevel2 == null){
			gameLevel2 = new GameLevel2();
		}
		return gameLevel2;
	}

	@Override
	public void simpleAttack() {
		System.out.println("level2 simple attack 메롱 메롱~  ");
		
	}

	@Override
	public void turnAttack() {
		System.out.println("level2 turn attack  돌려차기 씡~~");
		
	}

	@Override
	public void flyingAttack() {
		System.out.println("level2 flying attack 이건 못하지롱  ");
		
	}

	
}
