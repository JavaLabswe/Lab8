import java.util.Arrays;
import java.util.Scanner;
public class Median {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("input");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int []a=new int[n];
	
		for(int i=0;i<n;i++) {
			
		
			a[i]=in.nextInt();
		}	
		
		if(n%2==0) {
			int b=n/2;
			double q=(a[b]+a[b]-1)/2.0;
			System.out.print(" "+q);
			
		}
		else {
			System.out.print(" Median"+a[n/2]);
		}

	}

}