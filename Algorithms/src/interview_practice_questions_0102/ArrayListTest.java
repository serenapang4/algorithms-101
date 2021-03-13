package interview_practice_questions_0102;

//import static org.junit.jupiter.api.Assertions.*;

//import org.junit.jupiter.api.Test;

public class ArrayListTest {
/**
	@Test
	void test_insertFirst() {
		List<Integer> list = new ArrayList<>();

		list.insertFirst(450);
		list.insertFirst(2);
		list.insertFirst(3);
		list.insertFirst(4);
		list.insertFirst(89);

		assertEquals("89 4 3 2 450", list.toString());
	}

	@Test
	void test_insertFirst_resize() {
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < 100; i++) {
			list.insertFirst(i * 2);
		}

		assertEquals(100, list.getSize());

		StringBuilder sb = new StringBuilder();
		for (int i = 99; i >= 0; i--) {
			sb.append(i * 2);
			sb.append(" ");
		}

		assertEquals(sb.toString().trim(), list.toString());
	}

	@Test
	void test_removeElement() {
		List<Integer> list = new ArrayList<>();

		list.insertFirst(450);
		list.insertFirst(2);
		list.insertFirst(3);
		list.insertFirst(4);
		list.insertFirst(89);

		list.remove(7888);
		assertEquals("89 4 3 2 450", list.toString());

		list.remove(3);
		assertEquals("89 4 2 450", list.toString());

		list.remove(89);
		list.remove(450);
		assertEquals("4 2", list.toString());

		list.remove(4);
		list.remove(2);
		assertEquals("", list.toString());
	}

	@Test
	void test_removeElement_resize() {
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < 100; i++) {
			list.insertFirst(i * 2);
		}

		assertEquals(100, list.getSize());

		for (int i = 50; i >= 0; i--) {
			list.remove(i * 2);
		}

		assertEquals(49, list.getSize());

		// Deleting the other half
		for (int i = 99; i > 50; i--) {
			list.remove(i * 2);
		}

		assertEquals(0, list.getSize());

		assertEquals("", list.toString());
	}

	@Test
	void test_removeFirst() {
		List<Integer> list = new ArrayList<>();

		list.insertFirst(450);
		list.insertFirst(2);
		list.insertFirst(3);
		list.insertFirst(4);
		list.insertFirst(89);

		list.removeFirst();
		assertEquals("4 3 2 450", list.toString());
		assertEquals(4, list.getSize());

		list.removeFirst();
		assertEquals("3 2 450", list.toString());
		assertEquals(3, list.getSize());

		list.removeFirst();
		list.removeFirst();
		assertEquals("450", list.toString());
		assertEquals(1, list.getSize());
		
		list.removeFirst();
		assertEquals(0, list.getSize());
	}
	
	@Test
	void test_removeFirst_resize() {
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < 100; i++) {
			list.insertFirst(i * 2);
		}

		assertEquals(100, list.getSize());

		for (int i = 50; i > 0; i--) {
			list.removeFirst();
		}

		assertEquals(50, list.getSize());

		// Deleting the other half
		for (int i = 50; i > 0; i--) {
			list.removeFirst();
		}

		assertEquals(0, list.getSize());

		assertEquals("", list.toString());
	}
	*/
}


