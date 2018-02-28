import java.util.Scanner;

public class AddArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[][] a = new int[2][3];
		int[][] b = new int[2][3];
		System.out.println("Insert Array1 : ");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j] = in.nextInt();
			}
		}
		System.out.println("Insert Array2 : ");
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[i].length;j++) {
				b[i][j] = in.nextInt();
			}
		}
		System.out.println("First Array");
		displayArray(a);
		System.out.println("Second Array");
		displayArray(b);
		System.out.println("Result");
		int c=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+b[i][j]+"\t");
				c++;
				if(c==a[i].length) {
					System.out.println();
					c=0;
				}
			}
		}
	}
	public static void displayArray(int[][] a) {
		int c=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+"\t");
				c++;
				if(c==a[i].length) {
					System.out.println();
					c=0;
				}
			}
		}
	}
}
