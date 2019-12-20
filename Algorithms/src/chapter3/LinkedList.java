package chapter3;

import javax.swing.text.ElementIterator;

import chapter2.Iterator;
import chapter2.IteratorOutOfBoundsException;

public class LinkedList implements List {
	
	private final Element _headAndTail = new Element(null);
	private int size;
	
	public LinkedList() {
		
		clear();
	}
	
	
	@Override
	public Iterator iterator() {
		return new ValueIterator();
	}

	@Override
	public void insert(int index, Object value) throws IndexOutOfBoundsException {
		assert value != null : "value can't be null";
		
		if(index < 0 || index > size) { //_size
			 throw new IndexOutOfBoundsException();		
		}
		
		Element element = new Element(value);
		element.attachBefore(getElement(index));
		++size; // _size

	}
	
	/*
	 * traverse the list in search of the element at the specified position
	 * 
	 * */
	private Element getElement(int index) {
		Element element = _headAndTail.getNext();
		
		for(int i = index; i >0; --i) {
			
			element = element.getNext();
		}
		return element;
	}


	@Override
	public void add(Object value) {
		insert(size, value);

	}

	@Override
	public Object delete(int index) throws IndexOutOfBoundsException {
		
		checkOutOfBounds(index);
		Element element = getElement(index);
		element.detach();
		--size;
		return element.getValue();
	}

	@Override
	public boolean delete(Object value) {
		assert value != null : "value can't be null";
		
		
		for(Element e = _headAndTail.getNext(); 
				    e != _headAndTail;
					e = e.getNext()) {
			
			if(value.equals(e.getValue())) {
				e.detach();
				--size;
				return true;
			}
		}
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}

	@Override
	public Object set(int index, Object value) throws IndexOutOfBoundsException {
		assert value != null : "value can't be null";
		checkOutOfBounds(index);
		Element element = getElement(index);
		Object oldValue = element.getValue();
		element.setValue(value);
		return oldValue;
	}

	@Override
	public Object get(int index) throws IndexOutOfBoundsException {
		checkOutOfBounds(index);
		return getElement(index).getValue();
	}

	private void checkOutOfBounds(int index) {
		if(isOutOfBounds(index)) {
			throw new IndexOutOfBoundsException();	
			
		}
		
	}


	private boolean isOutOfBounds(int index) {
		
		return index < 0 || index >= size;
	}

/*move from one element to the next, if the value if found the position is returned*/
	@Override
	public int indexOf(Object value) {
	
		assert value != null : "value can't be null";
		
		int index = 0;
		
		for(Element e = _headAndTail.getNext(); 
				    e != _headAndTail;
					e = e.getNext()) {
			
			if(value.equals(e.getValue())) {
				return index;
			}
			
			++index;
		}
		
		return -1;
	}
	/*calls index of and returns true*/
	@Override
	public boolean contains(Object value) {
		
		return indexOf(value)!= -1;
	}

	@Override
	public int size() {
	
		return size;
	}

	@Override
	public boolean isEmpty() {
		
		return size() == 0;
	}
	
	
	
	private final class ValueIterator implements Iterator{
		
		private Element _current = _headAndTail;

		@Override
		public void first() {
		
			_current = _headAndTail.getNext();
		}

		@Override
		public void last() {
		_current = _headAndTail.getPrevious();
		}

		@Override
		public boolean isDone() {
			
			return _current == _headAndTail;
		}

		@Override
		public void next() {
			
			_current = _current.getNext();
			
		}

		@Override
		public void previous() {
			
			_current = _current.getPrevious();
		}

		@Override
		public Object current() throws IndexOutOfBoundsException {
			
			if(isDone()) {
				
				throw new IteratorOutOfBoundsException();
			}
			
			return _current.getValue();
		}
		
		
		
	}
	
	
	
	
	

}
