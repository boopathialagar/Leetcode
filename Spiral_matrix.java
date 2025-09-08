package matrix;
import java.util.*;

public class Spiral_matrix {
	
	static ArrayList<Integer> spiral(int[][] matrix) {
		
		int rowB = 0;
		int rowE = matrix.length-1;
		int colB = 0;
		int colE = matrix[0].length-1;
		
		ArrayList<Integer> result = new ArrayList<>();
		
		while(rowB <= rowE && colB <= colE) {
			
			// left --> right:
			for(int i =colB; i<=colE ;i++) {
				result.add(matrix[rowB][i]);
			}	
		    rowB++;
		    
		    // top --> bottom:
		    for(int i=rowB; i<=rowE; i++) {
		    	result.add(matrix[i][colE]);
		    }
		    colE--;
		    
		    // right --> left:
			if(rowB <= rowE){
				for(int i =colE; i>=colB; i--) {
		    	result.add(matrix[rowE][i]);
		    	}
		    rowE--;
			}
		    
		    
		    // bottom --> top:
			if(colB <= colE){
				 for(int i=rowE; i>=rowB; i--) {
		    	result.add(matrix[i][colB]);
		    }
		    colB++;
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
		
		ArrayList<Integer> a = spiral(matrix);
		for(int i =0; i<a.size();i++) {
			System.out.println(a.get(i));
		}
	}
}
