
public interface Queue {
	public void enqueue(Object value);
	public Object dequeue() throws EmptyQueueException;
	
}
