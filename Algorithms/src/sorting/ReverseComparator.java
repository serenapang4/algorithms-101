package sorting;

public class ReverseComparator implements Comparator{

	private final Comparator _comparator;
	
	public ReverseComparator(Comparator comparator) {
		assert comparator != null;
		_comparator = comparator;
	}

	@Override
	public int compare(Object left, Object right) {
		return _comparator.compare(right, left);
	}
	

}
