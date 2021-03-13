package sorting;

import lists.ArrayList;
import lists.List;


//https://www.youtube.com/watch?v=g-PGLbMth_g

public class SelectioSortListSorter implements ListSortor{
	
	private final Comparator _comparator;
	
	public SelectioSortListSorter(Comparator comparator) {
		assert comparator != null : "comparator can't be null";
		_comparator = comparator;
	}

	@Override
	public List sort(List list) {
		assert list != null : "list can't be null";
		int size = list.size();
		
		for(int slot = 0; slot < size -1; ++ slot){
			int smallest = slot;
			for(int check = slot + 1; check < size; ++check) {
				if(_comparator.compare(list.get(check), list.get(smallest))<0) {
					smallest = check;
				}
			}
			swap(list, smallest, slot);
		}
		
		return null;
	}
	
	public void swap(List list, int left, int right) {
		if(left == right) {
			return;
		}
		Object temp = list.get(left);
		list.set(left, list.get(right));
		list.set(right, temp);
	}
	
	public static void printList(List list) {
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
	}
	
	public static void main(String[] args) {
		NaturalComparator comparator = new NaturalComparator();
		SelectioSortListSorter sorter = new SelectioSortListSorter(comparator);
		
		List list = new ArrayList();
		list.add(3);
		list.add(8);
		list.add(5);
		list.add(7);
		list.add(4);
		list.add(9);
		
		sorter.sort(list);
		sorter.printList(list);
	}

}
