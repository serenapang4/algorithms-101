package interview_practice_questions;

import java.util.ArrayList;
import java.util.List;

public class SumOfNumber {
	
	
	/*
	 * Running time: O(n2) where n is equal to the size of the arraylist, and because each number in the list has to sum with next number once 
	 * Questions:
	 * 1. how big is the list of numbers?
	 * 2. does it fit in the memory?
	 * 3. how many files do we have?
	 * 4. which format the files have?
	 * 5. how big is the file?
	 * 6. what if there are more than one pair of numbers sum to 45?
	 * 7. are all the number integers?
	 * 8. does it need input validation?
	 * 9. are all the numbers positive?
	 * 10. 
	 * 
	 * */
	public List<Integer> findTwoNumbers(List<Integer> list){
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		int targetNumber = 5;
		
		for(int i = 0 ; i < list.size(); i++) {
			
			for(int j = i + 1; j < list.size(); j++) {
				if((list.get(i) + list.get(j)) == targetNumber) {				
					numbers.add(list.get(i));
					numbers.add(list.get(j));
				}			
			}
		}
		
		return numbers;
		
	}
	
	public static void printList(List<Integer> list) {
		for(int i = 0; i < list.size(); i++) {
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
		
	//	printList(list);
		SumOfNumber summer = new SumOfNumber();
		
		printList(summer.findTwoNumbers(list));
		
		
	}

}
