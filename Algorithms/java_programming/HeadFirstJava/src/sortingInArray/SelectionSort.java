package sortingInArray;

public class SelectionSort {
	
	/*
	 * go thru the whole array
	 * 
	 * find the smallest element and then set it to the first element,
	 * then find the smallest with the rest of the numbers in the array,
	 * if the smallest is found, set it to the "first" place of the list,
	 * and continue until went thru the whole array
	 * 
	 * */
	
	public void sort(int arr[]) {
		 	int n = arr.length; 		  
	        // One by one move boundary of unsorted subarray 
	        for (int i = 0; i < n-1; i++){
	            // Find the minimum element in unsorted array 
	            int min_idx = i; 
	           
	            for (int j = i+1; j < n; j++) 
	                if (arr[j] < arr[min_idx]) 
	                    min_idx = j; 
	  
	            // Swap the found minimum element with the first 
	            // element 
	            int temp = arr[min_idx]; 
	            arr[min_idx] = arr[i]; 
	            arr[i] = temp; 
	        } 
	}
	
	/*
	 * @param firstElement: not the first element of the whole array
	 * but the first element after the sorted array of each pass
	 * */
	public void swap(int arr[], int minimumElement, int firstElement) {
		int temp = arr[minimumElement];
		arr[minimumElement] = arr[firstElement];
		arr[firstElement] = arr[minimumElement];
	}
	
	public void printArray(int array[]) {
		int n = array.length;
		
		for(int i = 0; i < n; i++) {
			System.out.print(array[i] + " ");
		}
		
	}
	
	public static void main(String[] args) {
		SelectionSort sorter = new SelectionSort();
		int arr[] = {9,5,3,2,8,7};
		sorter.sort(arr);
		sorter.printArray(arr);
		
	}

	

}
