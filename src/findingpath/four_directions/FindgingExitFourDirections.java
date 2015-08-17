package findingpath.four_directions;

import map.LabyrinthTemplate;
import findingpath.AbstractMoveTrack;

public class FindgingExitFourDirections extends AbstractMoveTrack{

	@Override
	public void findPath(int i, int j) {
		
		isExit(i, j);
		
		if((j+1) < 8 && LabyrinthTemplate.map[i][j+1] == 0 && tmp[i][j+1] != 1){
			traceTrack(i, j);
			findPath(i, j+1);
		}else if((i+1) < 8 && LabyrinthTemplate.map[i+1][j] == 0 && tmp[i+1][j] != 1){
			traceTrack(i, j);
			findPath(i+1, j);
		}else if((i-1) >= 0  && (i+1) < 8 && LabyrinthTemplate.map[i-1][j] == 0 && tmp[i-1][j] != 1){
			traceTrack(i, j);
			findPath(i-1, j);
		}else if ((j-1) >= 0 && (j+1) < 8 && LabyrinthTemplate.map[i][j-1] == 0 && tmp[i][j-1] != 1){
			traceTrack(i, j);
			findPath(i, j-1);
		}else{
			check(i,j);
			if(idx == false){
			movePrevious();
			}
		}
	}
}
