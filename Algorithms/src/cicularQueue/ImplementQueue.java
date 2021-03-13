package cicularQueue;

public class ImplementQueue {
	
	
	public static void main(String[] args) {
		int capacity = 5;
		int headIndex = 0;
		int count = 2;
		int lastPositionInQueue = (headIndex + count)%capacity;
		System.out.println("tail: " + lastPositionInQueue);
		
		int index = (headIndex + 1)%capacity;
		System.err.println("head index: " + index);
		
		int tailIndex = (headIndex + count - 1) % capacity;
		System.out.println("tail index: " + tailIndex);
		
		
		//check if cicular queue is full or not
		//0-5
		// int tail= 3;
		int tail= 5;
		int size = 6;
		int head = (tail + 1) % size;
		System.out.println(" head: " + head);
	}

}
