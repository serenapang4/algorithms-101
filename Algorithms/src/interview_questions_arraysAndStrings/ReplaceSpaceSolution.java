package interview_questions_arraysAndStrings;

public class ReplaceSpaceSolution {

	//replace every ' ' space in the word to '%20', except the spaces at the end of the word
	public void replaceSpaces(char[] str, int length) {
		//int spaceCount = 0;
		//int newLength = 0;
		//int i;

		int spaceCount = 0,newLength, i;

		for(i = 0; i < length; i++) {
			if(str[i] == ' ') {
				spaceCount++;
			}
		}
		
		newLength = length + spaceCount*2;
		System.out.println("new length: " + newLength);
		str[newLength] = '\0';
		
		for(i = length-1; i >= 0; i--) {
			System.out.println(i);
			
			if(str[i] == ' ') {
				str[newLength - 1 ]= '0';
				str[newLength - 2 ]= '2';
				str[newLength - 3 ]= '%';		
				newLength = newLength - 3;
				//System.out.println("here" + newLength);
			}else {
				str[newLength - 1 ]= str[i];
				newLength = newLength -1;
			}
		}		
	}
	
	public static void main(String[] args) {
		ReplaceSpaceSolution replace = new ReplaceSpaceSolution();
		String str = "Mr John Smith    ";
		char chars[] = str.toCharArray();
		System.out.println("string: " + str);
		
		replace.replaceSpaces(chars, str.length());
		
		
	}
}
