public class IntArray {
	public static void main(String[] args) {
		int[] a = new int[10];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		a[5]=6;
		a[6]=7;
		a[7]=8;
		a[8]=9;
		a[9]=10;
		System.out.print("l to h : ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.print("h to l : ");
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+" ");
		}
	}
}