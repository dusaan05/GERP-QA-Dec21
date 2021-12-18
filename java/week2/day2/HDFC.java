package week2.day2;

public class HDFC implements RBI {
	
	public void fixedDeposit() {
		System.out.println("This is fixedDeposit account - Implemented in HDFC bank");
		
	}

	public void savingsAccount() {
		System.out.println("This is savingsAccount - Implemented in ICICI bank");
		
	}

	public void goldLoad()
	{
		System.out.println("100000");
		
	}
	public static void main(String[] args) {
		HDFC hdfcBank = new HDFC();
		hdfcBank.goldLoad();
		hdfcBank.fixedDeposit();
		hdfcBank.savingsAccount();

	}

	

}
