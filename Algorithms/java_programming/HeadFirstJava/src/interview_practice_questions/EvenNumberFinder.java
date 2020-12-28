package interview_practice_questions;

import java.util.ArrayList;

/*
 * Running time: O(n) where n is equal to the size of the arraylist. 
 * Questions:
 * 1. how big is the list of numbers?
 * 2. does it fit in the memory?
 * 3. how many files do we have?
 * 4. which format the files have?
 * 5. hoe big is the file?
 * 6. how do i return the even numbers?in an array in a linked list or as map
 * 7. are all the number integers?
 * 8. does it need input validation?
 * 9. are all the numbers positive?
 * 10. 
 * 
 * */
public class EvenNumberFinder {
	
	public ArrayList evenFinder(ArrayList<Integer> list) {
		ArrayList<Integer> evenList = new ArrayList();
		
		for(int i = 0; i < list.size(); i++) {
			 if((list.get(i) % 2) == 0) {
				 evenList.add(list.get(i));
			 }
		}
		return evenList;	
	}
	
	public static void printList(ArrayList<Integer> list) {
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		
		EvenNumberFinder finder  = new EvenNumberFinder();
		printList(finder.evenFinder(list));
		
	}

}
