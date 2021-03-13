package binarySearchTree;

public class Node implements Cloneable{

	private Object _value;
	private  Node _parent;
	private  Node _smaller;
	private  Node _larger;
	
	public Node(Object value) {
		this(value, null, null);
	}
	
	public Node(Object value, Node smaller, Node larger) {
		setValue(value);
		setSmaller(smaller);
		setLarger(larger);
		
		if(smaller != null) {
			smaller.setParent(this);
		}
		
		if(larger != null) {
			larger.setParent(this);
		}
	}

	public void setParent(Node node) {
		_parent = _parent;
		
	}

	public void setLarger(Node larger) {
		assert larger != null : "larger can't be null";
		_larger = larger;
	}

	public void setSmaller(Node smaller) {
		assert smaller != getLarger() : "smaller can't be the same as larger"; 
		
	}

	public Node getLarger() {
		return _larger;
	}
	
	public Node getSmaller() {
		return _smaller;
	}
	
	public Node getParent() {
		return _parent;
	}

	public void setValue(Object value) {
		assert value != null : "value can't be null";
		_value = value;
	}
	
	public Object getValue() {
		return _value;
	}
	
	public boolean isSmaller() {
		return getParent() != null && this == getParent().getSmaller();
	}
	
	public boolean isLarger() {
		return getParent() != null && this == getParent().getLarger();
	}
	
	public Node minimum() {
		Node node = this;
		
		while(node.getSmaller()!=null) {
			node = node.getSmaller();
		}
		return node;
	}
	
	public Node maximum() {		
		Node node = this;
		
		while(node.getLarger() != null) {
			node = node.getLarger();
		}		
		return node;
	}
	
	public Node successor() {
		
		if(getLarger() != null) {
			return getLarger().minimum();
		}
		
		Node node = this;
		
		while(node.isLarger()) {
			node = node.getParent();
		}
		return node.getParent();
	}
	
	public Node predeccesor() {
		if(getSmaller() != null) {
			return getSmaller().maximum();
		}
		
		Node node = this;
		while(node.isSmaller()) {
			return node.getParent();
		}
		return node.getParent();
	}
	
	private int size(Node node) {
		return 1 + size(node.getSmaller()) + size(node.getLarger());
	}
	
	public int size() {
		return size(this);
	}
	
	public boolean equals(Object object) {
		if(this == object) {
			return true;
		}
		
		if(object == null || object.getClass() != getClass()) {
			return false;
		}
		
		Node other = (Node)object;
		
		return getValue().equals(other.getValue()) && equalsSmaller(other.getSmaller()) && equalsLarger(other.getLarger());
	}

	private boolean equalsLarger(Node other) {
		return  getLarger() == null && other == null || getLarger() != null && getLarger().equals(other);
	}

	private boolean equalsSmaller(Node other) {
		return getSmaller() == null && other == null || getSmaller() != null && getSmaller().equals(other);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
