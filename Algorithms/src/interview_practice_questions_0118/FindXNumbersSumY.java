package interview_practice_questions_0118;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Finds x numbers in a list that sum y.
 * Assumes NOT REPEATED elements.
 * 
 * Example:
 *   - Find 2 numbers that sum 45 in the list 1 58 63 14 2 3
 *   - The 2 numbers would be 15.
 */
public class FindXNumbersSumY {

	public static List<Integer> find2NumbersThatAdd(int sum, List<Integer> numbers) {
		// The key is the number in the array and the value is the number of
		// occurrences of the number in the array.
		Map<Integer, Integer> map = new HashMap<>();
		
		// Populates the HashMap in O(n) time and O(n) space.
		for (int i = 0; i < numbers.size(); i++) {
			map.put(numbers.get(i), 1);
		}

		List<Integer> result = new ArrayList<>();
		// Find the 2 elements in O(n) time.
		for (int i = 0; i < numbers.size(); i++) {
			Integer first = numbers.get(i);
			// To avoid cases where we use the same element twice.
			// For example, if we have the list 1 3 2 5 7 47 and the sum has to be 10,
			// the 2 numbers have to be 3 and 7 and NO 5 and 5.
			map.remove(first);
			Integer second = sum - first;
			if (map.get(second) != null) {
				result.add(first);
				result.add(second);
				return result;
			}
			map.put(first, 1);
		}
		
		return result;
	}
	
	
	public static List<Integer> find3NumbersThatAdd(int sum, List<Integer> numbers) {
		// The key is the number in the array and the value is the number of
		// occurrences of the number in the array.
		Map<Integer, Integer> map = new HashMap<>();
		
		// Populates the HashMap in O(n) time and O(n) space.
		for (int i = 0; i < numbers.size(); i++) {
			map.put(numbers.get(i), 1);
		}

		// Find the 3 elements in O(n) time and O(n) space complexity.
		for (int i = 0; i < numbers.size(); i++) {
			Integer first = numbers.get(i);
			numbers.remove(i);
			
			int remaining = sum - first;
			List<Integer> result = find2NumbersThatAdd(remaining, numbers);
			if (result.size() == 2) {
				result.add(first);
				return result;
			}

			numbers.add(i, first);
		}	
		return new ArrayList<>();
	}
	
	private static List<Integer> findListNumbersThatAdd(int sum, List<Integer> numbers) {
		// The key is the number in the array and the value is the number of
		// occurrences of the number in the array.
		Map<Integer, Integer> map = new HashMap<>();
		
		// Populates the HashMap in O(n) time and O(n) space.
		for (int i = 0; i < numbers.size(); i++) {
			map.put(numbers.get(i), 1);
		}

		// Find the 3 elements in O(n) time and O(n) space complexity.
		for (int i = 0; i < numbers.size(); i++) {
			Integer first = numbers.get(i);
			numbers.remove(i);
			
			int remaining = sum - first;
			while(remaining != 0) {
			List<Integer> result = find2NumbersThatAdd(remaining, numbers);
			
				result.add(first);
				return result;
			}

			numbers.add(i, first);
		}	
		return new ArrayList<>();
		}
	

	public static void main(String[] args) {
		int sum;
		List<Integer> numbers = new ArrayList<>();
		numbers.add(12);
		numbers.add(44); 
		numbers.add(7); 
		numbers.add(84); 
		numbers.add(4); 
		numbers.add(7); 
		numbers.add(15); 
		numbers.add(10); 
		numbers.add(30); 
		numbers.add(14); 
		numbers.add(5);
		numbers.add(1);
		
		sum = 45;
		List<Integer> result = find2NumbersThatAdd(sum, numbers);
		System.out.printf("The two numbers that sum %d are %s \n", sum, result.toString());
		
		sum = 819;
		result = find2NumbersThatAdd(sum, numbers);
		System.out.printf("The two numbers that sum %d are %s \n", sum, result.toString());

		sum = 45;
		result = find3NumbersThatAdd(sum, numbers);
		System.out.printf("The three numbers that sum %d are %s \n", sum, result.toString());

		sum = 35;
		result = find3NumbersThatAdd(sum, numbers);
		System.out.printf("The three numbers that sum %d are %s \n", sum, result.toString());

		sum = 999;
		result = find3NumbersThatAdd(sum, numbers);
		System.out.printf("The three numbers that sum %d are %s \n", sum, result.toString());

	
		sum = 17;
		result = findListNumbersThatAdd(sum, numbers);
		System.out.printf("The list of numbers that sum %d are %s \n", sum, result.toString());

	}


	
}



