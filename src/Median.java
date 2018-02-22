import java.util.Scanner;
public class Median {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("input");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int []a=new int[n];
		for(int t=0;t<n;t++) {
			
		
			a[t]=in.nextInt();
		}	
		
		if(n%2==0) {
			int w=n/2;
			double q=(a[w]+a[w]-1)/2.0;
			System.out.print(" "+q);
			
		}
		else {
			System.out.print(" Median"+a[n/2]);
		}

	}

}
