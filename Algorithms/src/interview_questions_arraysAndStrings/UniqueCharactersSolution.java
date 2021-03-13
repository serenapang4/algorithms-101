package interview_questions_arraysAndStrings;

public class UniqueCharactersSolution {
	
	public boolean isUniqueChars(String str) {
		if(str.length() > 256) {
			return false; 
		}
		
		boolean[] char_set = new boolean[256];
		for(int i = 0; i< str.length();i++) {
			int val = str.charAt(i);
			if(char_set[val]) {
				return false;
			}
			char_set[val] = true;
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		UniqueCharactersSolution unique = new UniqueCharactersSolution();
		String word1 = "hello";
		String word2 = "abcd";
		boolean result = unique.isUniqueChars(word1);
		boolean result1 = unique.isUniqueChars(word2);
		
		if(result1 == true) {
			System.out.println("String is unique");
		}else {
			System.out.println("String is not unique");
		}
		
		System.out.println();
	}

}
