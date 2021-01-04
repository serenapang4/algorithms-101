package interview_practice_questions_0102;

public class SimpleLinkedList {
	 private Node head;
	 	 
	 public <T> void insertFirst(T element) {
		 Node newNode = new Node(element);
		 
		 if(head == null) {
			 head = newNode;
		 }else {
			 head.setNext(head);
			 head = newNode;
		 }	 
	 }
	 
	 public void removeFirst() {
		 head = head.getNext();
	 }
	 
	 public <T> void remove(T element) {
		 Node current = head;
		 Node previous = null; 
		 Node previousNext = previous.getNext();
		 
		 while(current != null) {
			 if(current.getData() == element && previous == null) {
				 head = current.getNext();
				 return;
			 }else if(current.getData() == element){
				 previousNext = current.getNext();
				 return;
			 }
			 previous = current;
			 current = current.getNext();
			 
		 }
	 }
	 
}
