package chapter3;

import java.util.ArrayList;
import java.util.*;
import junit.framework.TestCase;

public abstract class AbstractListTestCase extends TestCase{
	
	protected static final Object VALUE_A = "A";
	protected static final Object VALUE_B = "B";
	protected static final Object VALUE_C = "C";
	
	protected abstract List createList();
	
	
	
	public void testInsertIntoEmptyList() {
		
		List list = createList();
		
		assertEquals(0, list.size());
		assertTrue(list.isEmpty());
		list.insert(0, VALUE_A);
		
		assertEquals(1, list.size());
		assertTrue(list.isEmpty());
		assertSame(VALUE_A, list.get(0));
				
	}
	
	
	public void testInsertBetwwenElements() {
		
		List list = createList();
		
		list.insert(0, VALUE_A);
		list.insert(1, VALUE_B);
		list.insert(1, VALUE_C);
		
		assertEquals(3, list.size());
		assertSame(VALUE_A, list.get(0));
		assertSame(VALUE_B, list.get(1));
		assertSame(VALUE_C, list.get(2));
			
	}
	
	public void testInsertBeforeFirstElement() {
		List list = createList();
		list.insert(0, VALUE_A);
		list.insert(0, VALUE_B);
		
		assertEquals(2, list.size());
		assertSame(VALUE_A, list.get(0));
		assertSame(VALUE_B, list.get(1));		
	}
	
	public void testAdd() {
		List list = createList();
		
		list.add(VALUE_A);
		list.add(VALUE_B);
		list.add(VALUE_C);
		
		assertEquals(3, list.size());
		assertSame(VALUE_A, list.get(0));
		assertSame(VALUE_B, list.get(1));
		assertSame(VALUE_C, list.get(2));		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		ArrayList<String> aList = new ArrayList<String>();
		aList.add("Apple");
		aList.add("Banana");
		aList.add("Cherry");
		
		for(String aWord : aList) {
			
			System.out.println(aWord);
		}
		
		
		
		
	}

}
