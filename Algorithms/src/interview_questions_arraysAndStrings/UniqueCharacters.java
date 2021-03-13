package interview_questions_arraysAndStrings;

import java.util.HashMap;

public class UniqueCharacters {
	boolean result = true;
	public boolean isUnique(String word) {
		
		HashMap<Integer, Character> myWords = new HashMap();
		for(int i = 0; i < word.length(); i++) {
			//System.out.println(word.charAt(i));
			myWords.put(i, word.charAt(i));
		}
		
		//System.out.println(result);
		//System.out.println("print: ");
		//print(myWords);
		for(int k = 0; k < myWords.size();k++) {
			
			//System.out.println(myWords.get(k));
			for(int j = k+1; j < word.length();j++) {
				
				
			if(myWords.get(k).equals(word.charAt(j))) {
			//	System.out.println("k: " + myWords.get(k) + " j :" + word.charAt(j));
				System.out.println("k: " + myWords.get(k) + " j :" + word.charAt(j) + " are same");
				//result = false;
				//break;
				return true;
			}
			else {
				//System.out.println("unique");
				return false;
			}
			}
		}
		System.out.println(result);
		
		return result;
	}
	
	public void isUniq(boolean result) {
		if(result == true) {
			System.out.println("String is unique");
		}else {
			System.out.println("String is not unique");
		}
	}
	
	public void print(HashMap<Integer, Character> words) {
		for(int i = 0; i < words.size();i++) {
			System.out.println(words.get(i));
		}
	}
	
	public static void main(String[] args) {
		System.out.println();
		UniqueCharacters unique = new UniqueCharacters();
		String word1 = "hello";
		String word2 = "abcd";
		unique.isUniq(unique.isUnique(word1));
		unique.isUniq(unique.isUnique(word2));
		System.out.println();
	}

}
