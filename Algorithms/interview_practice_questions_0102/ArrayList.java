package interview_practice_questions_0102;

public class ArrayList<T> implements List<T> {

	private static final int INITIAL_SIZE = 10;
	
	private Object elements[];
	private int size;
	
	public ArrayList() {
		elements = new Object[INITIAL_SIZE];
		size = 0;
	}
	
	
	private void ensureCapacity() {
		if (size == elements.length) {
			// Double size.
			resize(elements.length * 2);
		}
	}
	
	private void reduceCapacityIfRequired() {
		if (size == (elements.length / 2) && size > INITIAL_SIZE) {
			resize(elements.length / 2);
		}
	}
	
	private void resize(int newSize) {
		Object tmp[] = new Object[newSize];
		for (int i = 0; i < size; i++) {
			tmp[i] = elements[i];
		}
		
		elements = tmp;
	}

	@Override
	public void insertFirst(T element) {
		ensureCapacity();
		Object tmp[] = new Object[elements.length];
		for (int i = 0; i < size; i++) {
			tmp[i + 1] = elements[i];
		}
		tmp[0] = element;
		elements = tmp;
		size++;
	}

	private void shiftToLeft(int startIndex) {
		for (int i = startIndex; i < size - 1; i++) {
			elements[i] = elements[i + 1];
		}
	}
	
	@Override
	public void remove(T element) {
		reduceCapacityIfRequired();
		for (int i = 0; i < size; i++) {
			if (element.equals(elements[i])) {
				shiftToLeft(i);
				size--;
				break;
			}
		}
	}

	@Override
	public void removeFirst() {
		reduceCapacityIfRequired();
		if (size > 0) {
			shiftToLeft(0);
			size--;
		}
	}

	@Override
	public void print() {
		System.out.println(toString());
	}
	
	public int getSize() {
		return size;
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < size; i++) {
			if (i != 0) {
				builder.append(" ");	
			}
			builder.append(elements[i]);
		}
		
		return builder.toString();
	}
}

