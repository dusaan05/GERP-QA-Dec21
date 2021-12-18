package week2.day2;

public class IndianGovt extends FinanceMinistry{


	@Override
	public void fixedDeposit() {
		System.out.println("75000");
	}
	
	//Method Overriding
	public void disasterLoan()
	{
		System.out.println("$8000");
	}
	
	public static void main(String[] args) {
		IndianGovt ig = new IndianGovt();
		ig.disasterLoan();
		ig.fixedDeposit();
		

	}

	

}
