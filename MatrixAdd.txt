class MatrixAdd {
	 public static void main(String args[]){
		 int matrix1[][] = {{1,2,3}, {6,7,8}, {9,8,7}};
		 int matrix2[][] = {{1,0,3}, {6,0,8}, {2,1,2}};
		 
	 
		 for(int r=0; r<matrix1.length; r++){        // ***r = row , c = column ****//
			 for(int c=0; c<matrix1[r].length; c++){
				 System.out.print(matrix1[r][c] + " ");
			 }
			 System.out.println();
		 }
		 System.out.println("  +   ");
		 for(int r=0; r<matrix2.length; r++){        // ***r = row , c = column ****//
			 for(int c=0; c<matrix2[r].length; c++){
				 System.out.print(matrix2[r][c] + " ");
			 }
			 System.out.println();
		 }
		 System.out.println("  =   "); // ADDING 2 MATRIXS//
		 for(int r=0; r<matrix1.length; r++){        // ***r = row , c = column ****//
			 for(int c=0; c<matrix2[r].length; c++){
				 System.out.print(matrix1[r][c]+matrix2[r][c] + "\t ");
			 }
			 System.out.println();
		 }
	 }
}
