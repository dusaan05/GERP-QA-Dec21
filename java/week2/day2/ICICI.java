package week2.day2;

public class ICICI implements RBI{
	
	public void fixedDeposit() {
		System.out.println("This is fixedDeposit account - Implemented in ICICI bank");
	}

	public void savingsAccount() {
		System.out.println("This is savingsAccount - Implemented in ICICI bank");
		
	}
	
	public void educationLoan()
	{
		System.out.println("50000");
	}

	public static void main(String[] args) {
		ICICI icici = new ICICI();
		icici.educationLoan();
		icici.fixedDeposit();
		icici.savingsAccount();
	}

}
