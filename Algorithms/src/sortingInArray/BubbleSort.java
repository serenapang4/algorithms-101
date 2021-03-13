package sortingInArray;

public class BubbleSort {

	public void bubbleSort(int[] array) {
		for(int i = 0; i < array.length-1; i++) {
			
			
				for(int j = 0; j < array.length-i-1; j++) {
					
					System.out.println("previous: " + array[j] + " next: " + array[j+1]);
				if(array[j] < array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
				}
		}
		
	}

	public void print(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		
		int arrayUnsorted[] = {9,4,7,1,8,3,6};
		BubbleSort bubbleSort = new BubbleSort();
	//	bubbleSort.print(arrayUnsorted);
		bubbleSort.bubbleSort(arrayUnsorted);
		//bubbleSort.print(arrayUnsorted);
		
	}
}
