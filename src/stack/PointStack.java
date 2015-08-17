package stack;

import java.util.ArrayList;

import map.Point;

public class PointStack implements IStack{

	private ArrayList<Point> pointList = new ArrayList<Point>();
	
	@Override
	public void push(Object object) {
		pointList.add((Point) object);
	}

	@Override
	public Point pop() {
		if(pointList.size() > 0){
			return pointList.remove(pointList.size()-1);
		}else{
			System.out.println("ERROR");
		}
		return null;
	}
	
	public int getSize(){
		return pointList.size();
	}

	public ArrayList<Point> getPointList() {
		return pointList;
	}
	
}
