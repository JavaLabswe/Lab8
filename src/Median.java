import java.util.Scanner;
import java.util.Arrays;
public class Median {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("N : ");
		int n = in.nextInt();
		int [] a = new int[n];
		for(int i=0;i<a.length;i++) {
			System.out.print((i+1) + " : ");
			a[i] = in.nextInt();
		}
		Arrays.sort(a);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i] + "  ");
		}
		n = n/2;
		System.out.println();
		System.out.print("Median : " + a[n]);
		
	}

}
