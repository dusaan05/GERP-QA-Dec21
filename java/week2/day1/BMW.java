package week2.day1;

public class BMW extends Car {
	
	protected void techGPS()
	{
		System.out.println("This is Tech GPS method - BMW Class");
	}
	
	public static void main(String[] args) {
		BMW bmwCar = new BMW();
		bmwCar.airConditioner();
		bmwCar.applyBrake();
		//bmwCar.soundHorn();
		bmwCar.techGPS();
		
		//Car ownCar = new Car();
		
				
	}
	

}
