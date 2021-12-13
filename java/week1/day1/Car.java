package week1.day1;

//accessSpecifier <class> ClassName
public class Car {
	
	
	//dataType or variable variableName = value;
	//sample edit
	
	 
		
	//method should always be defined inside the class and not inside the main method
	private void applyBrake() {
		System.out.println("This is apply Brake method");

	}
	
	public void applyHorn() {
		
		System.out.println("This is applyHorn method");
		int i = 10;
		System.out.println(i);
		char c='C';
		System.out.println(c);
		boolean b=true;
		System.out.println(b);
		float floatCapacity = 30.5f;
		double kmRun = 43523493.3245;
		long carPrice = 8000000000000L;
	}
	
	public void isFueled() {
		System.out.println("This is Fuel method");
	}
	

	//main method which is required to execute the program
	public static void main(String[] args) {
		
		//Classname objectName = new Classname();
		Car audi = new Car();
	
		System.out.println(10);
		audi.applyBrake();
		audi.applyHorn();
		audi.isFueled();
		
		
	
	}

}
