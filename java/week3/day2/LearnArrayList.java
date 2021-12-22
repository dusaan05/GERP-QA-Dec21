package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class LearnArrayList {

	public static void main(String[] args) {
		List values = new ArrayList();
				
				// to find the list size
				System.out.println(values.size());
				
				
				//to add data to into the ArrayList
				values.add("Sudhakar");
				values.add(200);
				values.add(10.00);
				values.add('R');
				values.add(true);
				values.add(200);
				values.add("Ritu");
				
				System.out.println(values.size());
				System.out.println(values.get(2));
				
				for (int i=0; i < values.size(); i++)
				{
					System.out.println(values.get(i));
				}
				
				
				//to get the last index
				int size = values.size();
				System.out.println(size-1);
				

			}

		}