package sorting;
import lists.List;

public class BubbleSortListSorter implements ListSortor{
	
	private final Comparator _comparator;
	
	public BubbleSortListSorter(Comparator comparator) {
		assert comparator != null : "comparator can't be null";
		_comparator = comparator;
	}

	@Override
	public List sort(List list) {
		assert list!= null : "list can't be null";
		int size = list.size();
		
		for(int pass = 1; pass < size; ++pass) {
			for(int left = 0; left < (size-1); ++left) {
				int right = left + 1;
				if(_comparator.compare(list.get(left), list.get(right)) > 0) {
					swap(list, left, right);
				}
			}		
		}
		
		return list;
	}
	
	public void swap(List list, int left, int right) {
		Object temp = list.get(left);
		list.set(left, list.get(right));
		list.set(right, temp);
	}
}
