package chapter3;

public class Element {

	private Object _value;
	private Element _previous;
	private Element _next;

	public Element(Object value) {
		setValue(value);
	}

	public void setValue(Object value) {
		_value = value;

	}

	public Object getValue() {
		return _value;

	}

	public Element getPrevious() {
		return _previous;

	}

	public Element getNext() {
		return _next;
	}
	
	public void setPrevious(Element previous) {
		
		assert previous != null : "previous can't be null";
		_previous = previous;
	}
	
	public void setNext(Element next) {
		
		assert next != null : "next can't be null";
		_next = next;
	}
	
	
	/*when insert a new element in the list
	 * insert the element before another by storing the next and previoud element
	 * and then update them to refer to itself*/
	public void attachBefore(Element next) {
		
		assert next!= null : "next can't be null";
		Element previous = next.getPrevious();
		
		setNext(next);
		setPrevious(previous);

		next.setPrevious(this);
		previous.setNext(this);
		
	}
	/*allows an element to remove itself from the chain by setting the next and previous element
	 * point at one another
	 * 
	 * */
	public void detach() {
		
		_previous.setNext(_next);
		_next.setPrevious(_previous);
		
		
	}
	
	
	
	

}
