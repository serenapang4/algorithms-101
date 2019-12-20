package chapter4;

import chapter3.LinkedList;
import chapter3.List;

public class ListFifoQueue implements Queue {

	private final List _list;

	public public ListFifoQueue() {
		this(new LinkedList);
	}

	public ListFifoQueue(List linkedList) {
		assert linkedList != null : "list can't be null";
		_list = list;
	}

	@Override
	public void enqueue(Object value) {

		_list.add(value);
	}

	@Override
	public Object dequeue() throws EmptyQueueException {

		if (isEmpty()) {

			throw new EmptyQueueException();
		}

		return _list.delete(0); // remove head
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
