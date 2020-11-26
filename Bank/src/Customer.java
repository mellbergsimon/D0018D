import java.util.ArrayList;

public class Customer {

	
	private String surName;
	private String lastName;
	protected String socialNr;
	private ArrayList<Account> accounts = new ArrayList<Account>();
	
	
	public Customer(String surName, String lastName, String socialNr) throws Exception{
		this.surName = surName;
		this.lastName = lastName;
		
		if (socialNr.length() != 12) {
			throw new NumberFormatException("Social number must be 10 characters, YYMMDDXXXX");
		} else {
			this.socialNr = socialNr;
		}
	}
	
	public void addAccount(Account account) throws Exception{
		if (!(account instanceof Account)) {
			throw new IllegalArgumentException("Wrong type, needs to be an Account.");
		} else {
			this.accounts.add(account);
		}
	}
	
	public String getName() {
		
	}
}
