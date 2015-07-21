package javahw3;

public class Board {

	public static void main(String[] args) {
		Player player = new Player();
		player.upgradeLevel(GameLevel1.getInstance());
		player.attack(GameLevel1.LEVEL);
		player.upgradeLevel(GameLevel2.getInstance());
		player.attack(GameLevel2.LEVEL);
		player.upgradeLevel(GameLevel3.getInstance());
		player.attack(GameLevel3.LEVEL);
		
	}


}
