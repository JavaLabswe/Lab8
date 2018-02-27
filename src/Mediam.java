import java.util.Arrays;
import java.util.Scanner;
public class Mediam {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input Number Array : ");
		int n = in.nextInt();
		int[] a = new int[n];
		for(int i=0;i<a.length;i++) {
			System.out.print("a["+i+"] = " );
			a[i]=in.nextInt();			
		}
		Arrays.sort(a);
		System.out.print("SORT : ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+"\t");	
		}
		System.out.println();
		if(a.length%2==0) {
			System.out.println("Mediam : "+(a[n/2]+a[(n/2)-1])/2.0);
		}
		else {
			System.out.println("Mediam : "+a[n/2]);
		}
	}
}