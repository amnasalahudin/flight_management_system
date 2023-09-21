
public class User {
	
	private String name, email, password, reEnterPass;

	// getter and setter for name 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	// getter and setter for email

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	// intializing constructor 

	public User(String name, String email, String password, String reEnterPass) {
		
		this.name = name;
		this.email = email;
		this.password = password;
		this.reEnterPass = reEnterPass;
	}

	// getter and setter for password
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	// getter and setter for renter password
	public String getReEnterPass() {
		return reEnterPass;
	}

	public void setReEnterPass(String reEnterPass) {
		this.reEnterPass = reEnterPass;
	}

}
