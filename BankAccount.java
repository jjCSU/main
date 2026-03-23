package bankAccount;

public class BankAccount {
	private String firstName; // account user's first name
	private String lastName;  // account user's last name
	private int accountID;    // account user's ID
	private double balance;   // account user's balance
	
	// Constructor()
	public BankAccount(String firstName, String lastName, int accountID) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountID = accountID;
		this.balance = 0.0;
	}
	
	// Deposit()
	public void deposit(double amount) {
		balance += amount;
	}
	
	// Withdrawal()
	public void withdrawal(double amount) {
		balance -= amount;
	}
	
	// getter and setter for the first name
	public String getFirstName() { return firstName; }
	public void setFirstName(String firstName) { this.firstName = firstName; }
	
	// getter and setter for the last name
	public String getLastName() { return lastName; }
	public void setLastName(String lastName) { this.lastName = lastName; }

	// getter and setter for the account ID
	public int getAccountID() { return accountID; }
	public void setAccountID(int accountID) { this.accountID = accountID; }

	// getter to return the balance
	public double getBalance() { return balance; }
	
	// method to print all the bank account information
	public void accountSummary() {
		System.out.println("Account Summary:");
		System.out.println("Name: " + firstName + " " + lastName);
		System.out.println("Account ID: " + accountID);
		System.out.println("Balance: $" + balance);
	}
	
}
