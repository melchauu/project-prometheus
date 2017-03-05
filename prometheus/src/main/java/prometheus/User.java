package prometheus;

public class User extends Entity {
	
	public String username;
	public String password;
	public boolean status;
	
	public User() {
		
	}
	
	public User(String firstName, String lastName, Long id, Address address, String username, String password) {
		super(firstName, lastName, id, address);
		this.username = username;
		this.password = password;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}

	public User(String username, String password) {
	    this.username = username;
	    this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getUsername() {
		return username;
	}

}
