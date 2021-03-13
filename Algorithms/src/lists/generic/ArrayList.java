package lists.generic;

public class ArrayList implements GenericList {
	static Object arr[];
	int size;
	int capacity = 10;
	public ArrayList() {
		this.capacity = capacity;
		arr = new Object[capacity];
		size = 0;
	}
	
	@Override
	public Object get(int index) {
		if(index > size) {
			System.out.println("index greater than size");
			//return null;
		}		
		
		for(int i = 0; i < arr.length; i++) {
			if(index == i) {
				return arr[i];
			}
		}
		return null;
	}
	
	public void ensureCapacity() {
		if(size == arr.length) {
			//create a new array and copy over the old array
			Object[] newArray = new Object[capacity * 2];
			for(int i = 0; i < size; i++) {
				newArray[i] = arr[i];
			}
			arr = newArray;
		}
	}

	@Override
	public void insert(Object value) {		
		ensureCapacity();
		if(size == 0) {
			arr[0] = value;
		}else {
			arr[size] = value;
		}
			size++;
			//System.out.println("value: " + value + " size: " + size);
	}

	@Override
	public void insertAt(int index, Object value) {
		// move every element 1 index to the right
			ensureCapacity();
			
			Object tmp[] = new Object[arr.length];
			int startingPosition = index;
			for(int j = 0; j<startingPosition;j++) {
				tmp[j] = arr[j];
			}
			
		
			for (int i = startingPosition; i < size; i++) {
				tmp[i + 1] = arr[i];
			}
			tmp[index] = value;
			arr = tmp;
			size++;
	}

	@Override
	public void remove(Object value) {
		if(size == 0) {
			return;
		}
		
		for(int i = 0; i < size; i++) {
			if(arr[i] == value) {
				removeAt(i);
			}
		}
	}
	
	public void shiftToLeft(int index) {
		for(int i = index; i < size -1; i++) {
			arr[i] =  arr[i+1];
		}		
	}

	@Override
	public void removeAt(int index) {
		if(size == 0 || index > size) {
			return;
		}
		for(int i = 0; i < size; i++) {
			if(i == index) {
				shiftToLeft(index);
				size--;
				break;
			}
		}
	}

	@Override
	public int size() {
		return size;
	}
	
	public static void print(ArrayList list) {
		for(int i = 0; i < list.size; i++) {
			
			System.out.println("i: " + i + " "  + list.get(i));
		}
	}
	
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.insert("a");
		list.insert("b");
		list.insert("c");
		list.insert("d");
		//list.insertAt(5, "hey");
		System.out.println("list size: " + list.size);
		list.remove("c");
		list.print(list);
		
	}

}
