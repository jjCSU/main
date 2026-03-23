package bankAccount;

public class TestingClass {
	public static void main(String[] args) {
		// Create a new checking account
		// Plug in first name, last name, account ID, and interest rate
		CheckingAcc myAccount = new CheckingAcc("Joseph", "Strongman", 0475, 1.25);
		
		
		
		// Deposit Example
		System.out.println("Depositing $100...");
		myAccount.deposit(100);			  
		myAccount.displayAccount();		  
		
		
		
		// Withdrawal example with no overdraft
		System.out.println("\nWithdrawing $60...");
		myAccount.withdrawal(60);   	  
		myAccount.displayAccount();		  
		 
		
		
		// Withdrawal example with overdraft fee
		System.out.println("\nWithdrawing $75...");
		myAccount.processWithdrawal(75);  
		myAccount.displayAccount();		  
		
		
	}


}
