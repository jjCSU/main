package bankAccount;

public class CheckingAcc extends BankAccount{
	private double interestRate;
	
	// Constructor; Calls the  bank account constructor
		public CheckingAcc(String firstName, String lastName, int accountID, double interestRate) {
			super(firstName, lastName, accountID);
		// Initializing the interest rate
			this.interestRate = interestRate;
			}

	// Processing a withdraw
		public void processWithdrawal(double amount) {
			double newBalance = getBalance() - amount;
		
		// Check to see if a withdraw causes an overdraft fee
			if (newBalance < 0) {
				System.out.println("Overdraft detected! A $30 fee has been applied.");
			}
		
		// calling a superclass withdraw method to update the balance
			super.withdrawal(amount);
		
		// If balance is now negative subtract $30 overdraft fee
			if (getBalance() < 0) {
				super.withdrawal(30);
			}
		}
	
	// Print account summary with the interest rate
		public void displayAccount() {
			accountSummary();
		// Adding to the interest rate
			System.out.println("Your Interest Rate is: " + interestRate + "%");
		}

}
