package interview_practice_questions_0102;

public class ArrayListPractice {
	
	public static void printList(Object[] arraylist) {
		if(arraylist.length == 0) {
			System.out.println("List is empty");
		}else {		
			for(int i = 0; i < arraylist.length; i++) {
				System.out.print(arraylist[i] + " " );
			}
		}
	}

	
public static void main(String[] args) {
	Object[] oldArray= {1,2,3,4}; 
	Object[] newArray = {1,1,1,1,1};
	
	//ArrayListPractice.printList(oldArray);
	//ArrayListPractice.printList(newArray);
	
	//add new element to first position	
	/**
	for(int i = 0; i < oldArray.length; i++){
		newArray[i + 1] = oldArray[i];
	}	
	newArray[0] = 9;
	*/
	
	//remove element from first position
	for(int i = 0; i < oldArray.length-1; i++){
		newArray[i] = oldArray[i+1];
	}
	
	
	ArrayListPractice.printList(newArray);

	}
}
