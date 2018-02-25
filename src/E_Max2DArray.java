import java.util.Scanner;
public class E_Max2DArray {

	public static void main(String[] args) {
		int[][]a= {{16,22,99,4,18,-258,4,101,5,98,105,6,15,2,45,33,88,72,16,3 }	};
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
		System.out.print("PrintR&C  "+x+","+y);
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
	