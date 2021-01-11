package interview_practice_questions_0102;

import interview_practice_questions_0102.DoubleLinkedList.Node;

public class SimpleLinkedList implements List{
	 private Node head;
	 
	 public class Node<T> {
			private T data;
			private Node next;
			//TODO delete previous
			
			public Node(T element){
				assert element != null : "element can't be null";
				data = element;
				next = null;		
			}
	  }
	 	 

	 
	 public void removeFirst() {
		 Node current = head;
		 //case 1: remove the first element in the list follow by more elements
		 if(current.next != null) {
			 Node temp = current.next;
			 head = temp;
		 }
		 //case 2: remove the first and only element in the list
		 else if(current.next == null ) {
			 head = null;
			 return;
		 }
	 }

	@Override
	public void insertFirst(Object element) {
		Node newNode = new Node(element);
		 
		 if(head == null) {
			 head = newNode;
		 }else {			 
			 Node temp = head;
			 head = newNode;
			 head.next = temp;
		//	 temp.previous = newNode;
		 }	 
	}

	@Override
	public void print() {
		Node current = head;
		
		if(head == null) {
			System.out.println("This is an empty list.");
		}else {
			System.out.println("HEAD: " +head.data + " ");
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

	@Override
	public void remove(Object element) {
		 Node current = head;
			// Node previous = null;
			 //d c b a
			 while(current != null) {
				 if(current.next == null ) {
					 System.out.println("data " + current.data + "'s next is null");
				 }else {
				 System.out.println("current" + current.data  + " next: " + current.next.data);}
				 
				 //Case 1: element is the first element in the list follow by other elements
				 if(current.data.equals(element) && current.next != null) {
					 Node temp = current.next;
					 head = temp;
					 break;
				 }
				 //case 2: element has previous element and next element
				 else if(current.next.data.equals(element) && current.next.next!= null) {
					 System.out.println("1");
					 current.next = current.next.next;
					 return;
				 }
				 //case 3: element to be removed is the first/last and only element in the list
				 else if(current.data.equals(element) && current.next == null) {
					 System.out.println("head");
					head = null;
					return;
				 }
			//	previous = current;		 
				current = current.next;	 
			 }	
	}
	

	public static void main(String[] args) {
		SimpleLinkedList list = new SimpleLinkedList();
		
		list.insertFirst("A");
		list.insertFirst("B");
		list.insertFirst("C");
		list.insertFirst("D");
		
		//list.removeFirst();
		//list.removeFirst();
		//list.removeFirst();
		//list.removeFirst();
		
	//	list.remove("D");
	//	list.remove("C");
	//	list.remove("B");
		list.remove("A");
		System.out.println();
		//System.out.println("list: after remove");
		list.print();	
	}
	 
}
