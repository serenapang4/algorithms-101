package interview_practice_questions_0118;


public class HowToPartition {
	
	public static void main(String[] args) {
		int[] array = new int[] { 45, 111, 336, 14, 3, 198, 544, 26, 12, 35, 196, 48 };
		int partIndex = partition(array, 0, array.length -1, 100);
		print(array);
		System.out.println("Partition Index -> " + partIndex);
	}

	/**
	 *  Create two partitions where all the elements greater or equal to pivot are on the left,
	 *  and the smaller are on the right.
	 *  The partition runs in O(n) time.
	 */
	public static int partition(int[] array, int left, int right, int pivot) {
		int leftPtr = left - 1; // right of first element
		int rightPtr = right + 1; // left of pivot

		while (true) {
		
			while (leftPtr < right && 
					array[++leftPtr] > pivot); // Find smaller item.
				
			while (rightPtr > left && 
					array[--rightPtr] < pivot); // Find bigger item

			if (leftPtr >= rightPtr) // if pointers cross,
				break; // partition done
			
			// Not crossed, so swap elements.
			int temp = array[leftPtr];
			array[leftPtr] = array[rightPtr];
			array[rightPtr] = temp;
		}

		// return partition index.
		return leftPtr; 
	}

	public static void print(int[] theArray) {
		for (int j = 0; j < theArray.length; j++)
			System.out.print(theArray[j] + " ");

		System.out.println("");
	}
}

