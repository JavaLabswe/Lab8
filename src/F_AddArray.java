import java.util.Scanner;
public class F_AddArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int [][]a = new int[2][3];
		int [][]b = new int[2][3];
		int [][]c = new int[2][3];
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.print("A : ["+(i+1)+"]["+(j+1)+"] : ");
				a[i][j] = in.nextInt();
			}
		}
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.print("B : ["+(i+1)+"]["+(j+1)+"] : ");
				b[i][j] = in.nextInt();
			}	
		}System.out.println("Sum : ");
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				c[i][j] = a[i][j]+b[i][j];
				System.out.print(c[i][j]+ "  ");
				
			}System.out.println();
		}
	}

}
