package lists;

import iteration.Iterator;
import iteration.ArrayIterator;

public class ArrayList implements List{
	public static final int DEFAULT_INITIAL_CAPACITY = 16;	
	private final int _initialCapacity;
	private Object[] _array;
	private int _size; 
	
	public ArrayList() {
		this(DEFAULT_INITIAL_CAPACITY);	
	}

	public ArrayList(int initialCapacity) {
		assert initialCapacity > 0 : "initial capacity must be > 0";
		_initialCapacity = initialCapacity;
		clear();
	}

	@Override
	public Iterator iterator() {
		return new ArrayIterator(_array, 0, _size); 
	}

	@Override
	public void insert(int index, Object value) throws IndexOutOfBoundsException {
		assert value != null : "value can't be null";
		
		if(index < 0 || index > _size) {
			throw new IndexOutOfBoundsException();
		}
		ensureCapacity(_size +1);
		System.arraycopy(_array, index, _array, index+1, _size-index);
		//arraycopy: src the source array; srcPos starting position in the source array; 
		//dest the destination array; destPos starting position to put the data copy in the destination .
		//length the number of array elements to be copied
		_array[index] = value;
		++_size;
	}
	

	private void ensureCapacity(int capacity) {
		 assert capacity > 0 : "capacity must be > 0";
		 
		 if(_array.length < capacity) {
			 Object[] copy = new Object[capacity + capacity/2];
			 System.arraycopy(_array, 0, copy, 0, _size);
			 _array = copy;
		 }
	}

	@Override
	public void add(Object value) {
		insert(_size, value);
	}

	@Override
	public Object delete(int index) throws IndexOutOfBoundsException {
		checkOutOfBounds(index);
		Object value = _array[index];
		int copyFromIndex = index + 1;
		if(copyFromIndex < _size) {
			System.arraycopy(_array, copyFromIndex, _array, index, _size - copyFromIndex);
		}
		_array[--_size] = null;
		return value;
	}

	@Override
	public boolean delete(Object value) {
		int index = indexOf(value);

		if(index != -1) {
			delete(index);
			return false;
		}
		return true;
	}

	@Override
	public void clear() {
		_array = new Object[_initialCapacity];
		_size = 0;
	}

	@Override
	public Object set(int index, Object value) throws IndexOutOfBoundsException {
		assert value != null : "value can't be null";
		checkOutOfBounds(index);
		Object oldValue = _array[index];
		_array[index] = value;
		return oldValue;
	}

	@Override
	public Object get(int index) throws IndexOutOfBoundsException {
		checkOutOfBounds(index);
		return _array[index];
	}

	private void checkOutOfBounds(int index) {
		if(isOutOfBounds(index)) {
			throw new IndexOutOfBoundsException();
		}
	}
	
	private boolean isOutOfBounds(int index) {
		return index < 0 || index >= _size;
	}

	@Override
	public int indexOf(Object value) {
		assert value != null : "value can't be null";
		
		for(int i = 0; i < _size ; ++i) {
			if(_array[i].equals(value)) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public boolean contains(Object value) {
		return indexOf(value) != -1;
	}

	@Override
	public int size() {
		return _size;
	}

	@Override
	public boolean isEmpty() {
		return _size == 0;
	}

}
