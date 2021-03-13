package stacks;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParenthesis {
	public boolean isBalanced(String expression) {
		int n = expression.length();
		
		Map<Character, Character> map = new HashMap<>();
		  map.put(')','(');
	      map.put('}','{');
	      map.put(']','[');
		
		Stack<Character> stack = new Stack<>();
		
		for(int i = 0; i < n; i++) {
			char c = expression.charAt(i);
			if(map.containsValue(c)) {
				stack.push(c);
			}
			if(map.containsKey(c)) {
				if(stack.peek() == map.get(c)) {
					stack.pop();	
				}
			}
		}
		return stack.isEmpty();
	}
	
	public static void main(String[] args) {
		
	}

}
