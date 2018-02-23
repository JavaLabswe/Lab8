import java.util.Scanner;

public class Max2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]a= {{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15},
				{16,17,18,19,20}
			};
		int max=0;
		int x = 0,y = 0;
		int temp = 0;
		int []w=new int[a.length*a[0].length];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				if(a[i][j]>max) {
					max=a[i][j];
					x=i;
					y=j;
					
					
				}
				
			}
		}
		System.out.println("Max : " + max);
		System.out.print("print  "+x+","+y);
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length-1;j++) {
				if(a[i][j]>a[i][j+1]) {
					temp=a[i][j];
					a[i][j]=a[i][j+1];
					a[i][j+1]=temp;
					
				}
			}
		}
	

	}
}
	

