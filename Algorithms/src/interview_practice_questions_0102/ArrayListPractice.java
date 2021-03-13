package interview_practice_questions_0102;

public class ArrayListPractice implements List{
	public static final int initialSize = 10;
	Object[] arr;
	int size;
	
	public ArrayListPractice() {
		arr = new Object[initialSize];
		size = 0;
		
	}

	//check if the required size is greater than the initial array
	//if >= to the limit, the create a new array and copy over all the elements from the old array to the new array
	public void ensureCapacity(int limit) {
		
		if(limit <= size) {
			System.out.println("enough capacity");
		}else {
			resize(size * 2);
		}		
	}
	
	public void resize(int newCapacity) {
		Object newArray[] = new Object[newCapacity];
		for(int i = 0; i < size; i ++) {
			newArray[i] = arr[i];		
		}
		arr = newArray;
	}
	
	//make sure the array has enough slot for the new element
	//move all the element in the array to the right by 1 and put the new element to the first position
	//increment size by 1
	@Override
	public void insertFirst(Object element) {
		ensureCapacity(size + 1);
		for(int i = 0; i < size; i++) {
			arr[i+1] = arr[i];
		}
		arr[0] = element;
		size++;
	}
	
	public void moveToLeft(int startPosition) {
		for(int i = startPosition; i < size; i++) {
			arr[i] = arr[i+1];
		}
		size--;
	}

	//find the element to be removed
	//if found, move to the left by one element
	//decrement size by 1
	@Override
	public void remove(Object element) {
		
		for(int i = 0; i < size; i++) {
			if(arr[i] == element) {
				moveToLeft(i);
				size--;
				break;
			}
		}
		
	}

	@Override
	public void removeFirst() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}