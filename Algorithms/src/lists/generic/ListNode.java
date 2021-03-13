package lists.generic;

public class ListNode<T> {
	T value;
	ListNode<T> previous;
	ListNode<T> next;
	
	public ListNode() {
		
	}
	
	public ListNode(T value) {
		this.value = value;
	}
	
	public ListNode(ListNode<T> prev, T value, ListNode<T> next) {
		this.previous = prev;
		this.next = next;
		this.value = value;
	}
	
}
