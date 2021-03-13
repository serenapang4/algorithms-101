package interview_questions_arraysAndStrings;

//find if the second string is the permutation of the first string
//permutation example: abc -> bca -> cba
public class PermutationSolution {
	
	public String sort(String s) {
		char[] content = s.toCharArray();
		java.util.Arrays.sort(content);
		return new String(content);
	}
	
	public boolean permutation(String s, String t) {
		if(s.length() != t.length()) {
			return false;
		}
		
		return sort(s).equals(sort(t));
	}

}
