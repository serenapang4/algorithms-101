package interview_practice_questions_0124;

/**
 * Calculate the square root of a number with an accuracy of 0.0001.
 *
 * sqrt(4.5) = 2.121 2.121 * 2.121 = 4.4999
 * 
 * | 4.5 - 4.4999 | <= 0.0001
 * 
 * sqrt(7) = 2.645
 * sqrt(0.5) = 0.701 
 * sqrt(0.7) = 0.8366 
 * sqrt(0.4) = 0.6324
 *
 * Note: These algorithms doesn't handle the case where the number is too high
 * because number * number will overflow. For examples sqrt(Double.MAX_VALUE)
 * 
 */
public class SquareRoot {

	private static double ACCURACY = 0.0001;

	/**
	 * The running time is (n / ACCURACY).
	 */
	public static double sqrtRecursive(double number) {
		double high = (number < 1) ? 1 : number;
		double low = (number < 1) ? 0 : 1;
		return sqrtRecursive(number, low, high);
	}

	private static double sqrtRecursive(double number, double low, double high) {
		double delta = high - low;
		double mid = low + delta / 2;

		// Another approach
		// if (delta <= ACCURACY) {
		// return mid;
		// }

		if (Math.abs(mid * mid - number) <= ACCURACY) {
			return mid;
		}

		if (mid * mid >= number) {
			return sqrtRecursive(number, low, mid);
		}

		return sqrtRecursive(number, mid, high);
	}

	/**
	 * The running time is (n / ACCURACY).
	 */
	public static double sqrtIterative(double number) {
		double hi = (number < 1) ? 1 : number;
		double lo = (number < 1) ? 0 : 1;
		double mid; // our estimate of sqrt(x)

		while (true) {
			double delta = hi - lo;
			mid = lo + delta / 2;

			if (Math.abs(mid * mid - number) <= ACCURACY)
				break;

			// This condition also works.
			// if (delta <= ACCURACY)
			// break;

			if (mid * mid > number)
				hi = mid;
			else
				lo = mid;
		}

		return mid;
	}

	/**
	 * This brute force algorithm assumes that the result is going to be a multiple
	 * of the {@code ACCURACY}, which is not always true. For example:
	 *
	 * sqrtBruteForce(15.000000) = 0.0000 sqrtBruteForce(16.000000) = 4.0000
	 * sqrtBruteForce(17.000000) = 4.1231
	 * 
	 * The running time is O(n / ACCURACY), which is much larger than O(log (n /
	 * ACCURACY).
	 */
	public static double sqrtBruteForce(double number) {
		double result = 0;
		for (double i = 0; i <= number; i += ACCURACY) {
			if (Math.abs(i * i - number) <= ACCURACY) {
				return i;
			}
		}

		return result;
	}

	public static void main(String[] args) {
		System.out.println("Square Rootlkj");

		System.out.println("SquareRoot.main() " + sqrtIterative(9));
		for (double i = 2; i < 26; i += 1) {
			double number = i;
			String result = String.format(
					"sqrtRecursive(%6.6f) = %.4f, sqrtIterative(%6.6f) = %.4f, "
							+ " sqrtBruteForce(%6.6f) = %.4f",
					number, sqrtRecursive(number), number, sqrtIterative(number), number,
					sqrtBruteForce(number));
			System.out.println(result);
		}
		//
		// When the number is Dobble.MAX_VALUE, a number overflow happens.
		// double number = Double.MAX_VALUE;
		// String result = String.format("sqrtRecursive(%6.6f) = %.4f, sqrtIterative(%6.6f) = %.4f",
		// number, sqrtRecursive(number), number, sqrtIterative(number));
		// System.out.println("Result " + result);
		// System.out.println(Math.sqrt(Double.MAX_VALUE));
	}
}

