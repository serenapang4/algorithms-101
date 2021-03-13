package recursion.subsets;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class FindAllSubsetsTest {

	@Test
	void test_with_3_elems() {
		List<String> input = new ArrayList<String>();
		input.add("a");
		input.add("b");
		input.add("c");
		
		List<List<String>> result = FindAllSubsets.findSubsets(input);
		
		List<List<String>> expected = new ArrayList<List<String>>();
		List<String> list1 = new ArrayList<String>();
		list1.add("");
		expected.add(list1);
		
		List<String> list2 = new ArrayList<String>();
		list2.add("a");
		expected.add(list2);
		
		List<String> list3 = new ArrayList<String>();
		list3.add("b");
		expected.add(list3);
		
		List<String> list4 = new ArrayList<String>();
		list4.add("c");
		expected.add(list4);
		
		List<String> list5 = new ArrayList<String>();
		list5.add("a");
		list5.add("b");
		expected.add(list5);
		
		List<String> list6 = new ArrayList<String>();
		list6.add("a");
		list6.add("c");
		expected.add(list6);
		
		List<String> list7 = new ArrayList<String>();
		list7.add("b");
		list7.add("c");
		expected.add(list7);
		
		List<String> list8 = new ArrayList<String>();
		list8.add("a");
		list8.add("b");
		list8.add("c");
		expected.add(list8);
		
		System.out.println("Expected " + expected);
		System.out.println("Result: " + result);
		assertTrue(result.containsAll(expected));
		assertEquals(Math.pow(2, input.size()), result.size());
	}

	
	@Test
	void test_with_4_elems() {
		List<String> input = new ArrayList<String>();
		input.add("a");
		input.add("b");
		input.add("c");
		input.add("d");
		
		
		List<List<String>> result = FindAllSubsets.findSubsets(input);
		
		List<List<String>> expected = new ArrayList<List<String>>();
		List<String> list1 = new ArrayList<String>();
		list1.add("");
		expected.add(list1);
		
		List<String> list2 = new ArrayList<String>();
		list2.add("a");
		expected.add(list2);
		
		List<String> list3 = new ArrayList<String>();
		list3.add("b");
		expected.add(list3);
		
		List<String> list4 = new ArrayList<String>();
		list4.add("c");
		expected.add(list4);
		
		List<String> list5 = new ArrayList<String>();
		list5.add("d");
		expected.add(list5);
		
		List<String> list6 = new ArrayList<String>();
		list6.add("a");
		list6.add("b");
		expected.add(list6);
		
		List<String> list7 = new ArrayList<String>();
		list7.add("a");
		list7.add("c");
		expected.add(list7);
		
		List<String> list8 = new ArrayList<String>();
		list8.add("a");
		list8.add("d");
		expected.add(list8);
		
		List<String> list9 = new ArrayList<String>();
		list9.add("b");
		list9.add("c");
		expected.add(list9);
		
		List<String> list10 = new ArrayList<String>();
		list10.add("b");
		list10.add("d");
		expected.add(list10);
		
		List<String> list11 = new ArrayList<String>();
		list11.add("a");
		list11.add("b");
		list11.add("c");
		expected.add(list11);
		
		List<String> list12 = new ArrayList<String>();
		list12.add("a");
		list12.add("b");
		list12.add("d");
		expected.add(list12);
		
		List<String> list13 = new ArrayList<String>();
		list13.add("b");
		list13.add("c");
		list13.add("d");
		expected.add(list13);
		
		List<String> list14 = new ArrayList<String>();
		list14.add("c");
		list14.add("d");
		expected.add(list14);
		
		List<String> list15 = new ArrayList<String>();
		list15.add("a");
		list15.add("c");
		list15.add("d");
		expected.add(list15);
		
		List<String> list16 = new ArrayList<String>();
		list16.add("a");
		list16.add("b");
		list16.add("c");
		list16.add("d");
		expected.add(list16);
		
		System.out.println("Expected " + expected);
		System.out.println("Result: " + result);
		assertTrue(result.containsAll(expected));
		assertEquals(Math.pow(2, input.size()), result.size());
	}

}
