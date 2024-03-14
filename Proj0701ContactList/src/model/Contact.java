package model;

public class Contact {
// instance variables in (Java )= properties in C#
	private String firstName;
	private String lastName;
	private String phone;
	private String email;
	
	
	public Contact() {
		super();
	}


	public Contact(String firstName, String lastName, String phone, String email) {
	
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.email = email;
	}


	public String getFirstName() {
		return firstName;
	}
	
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	
	public String getLastName() {
		return lastName;
	}
	
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	public String getEmail() {
		return email;
	}
	
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String displayContact() {
		String displayStr = "------------------------------------------------\n";
		displayStr += "--------------Current Contact------------------------\n";
		displayStr += "------------------------------------------------\n";
		displayStr += "Name:  "+firstName + " "+ lastName+"\n";
		displayStr += "Email Address:  "+email+"\n";
		displayStr += "Phone Number:  "+phone+"\n";
		displayStr += "------------------------------------------------\n";
		return displayStr;
	}
	
}
