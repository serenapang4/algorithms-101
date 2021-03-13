package interview_questions_arraysAndStrings;

public class SubStringChecker {
	
	public void isSubString(String s1, String s2) {
		
		char[] possibleString = new char[s2.length()];
		char startWith = s2.charAt(0);
		
		char[] stringInChar = s1.toCharArray();
		
		for(int i = 0; i < s1.length(); i++) {
			if(stringInChar[i] == startWith && (s1.length() - i + 1) >= s2.length()) {
				//System.out.println("found " + stringInChar[i]);
				for(int j = 0; j < s2.length(); j++) {
					possibleString[j] = stringInChar[i+j];
					//System.out.print( possibleString[j]);
				}
			}			
		}
		
	String newStr = possibleString.toString();
	System.out.println("cut str: " + newStr);
	System.out.println("sub str: " + s2);
		if(s2.equals(newStr)) {
			System.out.println("true");
		}
		System.out.println("done");
		
	}
	
	public static void main(String[] args) {
		SubStringChecker checker = new SubStringChecker();
		String s1 = "waterbottle";
		String s2 = "bottle";
		//bo
		checker.isSubString(s1, s2);
		
	}

}
