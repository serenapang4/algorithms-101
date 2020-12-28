package lists;

import iteration.Iterator;
import iteration.IteratorOutOfBoundsException;

public final class ValueIterator implements Iterator {

	private static final Element _headAndTail = null;
	
	private Element _current = _headAndTail.getNext();
	@Override
	public void first() {
		_current = _headAndTail.getNext();
	}

	@Override
	public void last() {
		_current = _headAndTail.getPrivious();
	}

	@Override
	public boolean isDone() {
		return _current == _headAndTail;
	}

	@Override
	public void next() {
		_current.getNext();
	}

	@Override
	public void previous() {
		  _current.getPrivious();
	}

	@Override
	public Object current() throws IteratorOutOfBoundsException {
		if(isDone()) {
			throw new IndexOutOfBoundsException();
		}
		return _current.getValue();
	}
}
