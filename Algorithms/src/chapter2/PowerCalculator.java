package chapter2;

public final class PowerCalculator {

	public static final PowerCalculator INSTANCE = new PowerCalculator();

	private PowerCalculator() {
	}

	public static int calculate(int base, int exponent) {

		assert exponent >= 0 : "exponent can not be LESS than 0 ";

		int result = 1;
		//base: 2 exponent: 2 result:1  2*2 = 4	
		for(int i = 0; i< exponent;++i) {
			result = result * base;
		}
		

		return result;
	}

	public static void main(String[] args) {

		int base = 2;
		int exponent = 2;
		int result = calculate(base, exponent);

		System.out.println("Base: " + base + " Exponent: " + exponent + " Result: " + result);

	}

}
