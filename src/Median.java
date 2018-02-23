import java.util.Scanner;
import java.util.Arrays;
public class Median {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
	
		System.out.print("Number: ");
		int n = in.nextInt();
		int [] a = new int[n];
		for(int i=0;i<a.length;i++) {
			System.out.print((i+1) + ": ");
			a[i] = in.nextInt();
		}
		Arrays.sort(a);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i] + "  ");
		}
		if(n%2==0) {
			int m=n/2;
			double p=(a[m]+a[m]-1)/2.0;
			System.out.println();
			System.out.print(" Median " +p);
			
		}
		else {
			System.out.println();
			System.out.print(" Median "+a[n/2]);
		}

		
	}

}
