package binarySearch;

import lists.List;
import sorting.Comparator;

public class IterativeBinaryListSearcher implements ListSearcher{
	
	private final Comparator _comparator;
	
	public IterativeBinaryListSearcher(Comparator comparator) {
		assert comparator != null : "comparator can't be null";
		_comparator = comparator;
	}

	@Override
	public int search(List list, Object key) {
		assert list != null : "list can't be null";
		int lowerindex = 0;
		int upperIndex = list.size()-1;
		
		while(lowerindex < upperIndex) {
			int index = lowerindex + (upperIndex - lowerindex) / 2;
			int cmp = _comparator.compare(key, list.get(index));
			
			
			if(cmp == 0) {
				return index;
			}else if(cmp < 0) {
				upperIndex = index - 1;
			}else {
				lowerindex = index + 1;
			}
		}
		return 0;
	}

}
