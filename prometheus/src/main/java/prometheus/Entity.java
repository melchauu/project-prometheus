package prometheus;


public abstract class Entity {

	public String firstName;
	public String lastName;
	public Long id;
	public Address address;

	public Entity () {
		
	}

	public Entity (String firstName, String lastName, Long id, Address address) { 
	    this.firstName = firstName;
	    this.lastName = lastName;
	    this.id = id;
	    this.address = address;
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
}