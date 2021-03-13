package interview_practice_questions;

import java.util.ArrayList;


/*
 * Running time: O(n2) where n is equal to the size of the arraylist, and because each number in the list has to compare with next number once 
 * Questions:
 * 1. how big is the list of numbers?
 * 2. does it fit in the memory?
 * 3. how many files do we have?
 * 4. which format the files have?
 * 5. how big is the file?
 * 6. are all the number integers?
 * 7. are all the numbers positive?
 * 8. do i need to print it?
 * 9. 
 * 10. 
 * 
 * */
public class SmallestNumberFinder {
	
	
	public int smallestFinder(ArrayList<Integer> list) {	
		int smallest = list.get(0);
		
		for(int i = 0; i < list.size()-1; i++) {
			
			int current = list.get(i);
			if(current < smallest) {
				smallest = current;
			}
		}
		return smallest;
	}
	
	
	//another way to solve this: sort the list and return the first number which is the smallest one

	public static void printList(ArrayList<Integer> list) {
		System.out.println("size " + list.size());
		for(int i = 0; i < list.size()-1; i++) {
			System.out.print(list.get(i) + " ");
		}
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(8);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		
		SmallestNumberFinder finder = new SmallestNumberFinder();
		System.out.println("result: " + (finder.smallestFinder(list)));
		
	}

}
