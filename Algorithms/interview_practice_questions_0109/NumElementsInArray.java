package interview_practice_questions_0109;

import java.util.HashMap;
import java.util.Map;

public class NumElementsInArray {
	
	public HashMap<Integer, Integer> result = new HashMap<
			Integer, Integer>();
	
	public NumElementsInArray(HashMap<Integer, Integer> map) {
		this.result = map;
	}
	public HashMap<Integer, Integer> getCounts(int[] array){	
	
		for(int i = 0 ;i < array.length; i++) {
			//System.out.println("match: "  + array[i]);
			result.put(array[i], 0);
		}
		int count = 0;
		
			for(int i = 0 ;i < array.length; i++) {
				
				for(Map.Entry<Integer, Integer> myMap :result.entrySet()) {

					//System.out.print("Number: " + myMap.getKey() + " ");
					//System.out.println("Counts: " + myMap.getValue());
					
					if(array[i] == myMap.getKey()){
						result.put(array[i], myMap.getValue() +1);
						System.out.println("match: "  + array[i] + " key : " + myMap.getKey() + "count: " +  myMap.getValue());
					}
					
				}
			}		
		
		print();
		return result;
	}
	
	public void print() {
		for(Map.Entry<Integer, Integer> myMap : result.entrySet()) {
			System.out.print("Number: " + myMap.getKey() + " ");
			System.out.println("Counts: " + myMap.getValue());
			
		}
	}
	

	public static void main(String[] args) {
		int[] array = {4, 6, 8, 3, 3, 6, 4, 4, 8, 8};
		
		HashMap<Integer, Integer> result = new HashMap<
				Integer, Integer>();
		NumElementsInArray counter = new NumElementsInArray(result);
		counter.getCounts(array);
		
	}
}
