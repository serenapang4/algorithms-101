package interview_practice_questions_0102;

public class ArrayList<T> implements List<T> {

	private static final int INITIAL_SIZE = 10;
	
	private Object elements[];
	private int size;
	
	//Constructor takes in the initial size of the array list
	//varaible size to keep track of the size of the arraylist
	public ArrayList() {
		elements = new Object[INITIAL_SIZE];
		size = 0;
	}
	
	//method to resize the array size in case it go over the initial size of the array
	private void ensureCapacity() {
		if (size == elements.length) {
			// Double size.
			resize(elements.length * 2);
		}
	}
	
	//method to resize the array size if there are too much free space in the initial array
	private void reduceCapacityIfRequired() {
		if (size == (elements.length / 2) && size > INITIAL_SIZE) {
			resize(elements.length / 2);
		}
	}
	
	//resize the array by creating a new array with passed in size, and copy over all the element in the old array to the new array
	private void resize(int newSize) {
		Object tmp[] = new Object[newSize];
		for (int i = 0; i < size; i++) {
			tmp[i] = elements[i];
		}
		
		elements = tmp;
	}

	//method to insert a new element to the beginning of the array
	//first make sure it didn't go over the initial size
	//create a new array and then copy all the element from the old array to the new array
	//set the first element to the element required and increment the size variable
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

	//shift the array to left by one element
	private void shiftToLeft(int startIndex) {
		for (int i = startIndex; i < size - 1; i++) {
			elements[i] = elements[i + 1];
		}
	}
	
	//check if the array is wasting too much space
	//iterate thru the array to find the position of the element to be deleted
	//shift all the element to left by one position starting on the position of the to be delete element
	//decrement the size of the array if deleted
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

	//shift all the element in the array by one starting from index 0
	//decrement the size
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
	//method to convert all the element in the array to string 
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

