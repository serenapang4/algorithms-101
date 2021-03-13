package interview_practice_question_0304;

import java.util.ArrayList;

public class PrimeFinder {
	
	public ArrayList<Integer> findPrime(int n) {
		
		ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
		boolean[] primes = new boolean[n];
		for(int index = 0; index < n; index++) {
			primes[index] = true;
		}

		for (int i = 2; i * i < n; i++) {
          
            if (primes[i]) {
                
                for (int j = i * i; j < n; j+=i) {
                	primes[j] = false;
                }
            }
        }
	        for (int i = 2; i < n; i++) {
	            if (primes[i]) {
	               primeNumbers.add(i);
	            }
	        }
		return primeNumbers;
	}
	
	public void print(ArrayList<Integer> primeNumbers) {
		for(int i = 0; i < primeNumbers.size(); i++) {
			System.out.println(primeNumbers.get(i));
		}
	}
			
	public static void main(String[] args) {
		int n = 28;
		
		PrimeFinder finder = new PrimeFinder();
		
		ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
		primeNumbers = finder.findPrime(n);
		finder.print(primeNumbers);
	}
}
