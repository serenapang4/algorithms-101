package interview_practice_questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import recursion.subsets.FindAllSubsets;

public class SublistSum {
	
	public static void print(ArrayList<ArrayList<Integer>> array) {
		for(int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i));
		}
	}
	
	private static List<Integer> sublistSum(List<Integer> numbers, int targetSum) {
		
		List<Integer> result= new ArrayList<Integer>();		
		
		ArrayList<ArrayList<Integer>> subsets = new ArrayList<ArrayList<Integer>>();
		subsets = findSubsets(numbers);
		//iterate thru all subset to find one of the subsets that adds to the target sum
		print(subsets);
		for(int i = 0; i < subsets.size(); i++) {
			int sum = 0;
			
			ArrayList<Integer> oneSubset = subsets.get(i);// one arraylist of subset
			for(int j = 0; j < oneSubset.size(); j++) {
				sum = sum + oneSubset.get(j);
			}
			
			if(sum == targetSum) {
				//System.out.println("found");
				result.addAll(oneSubset);
				break;
			}
			
		}
		
		return result;
	}
	
	public static ArrayList<ArrayList<Integer>> findSubsets(List<Integer> numbers){
		ArrayList<ArrayList<Integer>> allSets = new ArrayList<ArrayList<Integer>>();
		
		for(int i = 0; i < numbers.size();i++) {
			
			ArrayList<Integer> singleEle = new ArrayList<Integer>();
			int curEle = numbers.get(i);
			singleEle.add(curEle);
			
			ArrayList<ArrayList<Integer>> tmp = new ArrayList<ArrayList<Integer>>();
			tmp.add(singleEle);
			
			for(int j = 0; j < allSets.size(); j++) {
				ArrayList<Integer> subset = allSets.get(j);
				ArrayList<Integer> copy = new ArrayList<Integer>(subset);
				copy.add(curEle);
				tmp.add(copy);
			}
			allSets.addAll(tmp);
		}		
		return allSets;
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
		
		sum = 13; 
		List<Integer> result = sublistSum(numbers, sum);
		System.out.printf("The lists of numbers that sum to %d are %s \n", sum, result.toString());
		
	}

	
}

