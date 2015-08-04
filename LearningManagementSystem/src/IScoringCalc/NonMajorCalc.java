package IScoringCalc;

public class NonMajorCalc implements IScoring{

	@Override
	public String clacAverage(int score) {
		String result;
		if(score <= MAXIMUM && score >= 90){
			result = "A"; 
		}else if(score <= 89 && score >= 80){
			result = "B"; 
		}else if(score <= 79 && score >= 70){
			result = "C"; 
		}else if(score <= 69 && score >= 55){
			result = "D"; 
		}else{
			result = "F"; 
		}
		
		return result;
	}

}