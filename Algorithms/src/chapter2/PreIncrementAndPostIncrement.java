package chapter2;

public class PreIncrementAndPostIncrement {
	
	public static void preIncrement() {
				
		int result = 1;
		for(int i = 0; i < 10; ++i ) {
			result = i +result;
			System.out.println("i - " + i + " result - "+ result);
		}
	}
	
	public static void postIncrement() {
		int result =1;
		for(int i = 0; i < 10; i++) {
			result = i +result;
			System.out.println("i - " + i+ " result - "+ result);
		}
	}
	
public static void main(String[] args) {
	
	PreIncrementAndPostIncrement.preIncrement();
	System.out.println("=================");
	PreIncrementAndPostIncrement.postIncrement();
	
	
}
}
