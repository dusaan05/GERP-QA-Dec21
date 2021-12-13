package week1.day2;

public class LearOperators {

	public static void main(String[] args) {
		
		int input = 10;
		
		for (int i=5; i < input; i++)
		{
			int output = i % 2; 
			
			if (output !=0)
			{
				System.out.println(i + "It is a odd number");
			}
			
			else 
			{
				System.out.println(i + "It is a even number");
			}
			
		}
		
		
	}

}
