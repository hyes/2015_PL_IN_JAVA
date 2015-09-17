package exception;


public class CartListException extends Exception {

	private String message;
	 
	public CartListException(String message){
		super(message);
		this.message = message;
	}
	public String getMessage(){
		System.out.println("ERROR: " + message);
		return message;
	}
	
}
