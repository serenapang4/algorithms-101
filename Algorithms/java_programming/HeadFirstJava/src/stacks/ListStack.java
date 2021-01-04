package stacks;

import queues.EmptyQueueException;
import lists.ArrayList;
import lists.LinkedList;
import lists.List;

public class ListStack implements Stack{
	
	private final List _list = new LinkedList();

	@Override
	public void enqueue(Object value) {
		push(value);
	}

	@Override
	public Object dequeue() throws EmptyQueueException {
		try {
		return pop();
		}catch (EmptyStackException e){
			throw new EmptyStackException();
		}
	}

	@Override
	public void push(Object value) {
		_list.add(value);
	}

	@Override
	public Object pop() throws EmptyStackException {
		if(_list.isEmpty()) {
			throw new EmptyStackException();
		}
		return _list.delete(_list.size()-1);
	}

	@Override
	public Object peek() throws EmptyStackException {
		Object result = pop();
		push(result);
		return result;
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
