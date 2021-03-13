package interview_questions_arraysAndStrings;

public class RotateMatrix {
	
	//n? /2? 
	public void rotate(int[][] matrix, int n) {
		
		for(int layer = 0; layer < n/2; ++layer) {
			int first = layer;
			int last = n - 1 -layer; 
		//	System.out.println("layer: " + layer);
			//System.out.println("last: " + last);
			
			//System.out.println(matrix[0][1]);
			for(int i = first; i < last; ++i) {
				int offset = i - first; //0 , 1
				
			//	System.out.println(" i : " + i);
			//	System.out.println("last: " + last);
			//	System.out.println("offset: " + offset);
				
				//save top
				//0 0
				//0 1
				int top = matrix[first][i];
				//System.out.println(first + " " + i);
				
				//top = left
				//2 0
				//1 0
				matrix[first][i] = matrix[last - offset][first];				
				//System.out.println((last - offset) +" "+ first);
				
				//left = bottom
				//2 2
				//2 1
				matrix[last - offset][first] = matrix[last][last - offset];
				//System.out.println(last + " "+(last - offset));
				
				//bottom = right
				//0 2
				//1 2
				matrix[last][last - offset] = matrix[i][last];
				//System.out.println(i + " "+ last);
				
				//right = top
				matrix[i][last] = top;
			}
		}
	}
	
	public void printArr(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = 0; j < arr.length;j++) {
				System.out.print(arr[i][j] + " ");
			}
				System.out.println();
		}
	}
	
	
	
	public static void main(String[] args) {
		int arr[][] = { {1,2,3},
						{4,5,6},
						{7,8,9}};
		
		RotateMatrix rotate = new RotateMatrix();
		//rotate.printArr(arr);
		
		System.out.println();
		
		rotate.rotate(arr, arr.length);
	}

}
