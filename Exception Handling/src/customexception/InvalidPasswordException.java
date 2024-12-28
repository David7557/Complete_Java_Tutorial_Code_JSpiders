package customexception;

class InvalidPasswordException extends RuntimeException{
	
	private String message;
	
	public InvalidPasswordException(String message) {
		this.message = message;
	}
	
	@Override 
	public String getMessage() {
		return message;
	}
}

//Unchecked -> class InvalidPasswordException extends RuntimeException{....}
//Checked -> class InvalidPasswordException extends Exception{....}
