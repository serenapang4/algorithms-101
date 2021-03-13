package lists.generic;

public class DoubleLinkedList<T>  {
	ListNode head;
	ListNode tail;
	int size;
	
	public DoubleLinkedList() {
		size = 0;
		head = new ListNode();
		tail = new ListNode();
	}

	public void insertAtHead(T value) {
		ListNode newNode = new ListNode(value);
		
		if(head == null) {
			head = newNode;
			newNode.next = tail;
		}else {
			ListNode tmp = head;
			head.next = tmp;
			head = newNode;
			tmp.previous = head;
		}		
	}


	public void insertAtTail(T value) {
		ListNode newNode = new ListNode(value);
		
		if(head == null) {
			head = newNode;
			newNode.next = tail;
		}else {
			ListNode last = head;
			while(last != null) {
				last = last.next;
			}
			last.next = newNode;
			newNode.previous = last;
		}		
	}

	public void remove(T value) {
		ListNode cur = head;
		while(cur != null) {
			cur = cur.next;
			
			if(cur.value == value) {
				cur.previous.next = cur.next;
				break;
			}
		}
		
	}
	

	public int size() {
		return size;
	}
	
	public void traverse(ListNode head) {
		ListNode cur = head;
		while(cur != null) {
			cur = cur.next;
			System.out.println(cur.value);
		}
		
	}
}
