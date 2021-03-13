package recursion;

public class Printer {
	static int count = 0;
	public void print() {
				
		count++;
		
		if(count <= 5) {
			System.out.println("hi " + count);
			print();
		}
	}
	
	public static void main(String[] args) {
		Printer printer = new Printer();
		printer.print();
	}

}
