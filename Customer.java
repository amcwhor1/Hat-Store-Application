/*
 * @author: Alex McWhorter, Steven Biedenbach, Sagar Hansalia
 * version: 1.0
 * Written: November 2017
 * 
 * This class defines a customer with 4 attributes.
 * 
 * Purpose: To give customers the ability create an account based on the Customer attributes in this class
 */


public class Customer {

	//attributes used for a customer
	String firstName;
	String lastName;
	String email;
	String password;
	
	//constructor 
	public Customer(String infirst, String inlast, String inemail, String inpass){
		firstName = infirst;
		lastName = inlast;
		email = inemail;
		password = inpass;
	}

	
	//all getters and setters for customer attributes
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
