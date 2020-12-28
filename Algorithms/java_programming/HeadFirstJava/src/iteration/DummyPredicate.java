package iteration;

public final class DummyPredicate implements Predicate{
	private final Iterator _iterator;
	private final boolean _result;
	
	public DummyPredicate(boolean result, Iterator iterator) {
		_iterator = iterator;
		_result = result;
		_iterator.first();
	}

	@Override
	public boolean evaluate(Object object) {
		assertSame(_iterator.current(),object);
		_iterator.next();
		return _result;
	}

	private boolean assertSame(Object current, Object object) {
		return current.equals(object);		
	}

}
