package interview_questions_arraysAndStrings;

public class ReplaceSpace {
	public String replaceSpaces(String s) {
		String result = null;
		System.out.println();
		
		int len = s.length();
		
		int spaces = 0;
		int character_point = 0;
		for(int k = len-1; k > 0; k--) {
			
			if(s.charAt(k) != ' ') {
			//	System.out.println("character point: " + k);
				character_point = k;
				break;
			}		
		}
		char str[] = new char[len * 3];
		for(int j = 0; j < str.length; j++) {
			//str[j] = 'a';
		
		for(int i = 0; i < len; i++) {
			
			if(s.charAt(i) == ' ') {
			//	System.out.println(i);
				
				
			}else {
			//	System.out.println(s.charAt(i));
				str[j] = s.charAt(i);
			}
			//System.out.println(" " + i + " " + s.charAt(i));
		}
		
		}
		
		printArr(str);
		
		
		System.out.println("spaces: " + spaces);
		
		return result;
	}
	
	public void printArr(char arr[]) {
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		ReplaceSpace replace = new ReplaceSpace();
		String str = "Mr John Smith    ";
		System.out.println("string: " + str);
		
		replace.replaceSpaces(str);
		
		
	}

}
