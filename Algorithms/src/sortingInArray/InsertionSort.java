package sortingInArray;

public class InsertionSort {
	
	public void sort(int arr[]) {
		int n = arr.length;
		
		for(int i = 1; i < n;i++) {
			int key = arr[i];
			int j = i-1;
			
			while(j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j+1] = key;		
		
		}
		
	}
	
	

	

	

	public void insertionSort(int[] arr) {
		
		for(int i = 1; i < arr.length; i++) {
			System.out.println("current: " + arr[i]);			
			int key = arr[i];		
			int j = i - 1;
			System.out.println();
			
			while(j>0 && arr[j] > key) {
				
				arr[j+1] = arr[j]; //switch the position, put the greater one on the left and smaller one on the right
				j--;
				//System.out.println( " " + arr[j]);
			}
			arr[j+1] = key;//insert it to th right place
			
		}
		System.out.println();
	}

	

	

	

	

	

	

	

	

	

	
	
	public void printArray(int array[]) {
		int n = array.length;
		
		for(int i = 0; i < n; i++) {
			System.out.print(array[i] + " ");
		}
		
		
	}
	
	public static void main(String[] args) {
		InsertionSort sorter = new InsertionSort();
		int arr[] = {9,5,3,2,8,7};
	//	  sorter.sort(arr);		
		//sorter.printArray(arr);
		sorter.insertionSort(arr);
		
	}

}
