package sorting;

import iteration.Iterator;
import lists.LinkedList;
import lists.List;

//https://www.youtube.com/watch?v=JU767SDMDvA

public class InsertionSortListSorter implements ListSortor{

	private final Comparator _comparator;
	
	public InsertionSortListSorter(Comparator comparator) {
		assert comparator != null : "comparator can't be null";
		_comparator = comparator;
	}
	
	@Override
	public List sort(List list) {
		assert list != null : "list can't be null";
		final List result = new LinkedList();
		Iterator it = list.iterator();
		
		for(it.first(); !it.isDone();it.next()) {
			int slot = list.size();
			while(slot > 0) {
				if(_comparator.compare(it.current(), result.get(slot-1)) >= 0) {
					break;
				}
				--slot;
			}
			result.insert(slot, it.current());
		}
		return result;
	}

	
}
