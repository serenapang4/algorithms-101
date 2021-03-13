package interview_practice_questions_0102;

import interview_practice_questions_0102.SimpleLinkedList.Node;

public class DoubleLinkedList implements List{
	private Node headAndTail;
	
	public class Node<T> {
		private T data;
		private Node next;
		private Node previous;
		
	public Node(T element){
		assert element != null : "element can't be null";
		data = element;
		next = null;
		previous = null;
	}
		
	}
	
	@Override
	public void insertFirst(Object element) {
		Node newNode = new Node(element);
		
		if(headAndTail == null) {
			headAndTail = newNode;
		}else {
			Node temp = headAndTail;
			headAndTail = newNode;		
			headAndTail.next = temp;
			temp.previous = newNode;
		}
	}

	@Override
	public void remove(Object element) {
		 Node current = headAndTail;

		 while(current != null) {
			 //Case 1: element is the first element in the list follow by other elements
			 if(current.data.equals(element) && current.next != null && current.previous == null) {
				 Node temp = current.next;
				 headAndTail = temp;
				 headAndTail.previous = null;
				 break;
			 }
			 //Case 2: element is the last element in the list with elements before it
			 else if (current.data.equals(element) && current.next == null && current.previous != null) {
				 Node temp = current.previous;
				 temp.next = null;
				 return;
			 }
			 //Case 3: element has previous node and next node 
			 else if(current.data.equals(element) && current.next != null && current.previous != null) {
				Node temp = current.previous;
				temp.next = current.next;			
				return;
			 }
			 //case 4: element to be removed is the first and only element in the list
			 else if(current.data.equals(element) && current.next == null && current.previous == null) {
				headAndTail = null;
				return;
			 }
			current.previous = current;		 
			current = current.next;	 
		 }	
	}

	@Override
	public void print() {
		Node current = headAndTail;
		
		if(headAndTail == null) {
			System.out.println("This is an empty list.");
		}
		else {	
			System.out.println("HEAD: " +headAndTail.data + " ");
			System.out.print("List: ");
			while(current != null) {
				System.out.print(current.data + " ");
				current = current.next;
			}	
		}
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}
		
	
	// d c b a
	// d 
	public void removeFirst() {
		 Node current = headAndTail;
		 //case 1: remove the first element in the list follow by more elements
		 if(current.next != null && current.previous == null) {
			 Node temp = current.next;
			 headAndTail = temp;
			 headAndTail.previous = null;
		 }
		 //case 2: remove the first and only element in the list
		 else if(current.next == null && current.previous == null) {
			 headAndTail = null;
			return;
		 }
	}
	
	public static void main(String[] args) {
		DoubleLinkedList list = new DoubleLinkedList();
		
		list.insertFirst("A");
		list.insertFirst("B");
		list.insertFirst("C");
		list.insertFirst("D");
		
	//	System.out.println("list: before remove");
	//	list.printList(list);
		
		
		//list.removeFirst();
		//list.removeFirst();
	//	list.removeFirst();
	//	list.removeFirst();
		
		list.remove("D");
		list.remove("C");
		list.remove("B");
		list.remove("A");
		System.out.println();
		//System.out.println("list: after remove");
		list.print();	
	}

	
}

