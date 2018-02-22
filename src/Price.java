
public class Price {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum=0;
		double []a= {1.1,1.2,1.3,1.4,1.5,1.6,1.7,1.8,1.9,1.10,
				2.1,2.2,2.3,2.4,2.5,2.6,2.7,2.8,2.9,2.10};
		for(int i=0;i<20;i++) {
			sum=sum+a[i];
		}
		System.out.println(" sum of all the prices"+sum);
		System.out.print("values less than 5.00  ");
		for(int j=0;j<20;j++) {
			if(a[j]<5) {
				System.out.print("    "+a[j]);
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
