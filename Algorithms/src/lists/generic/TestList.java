package lists.generic;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

public class TestList {

	void test_insert() {
		//List<Integer> expected = new ArrayList<Integer>();
		ArrayList expected = new ArrayList();

		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		expected.add(5);
		
		assertEquals("1 2 3 4 5", expected.toString());
	}
	
	void test_removeElement() {
		//List<Integer> expected = new ArrayList<>();
		ArrayList expected = new ArrayList();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		expected.add(5);

		expected.remove(1);
		assertEquals("2 3 4 5", expected.toString());

		expected.remove(3);
		assertEquals("2 3 4 5", expected.toString());

		expected.remove(89);
		expected.remove(450);
		assertEquals("2 4 5", expected.toString());

		}

}
