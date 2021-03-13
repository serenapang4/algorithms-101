package iteration;

public class FilterIterator implements Iterator{
	private final Iterator _iterator;
	private final Predicate _predicate;
	
	public FilterIterator(Iterator iterator, Predicate predicate) {
		assert iterator != null : "iterator can't be null";
		assert predicate != null : "predicate can't be null";
		
		_iterator = iterator;
		_predicate = predicate;
	}
	
	
	//TODO: Why do we need filter forwards and backwards?
	public void filterForwards() {
		while(!_iterator.isDone() && !_predicate.evaluate(_iterator.current())) {
			_iterator.next();
		}
	}

	public void filterBackwards() {
		while(!_iterator.isDone() && !_predicate.evaluate(_iterator.current())) {
			_iterator.previous();
		}
	}
	@Override
	public void first() {
		_iterator.first();
		filterForwards();
	}

	@Override
	public void last() {
		_iterator.last();
		filterBackwards();
	}

	@Override
	public boolean isDone() {	
		return _iterator.isDone();
	}

	@Override
	public void next() {
		_iterator.next();
		filterForwards();
	}

	@Override
	public void previous() {
		_iterator.previous();
		filterBackwards();
	}

	@Override
	public Object current() throws IteratorOutOfBoundsException {
		return _iterator.current();
	}

}
