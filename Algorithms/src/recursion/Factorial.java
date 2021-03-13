package recursion;

public class Factorial {
	
	public int factorialIterative(int n) {
		if(n == 1){
			return 1;
		}
		
		int result = 1;
		for(int i = 2; i <= n; i++) {
			result = result * i;
			
		}		
		return result;
	}
	
	public int factorialRecursive(int n) {
		if(n == 1) {
			return n;
		}		
		n = n * factorialRecursive(n -1);
		return n;
	}
	
	public static void main(String[] args) {
		int[] n = {5,4,3,2,1};
		Factorial fac = new Factorial();
		
		for(int i = 0; i < n.length; i++) {
			//System.out.println(n[i]);
			int recurRes = fac.factorialRecursive(n[i]);
			int iterRes = fac.factorialIterative(n[i]);
			System.out.println("n: " + n[i] + " Recursive: " + recurRes + " Iterative: " + iterRes);
		}		
		
	}

}
