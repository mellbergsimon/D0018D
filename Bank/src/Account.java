
public class Account {
	
	/**
	 * 
	 */
	private int balance;
	private int interest;
	private int accountNr;
	private int accountType;
	private static int accountCounter = 1001;
	
	
	/**
	 * Initialize account with no balance and default interest.
	 * @throws Exception when wrong variables are used.
	 */
	public Account() throws Exception{
		this.balance = 0;
		this.interest = 1; //1%
		setAccountNr(accountCounter);
		
	}
	
	public Account(int balance, int interest, int accountType) throws Exception{
		if (accountType != 1)
		
		this.balance = balance;
		this.interest = interest;
		this.accountType = accountType;
	}
	
	/**
	 * 
	 * @param balance
	 */
	public void setBalance(int balance) {
		this.balance = balance;
	}
		
	/**
	 * 
	 * @return
	 */
	public int getBalance() {
		return this.balance;
	}
	
	/**
	 * 
	 * @param interest
	 */
	public void setInterest(int interest) {
		this.interest = interest;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getInterest(){
		return this.interest;
	}
	
	/**
	 * 
	 * @param nr
	 */
	private void setAccountNr(int nr) {
		accountCounter++;
		this.accountNr = nr;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getAccountNr() {
		return this.accountNr;
	}
	
	/**
	 * 
	 * @param type
	 */
	public void setAccountType(int type) {
		this.accountType = type;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getAccountType() {
		return this.accountType;
	}
}
