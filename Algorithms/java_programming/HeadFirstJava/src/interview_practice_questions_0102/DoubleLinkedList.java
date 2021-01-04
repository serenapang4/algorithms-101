package interview_practice_questions_0102;

public class DoubleLinkedList {
	private Node headAndTail;
	
	public class Node<T> {
		private T data;
		private Node next;
		private Node previous;
		
		public Node(T element){
			assert element != null : "element can't be null";
			data = element;
			next = null;
		}
		
	}
	
	// head->1<=>2<=>3<=>4<=>5<=>6->tail
	//insert 0
	// head->0<=>1<=>2<=>3<=>4<=>5<=>6->tail
	
	public <T> void insertFirst(T element) {
		Node newNode = new Node(element);
		
		if(headAndTail == null) {
			headAndTail = newNode;
		}else {
			Node temp = headAndTail;
			headAndTail = newNode;		
			headAndTail.next = temp;
		}
	}
	
	public void removeFirst() {
		if(headAndTail.next == null) {
			return;
		}else {
			headAndTail = headAndTail.next;
		}	
	}
	
	public <T> void remove(T element) {
		
		Node current = headAndTail;
		Node previous = null;
		
		while(headAndTail != null) {
		
			//if the element to be removed is the only element in the list
			if(headAndTail.next == null) {
				return;
			}
			//if the element to be removed is the first element in the list
			else if(headAndTail == element) {
				headAndTail = headAndTail.next;
			}else if(current.data == element){
				System.out.println("found: " + current.data);		
				previous.next = current.next;			
				return;
			}
			previous = current;
			current = current.next;
		}			
	}
	
	public void printList(DoubleLinkedList list) {
		while(headAndTail != null) {
			System.out.print(headAndTail.data + " ");
			headAndTail = headAndTail.next;
		}
	}
	
	public static void main(String[] args) {
		DoubleLinkedList list = new DoubleLinkedList();
		list.insertFirst("Hi");
		list.insertFirst("Hello");
		list.insertFirst("yayy");
		
		//list.removeFirst();
		//list.removeFirst();
		
		list.remove("Hello");
		list.printList(list);
	}
		
}

