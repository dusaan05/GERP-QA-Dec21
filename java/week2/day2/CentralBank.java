package week2.day2;

public class CentralBank implements CIBIL {
	
	public void creditScore()
	{
		System.out.println("This is a creditScore method - Implemented in CentralBank");
	}
	
	public void fixedDeposit()
	{
		System.out.println("This is fixedDeposit account - Implemented in CentralBank");
	}
	
	public void savingsAccount()
	{
		System.out.println("This is savingsAccount - Implemented in CentralBank");
	}

	public static void main(String[] args) {
		CentralBank cb = new CentralBank();
		cb.creditScore();
		cb.fixedDeposit();
		cb.savingsAccount();

	}

}
