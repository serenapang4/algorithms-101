package stacks;
import java.util.ArrayList;
import java.util.Stack;
public class PalimdromFinder {
	
	public boolean isPal(String s) {
		
		if(s.length() < 2 || s == null) {
			return false;
		}
		
		int n = s.length();
		Stack<Character> myStack = new Stack<>();
		
		for(int i = 0; i < n; i++) {
			myStack.push(s.charAt(i));
		}
		
		String reverseString = "";
		for(int j = 0; j < n; j++) {			
			 reverseString = reverseString + myStack.pop();
		}
		//System.out.println("reversed: " + reverseString);	
		return s.equals(reverseString);
	}
	
	public static void main(String[] args) {
		String s = "a";
		String s1 = "aba";
		String s2 = "aabbaa";
		String s3 = "aa";
		String s4 = "ab";
		
		ArrayList<String> list = new ArrayList<String>();
		list.add(s);
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		
		for(int i = 0; i < list.size(); i++) {
			PalimdromFinder pallindromFinder = new PalimdromFinder();
			boolean isPal =	pallindromFinder.isPal(list.get(i));
			
			if(isPal == true) {
				System.out.println("[" + list.get(i) + "]" +  " is a palindrom");
			}else {
				System.out.println("[" + list.get(i) + "]" + " is not a palindrom");
			}

		}		
	
	}

}
