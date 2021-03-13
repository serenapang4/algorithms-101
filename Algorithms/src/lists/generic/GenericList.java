package lists.generic;

public interface GenericList<T> {

	/**
	 * Returns the element at the given index.
	 * @param index
	 * @return
	 */
	public T get(int index);

	/**
	 * Inserts at the beginning of the list.
	 * @param value
	 */
	public void insert(T value);
	
	/**
	 * Insert the {@code value} at the given index.
	 * 
	 * Throws an exception if the index is Out of range or if it is invalid.
	 * @param index
	 * @param value
	 */
	public void insertAt(int index, T value);
	
	/**
	 * Removes the first element with the given value.
	 * @param value
	 */
	public void remove(T value);
	
	/**
	 * Removes the element at the given index.
	 *
	 * @param index
	 */
	public void removeAt(int index);


	/**
	 * Returns the size of the list.
	 *
	 * @return
	 */
	public int size();
}
