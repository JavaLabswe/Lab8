
public class Price {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double [] price = {20.50,20,25.50,2.50,3,4,10,60,50,10,88.50,55.50,90,40,40.50,50,25,30,95,60.50};
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
		
		System.out.println("");
		System.out.print("Average : ");
		System.out.println(avg);
		System.out.println("Values that are hight than the calculated average :");
		for(int i = 0;i<price.length;i++) {
			if(price[i]>avg) {
				System.out.print(price[i]+" ");
			}
		}
	}
		
}
	
