package tomasznosal.model;

public class User {
	String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = "Hello, "+message+"!";
	}
	
	public User(){
		
	}
}
