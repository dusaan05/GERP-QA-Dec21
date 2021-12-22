package week3.day2;


import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnTreeSet {
	
public static void main(String[] args) {
		
		Set<String> values = new TreeSet<String>();
		
		
		// to find the list size
		System.out.println(values.size());
		
		
		//to add data to into the ArrayList
		values.add("Nur");
		values.add("Amisha");
		values.add("Ritu");
		values.add("Faisal");
		values.add("Ami");
		values.add("Ami");
		
		
		System.out.println(values.size());
		//System.out.println(values.get(2));
		
		
		/*
		 * for (int i=0; i < values.size(); i++) { System.out.println(values.get(i)); }
		 */
		
		//advanced for loop
		//for (dataTYpe localValue : objectName)
		
		  for (String localVariable : values) 
		  { 
			  System.out.println(localVariable);
		  }
		 		
			
		
		  List<String> listValues = new LinkedList<String>(values);
		  System.out.println(listValues.get(3));
		  
		  for (int i = 0; i <listValues.size(); i++)
		  {
			  System.out.println(listValues.get(i));
		  }
		 
		}

	}
