package interview_practice_questions_0102;

public class Node<T> {
	private T data;
	private Node next;
	private Node previous;
	
	public Node(T element){
		assert element != null : "element can't be null";
		data = element;
		next = null;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	public T getData() {
		return data;
	}

	public Node getPrevious() {
		return previous;
	}

	public void setPrevious(Node previous) {
		this.previous = previous;
	}

}
