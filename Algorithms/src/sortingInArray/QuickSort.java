package sortingInArray;

public class QuickSort {
	//O(n^2) O(nlogn)
	private void sort(int[] arr,int low, int high) {
		if(low < high) {
			int loc = partition2(arr, low, high);
			sort(arr, low, loc-1);
			sort(arr, loc+1, high);
		}
	}
	
	private int partition2(int[] arr, int low, int high) {
		 int pivot = arr[high];  
	        int i = (low-1); // index of smaller element 
	        for (int j=low; j<high; j++) 
	        { 
	            // If current element is smaller than the pivot 
	            if (arr[j] < pivot) 
	            { 
	                i++; 
	  
	                // swap arr[i] and arr[j] 
	                int temp = arr[i]; 
	                arr[i] = arr[j]; 
	                arr[j] = temp; 
	            } 
	        } 
	  
	        // swap arr[i+1] and arr[high] (or pivot) 
	        int temp = arr[i+1]; 
	        arr[i+1] = arr[high]; 
	        arr[high] = temp; 
	  
	        return i+1; 
	}
/**
	public int partition(int[] arr, int low, int high) {
		int pivot = arr[low];
		int start = low;
		int end = high;
		
		while(start < end) {
			while(arr[start] <= pivot) {
				start++;
			}
			
			while(arr[end] > pivot) {
				end--;
			}
			
			if(start < end) {
				swap(arr, arr[start], arr[end]);
			}
		}
		swap(arr, arr[low],arr[end]);
		return end;
	}
	
	private void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
*/
	public void printArray(int array[]) {
		int n = array.length;
		
		for(int i = 0; i < n; i++) {
			System.out.print(array[i] + " ");
		}
		
	}
	
	public static void main(String[] args) {
		QuickSort sorter = new QuickSort();
		int arr[] = {9,5,3,2,8,7};
		sorter.sort(arr, 0, arr.length-1);
		System.out.println("sorted array");
		sorter.printArray(arr);
		
	}

	

}
