package interview_practice_questions_0102;

public class ArrayList {
	int capacity;
	int size = 0;
	Object arrayList[];
		
	public ArrayList() {
		capacity = 10;
	}
	
	public void insertAt(int index, Object value) {
		assert value != null : "value can't be null";		
		if(isOutOfBounds(index)) {
			return;
		}		
		ensureCapacity(size+1);			
		arrayList[index] = value;
		size++;
	}
	
	public void ensureCapacity(int size) {
		Object[] newArray = new Object[capacity + capacity*2];	
		System.arraycopy(arrayList, 0, newArray, 0, capacity);
		arrayList = newArray;		
	}
	
	public boolean isOutOfBounds(int index) {		
		if(index < 0 || index > capacity) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void delete(Object value) {
		
		for(int i = 0; i < size; i++) {
			if(arrayList[i].equals(value)) {
				arrayList[i] = null;
				size--;
			}else {
				return;
			}		
		}
		
		
		
	}
	

}
