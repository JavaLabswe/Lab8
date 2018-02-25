import java.util.Scanner;
import java.util.Arrays;
public class D_Median {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);		
		System.out.print("Number: ");
		int n = in.nextInt();
		int [] u = new int[n];
		for(int i=0;i<u.length;i++) {
			System.out.print((i+1) + ": ");
			u[i] = in.nextInt();
		}Arrays.sort(u);
		for(int i=0;i<u.length;i++) {
			System.out.print(u[i] + "  ");
		}if(n%2==0) {
			int m=n/2;
			double p=(u[m]+u[m]-1)/2.0;
			System.out.println();
			System.out.print("Median " +p);			
		}else {
			System.out.println();
			System.out.print(" Median "+u[n/2]);
		}		
	}
}
