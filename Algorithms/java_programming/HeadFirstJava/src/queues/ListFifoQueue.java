package queues;

import java.util.List;

public class ListFifoQueue implements Queue{
	
	private final  List _list;
	
	public ListFifoQueue(List list) {
		assert list != null : "list can't be null";
		_list = list;
	}
	

	@Override
	public void enqueue(Object value) {
		_list.add(value);
	}

	@Override
	public Object dequeue() throws EmptyQueueException {
		if(isEmpty()) {
			throw new EmptyQueueException();
		}
		return _list.remove(0);
	}

	@Override
	public void clear() {
		_list.clear();
	}

	@Override
	public int size() {
		return _list.size();
	}

	@Override
	public boolean isEmpty() {
		return _list.isEmpty();
	}

}
