package week1.day2;

public class LearnReturn {
	
	//void does not return value
	public int isFueled (int age)
	{
		System.out.println(age);
		
		return age;
	}

	public static void main(String[] args) {
		
		LearnReturn lr = new LearnReturn();
		lr.isFueled(10);
	}

}
