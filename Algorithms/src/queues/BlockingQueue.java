package queues;

public class BlockingQueue implements Queue{
	private final Object _mutex = new Object();
	private final Queue _queue;
	private final int _MaxSize;
	
	public BlockingQueue(Queue queue, int maxSize) {
		assert queue != null : "queue can't be null";
		assert maxSize > 0 : "max size can't be less than 0";
		
		this._queue = queue;
		this._MaxSize = maxSize;
	}

	public BlockingQueue(Queue queue) {
		this(queue, Integer.MAX_VALUE);
	}
	@Override
	public void enqueue(Object value) {
		synchronized(_mutex) {
			while(_queue.size() == _MaxSize) {
				waitForNotification();
			}
			_queue.enqueue(value);
			_mutex.notifyAll();
		}
	}

	private void waitForNotification() {
		try{
			_mutex.wait();
		}catch(InterruptedException e){
			//Ignore
		}
	}

	@Override
	public Object dequeue() throws EmptyQueueException {
		synchronized(_mutex){
			while(_queue.isEmpty()) {
				waitForNotification();
			}
			Object value = _queue.dequeue();
			_mutex.notifyAll();
			return value;
		}
	}

	@Override
	public void clear() {
		synchronized(_mutex) {
			_queue.clear();
			_queue.notifyAll();
		}
	}

	@Override
	public int size() {
		synchronized(_mutex) {
			return _queue.size();
		}
	}

	@Override
	public boolean isEmpty() {
		synchronized(_mutex) {
			return _queue.isEmpty();
		}
	}

}
