package week1.day1;

public class MyCar {
	
	private void sensorAlarm() {
		
		System.out.println("Alarm when any car approaches 0.5 meter to my car");
	}

	public static void main(String[] args) {
		
		//MyCar audi = new MyCar();
		Car carTemplate = new Car();
		MyCar bmw = new MyCar();
		
		carTemplate.applyHorn();
		carTemplate.isFueled();
		
	
		
		bmw.sensorAlarm();
	}

}
