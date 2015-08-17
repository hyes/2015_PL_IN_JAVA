package test;

import java.io.IOException;
import map.LabyrinthTemplate;
import findingpath.AbstractMoveTrack;
import findingpath.DirectionSetting;
import findingpath.eight_directions.FindgingExitEightDirections;
import findingpath.four_directions.FindgingExitFourDirections;

public class LabyrinthTest {

	public static void main(String[] args) throws IOException {
		
		LabyrinthTemplate.getInstance().showMap();
		String directions = DirectionSetting.getInstance().setting("direction.properties", "DIRECTION");
		
		AbstractMoveTrack findExit = null;
		if(directions.equals("4")){
			findExit = new FindgingExitFourDirections();
		}else if(directions.equals("8")){
			findExit = new FindgingExitEightDirections();
		}
	
		findExit.start(0,0);
	
	}


}
