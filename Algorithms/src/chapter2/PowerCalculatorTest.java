package chapter2;

import junit.framework.TestCase;

/*Base to the power of zero, all the results should be 1*/

public class PowerCalculatorTest extends TestCase{
	
	public void testAnythingRaisedToThePowerOfZeroIsOne() {
		PowerCalculator calculator  = PowerCalculator.INSTANCE;

		assertEquals(1, calculator.calculate(0, 0));
		assertEquals(1, calculator.calculate(1, 0));
		assertEquals(1, calculator.calculate(27, 0));
		assertEquals(1, calculator.calculate(143, 0));		
	}
	
	public void testAnythingRaisedToThePowerOfOneIsItself() {
		PowerCalculator calculator  = PowerCalculator.INSTANCE;

		assertEquals(0, calculator.calculate(0, 1));
		assertEquals(1, calculator.calculate(1, 1));
		assertEquals(27, calculator.calculate(27, 1));
		assertEquals(143, calculator.calculate(143, 1));		
	}
	
	public void testAritarary() {
		PowerCalculator calculator  = PowerCalculator.INSTANCE;

		assertEquals(0, calculator.calculate(0, 2));
		assertEquals(1, calculator.calculate(1, 2));
		assertEquals(4, calculator.calculate(2, 2));
		
		assertEquals(8, calculator.calculate(2, 3));		
		assertEquals(27, calculator.calculate(3, 3));		
	}
	
	
	
	

}
