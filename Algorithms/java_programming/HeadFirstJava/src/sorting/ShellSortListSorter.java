package sorting;

import lists.List;

public class ShellSortListSorter implements ListSortor{
	
	private final Comparator _comparator;
	private final int[] _increments = {121, 40, 13, 4,1};
	
	public ShellSortListSorter(Comparator comparator) {
		assert comparator != null : "comparator can't be null"; 
		_comparator = comparator;
	}

	@Override
	public List sort(List list) {
		assert list != null : "list can't be null";
		
		for(int i = 0; i < _increments.length; i++) {
			int increment = _increments[i];
			hSort(list, increment);
		}		
		return list;
	}

	private void hSort(List list, int increment) {
		if(list.size() < (increment * 2)) {
			return;
		}
		
		for(int i = 0; i< increment; ++i) {
			sortSublist(list, i, increment);
		}
		
	}

	private void sortSublist(List list, int startIndex, int increment) {
		// TODO Auto-generated method stub
		
	}
	

}
