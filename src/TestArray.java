import java.util.Scanner;
public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int b=0;
		int []a = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50};
		System.out.print("25 ตัวแรก :");
		for(int i=0;i<a.length/2;i++) {
			System.out.print(Math.pow(a[i], 2) + "   ");
		}
		System.out.println();
		System.out.print("25 ตัวหลัง :");
		for(int i=25;i>0;i--) {
			System.out.print(Math.pow(a[i], 3) + "   ");
		}
		for(int i=0;i<50;i++) {
			for(int j=0;j<10;j++) {
				if(i<=50/2) {
					System.out.print(Math.pow(a[i],2) + "   ");
				}
				else {
					System.out.print(Math.pow(a[i],3) + "   ");
				}
			}
			System.out.println();
		}
	}

}
