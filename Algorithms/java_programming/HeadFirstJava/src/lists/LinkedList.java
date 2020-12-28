package lists;

import iteration.Iterator;
import iteration.IteratorOutOfBoundsException;

public class LinkedList implements List{
	private final Element _headAndTail = new Element(null);
	private int _size;

	@Override
	public Iterator iterator() {
		return new ValueIterator();
	}

	@Override
	public void insert(int index, Object value) throws IndexOutOfBoundsException {
		assert value != null : "value can't be null";
		
		if(index < 0 || index > _size) {
			throw new IndexOutOfBoundsException();
		} 		
		Element element = new Element(value);
		element.attachBefore(getElement(index));
	}

	private Element getElement(int index) {
		Element element = _headAndTail.getNext();
		
		for(int i = index; i > 0; --i) {
			element = element.getNext();
		}
		return element;
	}

	@Override
	public void add(Object value) {
		insert(_size, value);
	}

	@Override
	public Object delete(int index) throws IndexOutOfBoundsException {
		checkOutOfBounds(index);
		Element element = getElement(index);
		element.detach();
		--_size;
		return element.getValue();
	}

	@Override
	public boolean delete(Object value) {
		assert value != null : "value can't be null";
		
		for(Element e = _headAndTail; e != _headAndTail; e = e.getNext()) {
			
			if(value.equals(e.getValue())) {
				e.detach();
				--_size;
				return true;
			}
		}
		return false;
	}

	@Override
	public void clear() {
		_headAndTail.setPrevious(_headAndTail);
		_headAndTail.setNext(_headAndTail);
		_size = 0;
	}

	/*
	 * Why Element element = getElement(index) DONES NOT have to be new Element?
	 * */
	@Override
	public Object set(int index, Object value) throws IndexOutOfBoundsException {
		assert value != null : "value can't be null";
		checkOutOfBounds(index);
		
		Element element = getElement(index);	
		Object oldValue = element.getValue();
		element.setValue(value);
		return oldValue;
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
	public Object get(int index) throws IndexOutOfBoundsException {
		checkOutOfBounds(index);
		return getElement(index).getValue();
	}

	/*
	 * why ++index not index++?
	 * */
	@Override
	public int indexOf(Object value) {
		assert value != null : "value can't be null";
		int index = 0;
		for(Element e = _headAndTail.getNext(); e!= _headAndTail; e = e.getNext()) {
			
			if(value.equals(e.getValue())) {//why not e, why get value?
				return index;
			}
			++index;
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
		return size() == 0;
	}
	
}
