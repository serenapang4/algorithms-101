package lists.generic;

public class DoublyLinkedList<T> implements GenericList<T>{
	ListNode head;
	ListNode tail;
	int size;
	
	public DoublyLinkedList() {
		size = 0;
		head = new ListNode();
		tail = new ListNode();
		System.out.println("creating a new linkedlist");
	}
	
	@Override
	public T get(int index) {
		// if index is invalid
	    if (index < 0 || index >= size) {
	    	System.out.println("index is not valid");
	    	return null;
	    }

	    ListNode curr = head;
	    
	    for(int i = 0; i < index + 1; ++i) {
	    	curr = curr.next;
	    }
	    return (T) curr.value;
	}

	@Override
	public void insert(T value) {
		ListNode<T> newNode = new ListNode<T>(value);
		if(size == 0) {
			head = newNode;
		}else {
			insertAt(size+1, value);
		}
		size++;		
	}

	@Override
	public void insertAt(int index, T value) {		
		// If index is greater than the length, 
	    // the node will not be inserted.
	    if (index > size) return;

	    if (index < 0) {
	    	index = 0;
	    }
	    size++;
	    ListNode pre = head;
	    for(int i = 0; i < index; i++) {
	    	pre = pre.next;
	    } 
	    
	    ListNode newNode = new ListNode(value);
	    // insert new node
	    newNode.next = pre.next;
	    pre.next = newNode;
	}

	@Override
	public void remove(T value) {
		ListNode<T> cur = head;
		for(int i = 0; i < size; i++) {
			if(cur.value.equals(value)) {
				removeAt(i);
			}
			cur = cur.next;
		}
	}

	@Override
	public void removeAt(int index) {
		 // if the index is invalid, do nothing
	    if (index < 0 || index >= size) {
	    	return;
	    }

	    size--;
	    // find the previous node of the node to be deleted
	    ListNode pre = head;
	    for(int i = 0; i < index; i++) {
	    	pre = pre.next;
	    }
	    // delete pre.next 
	    pre.next = pre.next.next;
	}

	@Override
	public int size() {
		return size;
	}
	
	public void traverse() {		
		ListNode cur = head;;
		while(cur != null) {
			cur = cur.next;
			System.out.println(cur.value);
		}
	}
	
	public static void main(String[] args) {
		DoublyLinkedList<Integer> myList = new DoublyLinkedList<Integer>();
		myList.insert(1);
		myList.get(0);
		
	}

}
