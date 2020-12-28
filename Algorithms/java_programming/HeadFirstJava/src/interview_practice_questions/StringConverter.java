package interview_practice_questions;

public class StringConverter {
	
	/*
	 *  Running time: O(n) where n is equal to the length of the string. 
	 *  O(n) = cn where c is a small constant.
	 * 
	 * */
	public int stringToInt(String s) {
		int result = 0;
		int sum = 0;	
		int exponent = s.length()-1;
		
		for(int i = 0; i <= s.length() - 1 ; i++) {
			result = s.charAt(i) - '0';
			result = (int) (result * (Math.pow(10, exponent)));
						sum = sum + result;
						exponent --;
		}	
		return sum;
	}
	
	
	public static void main(String[] args) {
		StringConverter converter = new StringConverter();
		//String s = "120";
		//String s = "2046";
		String s = "11620";
		System.out.println(converter.stringToInt(s));		
	}

}
