package week2.day2;

public class MyBank {

	public static void main(String[] args) {
		
//		  CentralBank cb = new CentralBank(); 
//		  cb.creditScore(); 
//		  cb.savingsAccount();
//		  cb.fixedDeposit();
		
		
		//scope restriction
		RBI icici = new ICICI();
		icici.fixedDeposit();
		icici.savingsAccount();
		
	}

}
