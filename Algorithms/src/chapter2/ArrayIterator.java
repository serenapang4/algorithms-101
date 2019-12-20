package chapter2;

public class ArrayIterator implements Iterator {
	private final Object[] _array;
	private final int _first;
	private final int _last;
	private int _current = -1;
	
	public ArrayIterator(Object[] array) {
		
		assert array != null : "array can't be null";
		_array = array;
		_first = 0;
		_last = array.length -1;
	}
	
	public ArrayIterator(Object[] array, int start, int length) {
		
		assert array != null : "array can't be null"; 
		assert start >=0 : "start can't be lees than 0";
		assert start <= array.length : "start can not be less than the array length";
		assert length >= 0 : "length can't be less than 0";
		
		_array = array;
		_first = start;
		_last = start + length -1;
		
		assert _last < array.length : "last can not be bigger than the array length";
		
	}

	public static void main(String[] args) {
		Object[] array = new Object[] {"A","B","C","D","E","F"};
		ArrayIterator iterator = new ArrayIterator(array,1,3);

	}

	@Override
	public void first() {
		_current = _first;	
	}

	@Override
	public void last() {
		_current = _last;	
	}

	@Override
	public boolean isDone() {
		
		return _current < _first || _current > _last;
	}

	@Override
	public void next() {
		++_current;
		
	}

	@Override
	public void previous() {
		--_current;
		
	}

	@Override
	public Object current() throws IndexOutOfBoundsException {
		if(isDone()) {
			throw new IteratorOutOfBoundsException();
		}
		return _array[_current];
	}

}
