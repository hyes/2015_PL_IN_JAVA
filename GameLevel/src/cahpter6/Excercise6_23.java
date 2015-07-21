package cahpter6;

public class Excercise6_23 {

	public static void main(String[] args) {
		int[] data = {3,2,9,4,7};
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("MAX: "+max(data));
		System.out.println("MAX: "+max(null));
		System.out.println("MAX: "+max(new int[]{}));

	}

	private static int max(int[] arr) {
		
		int result =0;
		
		if(arr == null){
			result = -999999;
		}else if(arr.length == 0){
			result = -999999;
		}else{
			int max = arr[0];
			for(int i =1; i<arr.length; i++){
				if(arr[i] > max){
					max = arr[i];
				}
			}
			result = max;
		}
		
		return result;
	}

}
