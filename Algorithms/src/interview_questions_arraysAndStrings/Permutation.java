package interview_questions_arraysAndStrings;


public class Permutation {
	
	public String sort(String s) {
		char[] charStr = s.toCharArray();
		java.util.Arrays.sort(charStr);
		return new String(charStr);
	}
	
	public boolean isPermu(String str1, String str2) {
		if(str1.length()!= str2.length()) {
			return false;
		}
		return sort(str1) != sort(str2);
	}
	
	public void printArr(char arr[]) {
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	
	public static void main(String[] args) {
		Permutation permu = new Permutation();
		String str1 = "abc";
		String str2 = "bca";
		//String str2 = "dca";
		boolean result = permu.isPermu(str1, str2);
		
		if(result) {
			System.out.println("is permutation");
		}else {
			System.out.println("not permutation");

		}
	}
}
