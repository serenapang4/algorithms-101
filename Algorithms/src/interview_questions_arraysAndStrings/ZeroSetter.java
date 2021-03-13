package interview_questions_arraysAndStrings;

public class ZeroSetter {
	
	public void setZeros(int[][] matrix) {
		boolean[] row = new boolean[matrix.length];
		boolean[] column = new boolean[matrix[0].length];
		
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[0].length; j++) {
				if(matrix[i][j] == 0) {
					row[i] = true;
					column[j] = true;
				}
			}
		}
		
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j <  matrix[0].length; j++) {
				if(row[i] || column[j]) {
					matrix[i][j] = 0;
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		int arr[][] = { {1,2,3},
				{4,5,6},
				{7,8,9}};

	}
}
