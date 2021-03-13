package interview_practice_questions_recursion_dynamic_programming;

import java.util.ArrayList;
import java.util.List;

public class SubsetsOfASet {
	
	ArrayList<ArrayList<Integer>> getSubsets(ArrayList<Integer> set, int index){		
		ArrayList<ArrayList<Integer>> allSubsets;
		if(set.size() == index) {
			allSubsets = new ArrayList<ArrayList<Integer>>();
			allSubsets.add(new ArrayList<Integer>());
		}else {
			allSubsets = getSubsets(set, index + 1);
			int item = set.get(index);
			ArrayList<ArrayList<Integer>> moreSubsets = new ArrayList<ArrayList<Integer>>();
			
			for(ArrayList<Integer> subset : allSubsets) {
				ArrayList<Integer> newSubsets = new ArrayList<Integer>();
				newSubsets.addAll(subset);
				newSubsets.add(item);
				moreSubsets.add(newSubsets);
			}
			allSubsets.addAll(moreSubsets);
		}
		return allSubsets;		
	}
	
	ArrayList<ArrayList<String>> findSubSets(ArrayList<String> set){
		//data structure to store all subsets found in the set
		ArrayList<ArrayList<String>> result;
		result = new ArrayList<ArrayList<String>>(); //"[]"
		
		
		
		for(int i = 0; i < set.size(); i++) {		
			String curEle = set.get(i);
			ArrayList<String> singleEle = new ArrayList<String>();
			singleEle.add(curEle);
			
			ArrayList<ArrayList<String>> tmp = new ArrayList<ArrayList<String>>();
			tmp.add(singleEle);
			
			for(int j = 0; j < result.size(); j++) {
				ArrayList<String> subset = result.get(j);
				ArrayList<String> copy = new ArrayList<String>(subset);
				copy.add(curEle);
				tmp.add(copy);
			}
			result.addAll(tmp);
		}	
		return result;
	}
	

	public void print(ArrayList<ArrayList<String>> array) {
		for(int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i));
		}
	}
	
	public static void main(String[] args) {
		
		ArrayList<String> set = new ArrayList<String>();
		set.add("1");
		set.add("2");
		set.add("3");
		set.add("4");
		
		SubsetsOfASet setsFinder = new SubsetsOfASet();
		
		//ArrayList<ArrayList<Integer>> result = setsFinder.getSubsets(set, 0);	
		ArrayList<ArrayList<String>> result = setsFinder.findSubSets(set);
		setsFinder.print(result);
		
		
		
	}

}
