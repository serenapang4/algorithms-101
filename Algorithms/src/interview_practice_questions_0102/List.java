package interview_practice_questions_0102;

public interface List<T> {

	/**
	 * Insert one element at the beginning.
	 */
	public void insertFirst(T element);
	
	/**
	 * Remove the element. The given element has to be not null.
	 */
	public void remove(T element);
	
	/**
	 * Remove the first element from the list.
	 */
	public void removeFirst();
	
	/**
	 * Print the list.
	 */
	public void print();
	
	public int getSize();
}

