package interview_practice_questions_0118;

public class Partitioner {
	
	public int partition(int arr[], int low, int high, int pivot) {
		int len = arr.length;
		int start = low-1;
		int end = high+1;
		
		
			while(true) {
				while(start<end && arr[++start] > pivot);
				
				while(end > start && arr[--end] < pivot);
				
				//System.out.print(arr[start]);
				//System.out.print(arr[end]);
				if(start >= end)
					break;
				
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;				
			}	
			return end;
		//print(newArr);
	}
	
	public void print(int arr[]) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] { 45, 111, 336, 14, 3, 198, 544, 26, 12, 35, 196, 48 };
		Partitioner partitioner = new Partitioner();
		
		partitioner.partition(arr, 0, arr.length-1, 100);
		partitioner.print(arr);
		
	}

}
