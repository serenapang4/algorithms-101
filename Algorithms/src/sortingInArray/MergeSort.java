package sortingInArray;

public class MergeSort {
	
	private void sort(int[] arr,int low, int mid, int high) {
		int i = low;
		int j = mid +1;
		int k = high;
		int[] b = null;
		
		while(i<=mid && j<= high) {
			if(arr[i] <= arr[j]) {
				b[k] = arr[i];
				i++;
			}else {
				b[k] = arr[j];
				j++;
			}
			k++;
		}
		
		if(i > mid) {
			while(j <= high) {
				b[k] = arr[j];
				j++;
				k++;
			}
		}else {
			while(i <= mid) {
				b[k] = arr[i];
				i++;
				k++;
			}
		}
		
	}
	
	public void printArray(int array[]) {
		int n = array.length;
		
		for(int i = 0; i < n; i++) {
			System.out.print(array[i] + " ");
		}		
	}
	
	public static void main(String[] args) {
		MergeSort sorter = new MergeSort();
		int arr[] = {9,5,3,2,8,7};
		int len = arr.length;
		int mid = len/2;
		sorter.sort(arr,0,mid,len-1);		
		sorter.printArray(arr);
	}

	

}
