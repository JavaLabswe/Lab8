public class Price {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double []array= {4.0,3.0,2.0,40.0,50.0,60.0,1.0,2.5,1.5,45.0,50.5,60.5,30,20,21,22,34,44,19,15};
		double sum=0;
		for(int i=0;i<array.length;i++) {
			sum+=array[i];
			}
		System.out.print("sum: "+sum);
		System.out.println();
		System.out.print("min:" );
		for(int i=0;i<array.length;i++) {
			if(array[i]<5.0) {
				System.out.print(" "+array[i]);
			}
		}
		System.out.println();
		double avg=sum/20;
		System.out.print("avg :"+avg);
		System.out.println();
		System.out.print("higher:");
		for(int i=0;i<array.length;i++) {
			if(avg<array[i]) {
				System.out.print(" "+array[i]);
			}
		}
	}

}
