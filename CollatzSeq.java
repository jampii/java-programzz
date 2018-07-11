import java.util.Scanner;
 class CollatzSeq {
	 public static void main(String args[]){
	Scanner input = new Scanner(System.in);
	 int n;
     System.out.println("enter a num : ");
        n= input.nextInt();
        while(n>1){
        	if(n%2 == 0){
        		n=  n/2;
        		 System.out.println(+n);	
        	}
        	else if(n%2!=0){
        		n= (3*n) + 1;
        		 System.out.println(+n);
        	}
        	else return;
        }
       
 }
 }
