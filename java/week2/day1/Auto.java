package week2.day1;

public class Auto extends Vehicle {
	
	public void handStarter()
	{
		System.out.println("HandStarted method - Auto Class");
	}
	
	public static void main(String[] args) {
		Auto autoVehicle = new Auto();
		autoVehicle.applyBrake();
		//autoVehicle.soundHorn();
		autoVehicle.handStarter();
	}
	
}
