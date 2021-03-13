package lists;

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

	public void setPrevious(Element previous) {
		assert previous != null : "previous can't be null";
		_previous = previous;
	}
	
	public Element getPrivious() {
		return _previous;
	}
	
	public void setNext(Element next) {
		assert next != null : "next can't be null";
		_next  = next;
	}
	
	public Element getNext() {
		return _next;
	}
	
	/*
	 * the caller element "this" will be attached 1 position before the passed in element
	 * */
	public void attachBefore(Element next) {
		assert next != null : "next can't be null";
		Element previous = next.getPrivious();
		
		setNext(next);
		setPrevious(previous);
		
		//set "this" to be the previous of the "next"
		next.setPrevious(this);//"this" refers to the one who calls the method
	
		previous.setNext(this);
	}
	
	public void detach() {
		_previous.setNext(_next);
		_next.setPrevious(_previous);
	}
	
}
