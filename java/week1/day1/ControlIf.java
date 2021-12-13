package week1.day1;

public class ControlIf {
	
	
	public void ageCalculation() {
		int age = 60;
		
		if (age <18) {
			System.out.println("Candidate is Minor");
		}
		
		else if (age >=18) {
			System.out.println("Candidate is Major");
		}

	}

	public static void main(String[] args) {
		
		ControlIf control = new ControlIf();
		control.ageCalculation();
	
	
	
		
	}

}
