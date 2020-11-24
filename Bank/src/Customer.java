
public class Customer {

	
	private String surName;
	private String lastName;
	private Account account;
	
	
	public Customer() throws Exception{
		
		
		this.account = new Account(1); 
	}
}
