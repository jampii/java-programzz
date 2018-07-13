 class MultiDi {
	 public static void main(String args[]){
		 int array[][] = {{11,22,33,44,55}, {66,77,88,99,00}, {1,2,3,4,5}};
		 multiDi (array);       // **calling main method ***//
	 }
	 public static void multiDi (int dummy[][]){
		 for(int r=0; r<dummy.length; r++){        //***** r = row , c = column  ****** //
			 for(int c=0; c<dummy[r].length; c++){
				 System.out.print(dummy[r][c] + "\t");
			 }
			 System.out.println();
		 }
		 
	 }
}
