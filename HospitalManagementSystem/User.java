package Inheritance.HospitalManagementSystem;

public class User {
    private long id;
    private String firstName;
	private String lastName;
	private String email;
	private String gender;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	
	public String getFirstName(){
	    return firstName;
	}
	
	public void setFirstName(String firstName){
	    this.firstName = firstName;
	}
	
	public String getLastName(){
	    return lastName;
	}
	
	public void setLastName(String lastName){
	    this.lastName = lastName;
	}
	
	public String getEmail(){
	    return email;
	}
	
	public void setEmail(String email){
	    this.email = email;
	}
	
	public String getGender(){
	    return gender;
	}
	
	public void setGender(String gender){
	    this.gender = gender;
	}
    
}
