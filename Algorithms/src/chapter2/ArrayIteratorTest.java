package chapter2;

import junit.framework.TestCase;

public class ArrayIteratorTest extends TestCase{
	
	public void testIterationRespectsBounds() {
		
		Object[] array = new Object[] {"A","B","C","D","E","F"};
		ArrayIterator iterator = new ArrayIterator(array,1,3);
		/*start with the first element of the array, check if it is the last element in the array
		 * check if it is the same element of the array index, and then proceed to the next element*/
		
		iterator.first(); // the first element called by the user, not the first element in the array
		assertFalse(iterator.isDone());
		assertSame(array[1], iterator.current());
		
		iterator.next();
		assertFalse(iterator.isDone());
		assertSame(array[2], iterator.current());
		
		iterator.next();
		assertFalse(iterator.isDone());
		assertSame(array[3], iterator.current());
		
		iterator.next();
		assertTrue(iterator.isDone());

		try {
			iterator.current();
			fail();
		}catch(IteratorOutOfBoundsException e) {
			//expected
		}
		
	}
	
	
public void testBackwardsIteration() {
		
		Object[] array = new Object[] {"A","B","C"};
		ArrayIterator iterator = new ArrayIterator(array,1,3);
		
		iterator.last();
		assertFalse(iterator.isDone());
		assertSame(array[2], iterator.current());
		
		iterator.previous();
		assertFalse(iterator.isDone());
		assertSame(array[1], iterator.current());
		
		iterator.previous();
		assertFalse(iterator.isDone());
		assertSame(array[0], iterator.current());
		
		iterator.previous();
		assertTrue(iterator.isDone());

		try {
			iterator.current();
			fail();
		}catch(IteratorOutOfBoundsException e) {
			//expected
		}
		
	}
	

}
