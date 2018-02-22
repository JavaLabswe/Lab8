import java.util.Scanner;
public class AddArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int [][]a=new int[2][3];
		int [][]b=new int[2][3];
		int [][]c=new int[2][3];
		System.out.print("input ");
		for(int k=0;k<a.length;k++) {
			for(int y=0;y<a[0].length;y++) {
				a[k][y]=in.nextInt();
			}
		
		

	}
		for(int k=0;k<a.length;k++) {
			for(int y=0;y<a[0].length;y++) {
				b[k][y]=in.nextInt();
			}
		
		

	}
		for(int k=0;k<a.length;k++) {
			for(int y=0;y<a[0].length;y++) {
				c[k][y]=a[k][y]+b[k][y];
				System.out.print(" "+c[k][y]);
			}
		
		

	}
	}
}
