package week3.day2;


import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class LearnLinkedHashSet {

	public static void main(String[] args) {
		
		Set<Integer> values = new LinkedHashSet<Integer>();
		
		
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
		//System.out.println(values.get(2));
		
		
		/*
		 * for (int i=0; i < values.size(); i++) { System.out.println(values.get(i)); }
		 */
		
		//advanced for loop
		//for (dataTYpe localValue : objectName)
		
		  for (Integer localVariable : values) 
		  { 
			  System.out.println(localVariable);
		  }
		 
			
			
		
		  List<Integer> listValues = new LinkedList<Integer>(values);
		  System.out.println(listValues.get(3));
		  
		  for (int i = 0; i <listValues.size(); i++)
		  {
			  System.out.println(listValues.get(i));
		  }
		 
		}

	}
