package findingpath;

import stack.PointStack;
import map.Point;

public abstract class AbstractMoveTrack implements IFindExit{
	
	protected int[][] tmp =  new int[8][8];
	protected boolean idx = false;
	protected PointStack stack = new PointStack();
	protected PointStack overlapPoints = new PointStack();
	
	public final void start(int i, int j){
		findPath(i,j);
		showTrack();
		showOverlapPoints();
		showMaze();
	}
	
	protected final void traceTrack(int i, int j){
		check(i,j);
		stack.push(new Point(i, j));
	}

	
	protected final void check(int i, int j) {
		tmp[i][j] = 1;	
	}
	
	protected final void checkCancel(int i, int j) {
		if(i >= 0 && i < 8 && j >=0 && j < 8){
			tmp[i][j] = 0;
		}else{
			System.out.println("cancelERR");
		}
	}
	
	protected final void movePrevious(){
		Point base = stack.pop();
		overlapPoints.push(base);
		checkCancel(base.getX(), base.getY());	
		findPath(base.getX(), base.getY());
	}

	protected final void isExit(int i, int j) {
		if(i == 7 && j == 7 && tmp[i][j] == 0){
			idx = true;
			traceTrack(i, j);
			return;
		}
	}

	protected final void showTrack(){
		System.out.println("===================== 지나온 경로: "+stack.getSize()+"개 ======================");
		for(int a = 0;  a < stack.getSize(); a++){
			System.out.println(stack.getPointList().get(a).getX() + ", "+ stack.getPointList().get(a).getY());
		}
	} 
	protected final void showMaze(){
		System.out.println("======================= 지나온 경로(■) =========================");
		String[] str = {"□","■"};
		  for(int i = 0 ; i < tmp.length ; i++){
			   for(int j = 0 ; j < tmp[0].length ; j++){
						System.out.print(str[(tmp[i][j])]+"\t");
			   }
			   System.out.println("");
		  } System.out.println("\n");
	}
	private final void showOverlapPoints() {
		System.out.println("====================경로 중복된 지점 : "+overlapPoints.getSize()+"개 =====================");
		for(int a = 0;  a <overlapPoints.getSize(); a++){
			System.out.println(overlapPoints.getPointList().get(a).getX() + ", "+ overlapPoints.getPointList().get(a).getY());
		}
	}


}
