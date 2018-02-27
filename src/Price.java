public class Price {
	public static void main(String[] args) {
		double[] a = new double[20];
		a[0]=1.2;
		a[1]=2.19;
		a[2]=3.18;
		a[3]=4.17;
		a[4]=5.16;
		a[5]=6.15;
		a[6]=7.14;
		a[7]=8.13;
		a[8]=9.12;
		a[9]=10.11;
		a[10]=11.10;
		a[11]=12.09;
		a[12]=13.08;
		a[13]=14.07;
		a[14]=15.06;
		a[15]=16.05;
		a[16]=17.04;
		a[17]=18.03;
		a[18]=19.02;
		a[19]=20.01;
		double sum = displaySum(a);
		double avg = (sum/a.length);
		System.out.println("SUM : "+sum);
		displayMAXMIN(a);
		System.out.println("AVG : "+avg);
		System.out.println("Above average : ");
		displayMaxAVG(a, avg);
	}
	public static double displaySum(double[] a) {
		double sum=0;
		for(int i=0 ;i<a.length;i++) {
			sum=sum+a[i];
		}
		return sum;
	}
	public static void displayMAXMIN(double[] a) {
		int max = 0,min=0;
		double Min=100.0,Max=0.0;
		for(int i=0 ;i<a.length;i++) {
			if(a[i]>Max) {
				max=i;
			}
			else if(a[i]<Min) {
				min=i;
			}
		}
		System.out.println("Max : "+a[max]);
		System.out.println("Min : "+a[min]);
	}
	public static void displayMaxAVG(double[] a,double avg) {
		for(int i=0;i<a.length;i++) {
			if(a[i]>avg) {
				System.out.println(a[i]);
			}
		}
	}
}
