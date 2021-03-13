package sorting;

public final class NaturalComparator implements Comparator{

	public static final NaturalComparator INSTANCE = new NaturalComparator();
	
	public NaturalComparator() {
	}
	@Override
	public int compare(Object left, Object right) {
		assert left != null: "left can't be null";
		return ((Comparable)left).compareTo(right);
	}
	
	public int reverseCompare(Object left, Object right) {
		assert right != null : "right can't be null";
		return ((Comparable)right).compareTo(left);
	}

}
