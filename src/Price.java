import java.util.Scanner;
public class Price {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum=0;
		double []a= {2.2,3.3,1.1,10.7,56.8,88.1,69.9,44.3,2.4,20,7,
					 5.5,6.6,7.7,8.8,9.9,10.0,11.11,12.12,13.13,14.14};
		for(int i=0;i<20;i++) {
			sum=sum+a[i];
		}
		System.out.println(" sum of all the prices"+sum);
		System.out.print("values less than 5.00  ");
		for(int k=0;k<20;k++) {
			if(a[k]<5) {
				System.out.print("    "+a[k]);
			}
			
			
		}
		double avg=sum/20; 
		System.out.print("\naverage of the prices"+avg);
		System.out.print("\nvalues that are higher than the calculated average value ");
		for(int k=0;k<20;k++) {
			if(a[k]>avg) {
				System.out.print(" "+a[k]);
			}

		}
	}
}



