package map;

public class LabyrinthTemplate {

	private static LabyrinthTemplate instance = new LabyrinthTemplate();
	
	public static LabyrinthTemplate getInstance(){
			
		if(instance == null){
			instance = new LabyrinthTemplate();
		}
		
		return instance;
	}
	
	public static int[][] map = {{0, 1, 1, 1, 0, 1, 1, 1},
							  	 {0, 0, 0, 1, 0, 0, 0, 0},
								 {1, 1, 0, 0, 0, 1, 0, 1},
								 {1, 1, 0, 1, 1, 1, 0, 1}, 
							     {1, 0, 0, 1, 0, 0, 0, 0},
							     {0, 1, 1, 1, 0, 1, 1, 1},
								 {1, 0, 1, 1, 0, 0, 0, 0},
							     {0, 1, 1, 0, 1, 1, 1, 0}};

	public void showMap(){
		System.out.println("==================== 제시 경로(길■,벽□) ====================");
		String[] str = {"■","□"};
		
		  for(int i = 0 ; i < map.length ; i++){
			   for(int j = 0 ; j < map[0].length ; j++){
						System.out.print(str[(map[i][j])]+"\t");
			   }
			   System.out.println("");
		  }
		  System.out.println("\n");
	}  
	
}
