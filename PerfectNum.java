import java.util.Scanner;
 
public class PerfectNum {
	
	public static void main(String args[]) {
		int i, n, Sum = 0 ;
		Scanner input = new Scanner(System.in);		
		System.out.println(" Enter any Number: ");
		n = input.nextInt();
 
		for(i = 1 ; i < n ; i++) {
			if(n % i == 0)  {
				Sum = Sum + i;
			}
		}
		if (Sum == n) {
			System.out.format("It is a Perfect Number", +n);
		}
		else {
			System.out.format("It is NOT a Perfect Number", +n);
		}
	}
}