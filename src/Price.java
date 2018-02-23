import java.util.Scanner;
public class Price {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double sum= 0.0;
		double [] a = new double[] {654,4.99,548,12,47,51.21,21.14,84.4,151.47,85.14,52.36,14,2,3,1.25,74.50,25,14.14,47.25,84.99};
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println("Sum =  " + sum);
		System.out.print("Minner 5.00 = ");
		for(int i=0;i<a.length;i++) {
			if(a[i]<5.00) {
				System.out.print(a[i] + "  ");
				}
	}
		System.out.println();
		double avg = sum/a.length;
		System.out.println("average =  " + avg);
		System.out.print("มากกว่าค่าเฉลี่ย  =  ");
		for(int i=0;i<a.length;i++) {
			if(a[i]>avg) {
				System.out.print(a[i] + "  ");
				}
		}
	}
}
