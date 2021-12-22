package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		//List values = new ArrayList();
		List<Integer> values = new ArrayList<Integer>();
		
		// <> - Angular Bracket - Generic - It will not allow primitive data type 
		//primitive data type are: int, long, float, double, char, string, short, boolean
		// Non-primitive data type: Class and Interface
		
		//For each primitive data type (int, long, short, char, etc) there is a wrapper class available in Java as below
		
		//int 				Integer
		//boolean			Boolean
		//char				Character
		//byte				Byte
		//short				Short
		//long				Long
		//float				FLoat
		//double			Double
		
		// to find the list size
		System.out.println(values.size());
		
		
		//to add data to into the ArrayList
		values.add(100);
		values.add(200);
		values.add(300);
		values.add(400);
		values.add(500);
		values.add(600);
		
		System.out.println(values.size());
		System.out.println(values.get(2));
		
		for (int i=0; i < values.size(); i++)
		{
			System.out.println(values.get(i));
		}

	}

}
