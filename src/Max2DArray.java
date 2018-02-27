import java.util.Scanner;

public class Max2DArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] b = new int[20];
		int[][] a ={{16,22,99,4,18},{258,4,101,5,98},{105,6,15,2,45},{33,88,72,16,3}};
		System.out.println("SearshArray");
		System.out.print("x[0-3] : ");
		int x = in.nextInt();
		System.out.print("y[0-4] : ");
		int y = in.nextInt();
		searshArray(a, x, y);
		showArray(a,b);
	}
	public static  void searshArray(int[][] a,int x,int y) {
		System.out.println("Sumary : "+a[x][y]);
	}
	public static void showArray(int[][] a,int[] b) {
		int k=0;
		int c=0;
		System.out.println("Arrays2D : ");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				b[k]=a[i][j];
				System.out.print("a["+i+"]["+j+"] = "+a[i][j]+"\t");
				c++;
				if(c==5) {
					System.out.println();
					c=0;
				}
				k++;
			}
		}
		System.out.println();
		System.out.println("Arrays1D : ");
		for(int i=0;i<b.length;i++) {
			System.out.print("b["+i+"] = "+b[i]+"\t");
			c++;
			if(c==5) {
				System.out.println();
				c=0;
			}
		}
	}
}