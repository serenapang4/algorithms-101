package recursion;

public class Fibinacci {
	static int fib(int n) {
		if(n <= 1)
			return n;
		System.out.println("n : " + n);
		return fib(n-1) + fib(n-2);
	}
	
	public static void main(String args[]) {
		//numbers: //0 1 1 2 3 5 8 13
		//  terms: //0 1 2 3 4 5 6 7
		int terms = 5;
		System.out.println(fib(terms));
	}
}
