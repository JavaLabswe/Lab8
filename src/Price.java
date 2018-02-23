
public class Price {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double [] price = {22.50,23.50,25,2.00,3,4,10.50,60.50,50,10.50,88.50,55.50,90.50,41,45.50,55.50,25,3,91.50,1.50};
		double sum=0,avg=0;
		 for(int i = 0;i<price.length;i++) {
			 sum = sum+price[i];
		 }
		System.out.println("SUM :"+sum);
		System.out.print("Values less than 5.00 : ");
		for(int i = 0;i<price.length;i++) {
			if(price[i]<5.00) {
				System.out.print(price[i]+" ");
			}	
		}
		avg = sum/price.length;
		
		System.out.println(" ");
		System.out.print("Average : "+avg);
		System.out.println("values that  higher  the  average : ");
		for(int i = 0;i<price.length;i++) {
			if(price[i]>avg) {
				System.out.print(price[i]+" ");
			}
		}
	}
		
}
	
