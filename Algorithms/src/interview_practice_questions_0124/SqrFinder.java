package interview_practice_questions_0124;

public class SqrFinder {
	
	public double findSqrt(double num) {		
		double result = 0.0000;
		
		
			double number = num;
			double previous = 0.0;
			double check = (number * number) - number;
			
			while((number*number) > num) {
				System.out.println(number);
				number = number /2;
				previous = number;
				
				if(Math.abs(check) > 0.0001) {
					System.out.println();
				}
				findSqrt(number);
			}
			
			
		result = number + (previous - number);
		
		return result;
	}
	
	public double findSqroot(double num) {	
		
			double result = 0.0000;	
			double mid = num/2;
			double square = mid * mid;
			double check = square - num;
			
			double previousMid = 0.0;
			
			//while square is greater than the number pass in, keep divide it
			//if the square result is less than the number,
			//find the mid point of the first square result and the second square result
			
			if(square == num || check < 0.0001) {			
				result = mid;
			}else if(square > num) {
				mid = mid / 2 ;
				previousMid = mid;
			}else {
				mid = mid + (previousMid - mid)/2;
			}
			
		result = mid;
		
		return result;
	}
	
	public int findsqr(int num, int start, int end) {
		int low = start;
		int high = end;		
		int mid = 0;	
		int square = 0;
		int result = 0;
		
		
		while(low < high) {
			mid = (low + high)/2;
			square = mid * mid;
			System.out.println("square: " + square);
			if(square == num) {			
				result = mid;
				break;
			}else if(square > num) {// answer on the left
				high = mid + 1;
				findsqr(num, low, high);
			}else {//answer on the right
				low = mid + 1;
				findsqr(num, low, high);
			}
			
			if(low>=high) {
				break;
			}
			
		}
		
		return result;
	}
	
	
	
	public static void main(String[] args) {
		SqrFinder finder = new SqrFinder();
		double num = 9;
		//double num = 4.5;		
		//double result = finder.findSqroot(num);
		
		int number = 9;		
		int result = finder.findsqr(number, 0, number);
		
		System.out.println("square root of " + number + " is " + result);
	}

}
