package week3.day2;


import java.util.LinkedList;
import java.util.List;

public class LearnLinkedList {

	public static void main(String[] args) {
		
		List<Integer> values = new LinkedList<Integer>();
		
		
		// to find the list size
		System.out.println(values.size());
		
		
		//to add data to into the ArrayList
		values.add(100);
		values.add(200);
		values.add(300);
		values.add(400);
		values.add(500);
		values.add(100);
		
		System.out.println(values.size());
		System.out.println(values.get(2));
		
		for (int i=0; i < values.size(); i++)
		{
			System.out.println(values.get(i));
		}

	}

}
