import java.util.Scanner;
public class AddArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int [][]a=new int[2][3];
		int [][]b=new int[2][3];
		int [][]c=new int[2][3];
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				System.out.print("A : ["+(i+1)+"]["+(j+1)+"] : ");
				a[i][j]=in.nextInt();
			}
	}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				System.out.print("B : ["+(i+1)+"]["+(j+1)+"] : ");
				b[i][j]=in.nextInt();
			}
	}
		System.out.println("Sum");
		for(int k=0;k<a.length;k++) {
			for(int l=0;l<a[0].length;l++) {
				c[k][l]=a[k][l]+b[k][l];
				System.out.print("  "+c[k][l]);
			}
			System.out.println();
		
		

	}
	}
}
	

