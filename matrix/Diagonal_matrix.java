package matrix;

import java.util.ArrayList;

public class Diagonal_matrix {
	
	
	static ArrayList<Integer> diagonal(int[][] matrix){
	
		ArrayList<Integer> result = new ArrayList<>();
		
		int m = matrix.length;
		int n = matrix[0].length;

		for(int k=0;k<m;k++){
			int i = k;
			int j = 0;
			while(i>=0 && j<m){
				result.add(matrix[i][j]);
				i--;
				j++;
			}
		}
		for(int k=1;k<n;k++){
			int i = n-1;
			int j = k;
			while(i >=0 && j<m){
				result.add(matrix[i][j]);
				i--;
				j++;
			}
		}



		return result;
		
	}
	public static void main(String[] args) {
		int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[i].length; j++ ) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		ArrayList<Integer> a = diagonal(matrix);
		for(int i =0; i<a.size();i++) {
			System.out.println(a.get(i));
		}
	}

}
