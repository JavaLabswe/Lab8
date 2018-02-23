import java.util.Scanner;
public class Max2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int max=0;
		int x = 0,y=0,i,j;
		int [][]a = new int[][] {{16,22,99,4},{18,-258,4,101},{5,98,105,6},{15,2,45,33},{88,72,16,3}};
		for(i=0;i<=4;i++) {
			for(j=0;j<=5;j++) {
				if(a[i][j]>max) {
					max = a[i][j];
					x = i;
					y = j;
				}		
				}
			}
		System.out.print("Max : " + max);
		System.out.print("Position is row : "+ x + "Column : " + y);
		}
		
	}

