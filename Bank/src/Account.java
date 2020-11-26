
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
		if (accountType != 1) {
			throw new IllegalArgumentException("Wrong accountType, only 1 is valid.");
		}
		this.balance = 0;
		this.interest = 1; //1%
		setAccountNr(accountCounter);
		//this.accountType = accountType;
		this.accountType = 1; //Default type.
		
	}
	
	/**
	 * 
	 * @param balance
	 * @param interest
	 * @param accountType Type of account, only one available at the moment
	 * @throws Exception When wrong accountType is used
	 */
	public Account(int balance, int interest) throws Exception{
		if (accountType != 1) {
			throw new IllegalArgumentException("Wrong accountType, only 1 is valid.");
		}
		
		this.balance = balance;
		this.interest = interest;
		//this.accountType = accountType;
		this.accountType = 1; //Default type.
		setAccountNr(accountCounter);
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
