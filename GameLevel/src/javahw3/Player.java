package javahw3;

public class Player {
	public GameLevel gameLevel;
	
	public void upgradeLevel(GameLevel gameLevel){
		this.gameLevel = gameLevel;
	}
	
	public GameLevel getGameLevel(){
		return gameLevel;
	}
	
	final public void attack(String levelInfo){
		attackStart(levelInfo);
		gameLevel.play();
		attackEnd(levelInfo);
	}
	
	private void attackStart(String levelInfo) {
		System.out.println("======= "+ levelInfo + " start ========");	
	}
	
	private void attackEnd(String levelInfo) {
		System.out.println("======== "+ levelInfo + " end =========");
		System.out.print(System.lineSeparator());
		
	}
}
