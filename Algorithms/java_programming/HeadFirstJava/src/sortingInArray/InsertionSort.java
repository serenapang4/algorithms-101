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
				//System.out.println(i + " key -> " + key);
				//System.out.println(j + " j -> " + arr[j]);
				//System.out.println( " j +1 -> " + arr[j+1]);
				//System.out.println();
			}
			arr[j+1] = key;		
		
		}
		
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
		sorter.sort(arr);
		sorter.printArray(arr);
		
	}

}
