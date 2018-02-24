import java.util.Arrays;
import java.util.Scanner;

public class Median {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		int n;
		
		System.out.print("input : ");
		n = in.nextInt();
		
		int[] number = new int[n];
		
		System.out.print("input number :");
		for(int i = 0;i<n;i++) {
			number[i] = in.nextInt();
		}
		Arrays.sort(number);
		System.out.println("Output number");
		for(int i = 0;i<n;i++) {
			System.out.print(number[i]+" ");
		}
		
		System.out.print("Median is :");
		if(n%2 == 1) {
			int pos = (n-1)/2;
			System.out.println(number[pos]);
			
		}else {
			int pos = n /2;
			double sum =number[pos-1] + number[pos];
			sum = sum/2.0;
			System.out.println(sum);
		}

	}

}
