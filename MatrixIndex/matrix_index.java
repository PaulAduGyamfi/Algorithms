public class MatrixRand {
	 public static void main(String[] args) {
	 
	        int[][] matrix = new int[4][4];

	        int mostrow = 0;
	        int largest = -1;
	        for (int i = 0; i < matrix.length; i++) {
	            int row = 0;
	            for (int j = 0; j < matrix[i].length; j++) {
	                matrix[i][j] = (int)(Math.random() * 2);
	                row += matrix[i][j];
	                System.out.print(matrix[i][j]);
	            }
	            if (row > largest) {
	                mostrow = i;
	                largest = row;
	            }
	            System.out.println();
	        }

	        int column = 0;
	        largest = -1;
	        for (int j = 0; j < matrix[0].length; j++) {
	            int count1 = 0;
	            for (int i = 0; i < matrix.length; i++) {
	                count1 += matrix[i][j];
	            }
	            if (count1 > largest) {
	                largest = count1;
	                column = j;
	            }

	        }	        
	
	        System.out.println("The largest row index: " + mostrow);
	        System.out.println("The larges column index: " + column);
	    }


	}
